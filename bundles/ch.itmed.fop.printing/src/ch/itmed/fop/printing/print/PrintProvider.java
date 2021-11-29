/*******************************************************************************
 * Copyright (c) 2019 IT-Med AG <info@it-med-ag.ch>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IT-Med AG <info@it-med-ag.ch> - initial implementation
 ******************************************************************************/

package ch.itmed.fop.printing.print;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.apache.fop.render.print.PageableRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.elexis.core.utils.CoreUtil;
import ch.itmed.fop.printing.xml.documents.FoTransformer;

public final class PrintProvider {
	private static Logger logger = LoggerFactory.getLogger(PrintProvider.class);

	private static DocPrintJob createDocPrintJob(String printerName) {
		PrintService[] services = PrintServiceLookup.lookupPrintServices(DocFlavor.SERVICE_FORMATTED.PAGEABLE, null);

		for (PrintService printer : services) {
			if (printer.getName().equals(printerName)) {
				return printer.createPrintJob();
			}
		}
		return null;
	}

	/**
	 * Prints the documents.
	 * 
	 * @param foStream
	 * @param printerName
	 * @throws IOException
	 * @throws FOPException
	 * @throws TransformerException
	 * @throws PrintException
	 */
	public static void print(InputStream foStream, String printerName)
			throws IOException, FOPException, TransformerException, PrintException {
		// always try to use printing via pdf
		if (createPdfPrintJob(printerName) != null) {
			logger.info("Using fo pdf printing with printer [" + printerName + "]");
			printPdf(foStream, printerName);
			return;
		}
		logger.info("Using fo javax printing with printer [" + printerName + "]");
		
		// Make sure that the position of the marker is not at the end of stream
		foStream.reset();

		FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
		DocPrintJob printJob = createDocPrintJob(printerName);
		FOUserAgent userAgent = fopFactory.newFOUserAgent();
		PageableRenderer renderer = new PageableRenderer(userAgent);

		userAgent.setRendererOverride(renderer);
		// Construct FOP with desired output format
		Fop fop = fopFactory.newFop(userAgent);

		// Setup JAXP using identity transformer
		TransformerFactory factory = TransformerFactory.newInstance();
		// identity transformer
		Transformer transformer = factory.newTransformer();

		// Setup input stream
		Source src = new StreamSource(foStream);

		// Resulting SAX events (the generated FO) must be piped through to FOP
		Result res = new SAXResult(fop.getDefaultHandler());

		// Start XSLT transformation and FOP processing
		transformer.transform(src, res);

		Doc doc = new SimpleDoc(renderer, DocFlavor.SERVICE_FORMATTED.PAGEABLE, null);
		printJob.print(doc, null);
		logger.info("Print job sent to printer: " + printerName);
	}
	
	private static DocPrintJob createPdfPrintJob(String printerName){
		PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
		for (PrintService printer : services) {
			if (printer.getName().equals(printerName)) {
				if (printer.isDocFlavorSupported(DocFlavor.INPUT_STREAM.PDF)
					|| printer.isDocFlavorSupported(DocFlavor.INPUT_STREAM.AUTOSENSE)) {
					return printer.createPrintJob();
				}
			}
		}
		return null;
	}
	
	public static void printPdf(InputStream foStream, String printerName)
		throws IOException, FOPException, TransformerException, PrintException{
		// Make sure that the position of the marker is not at the end of stream
		foStream.reset();
		ByteArrayOutputStream pdfStream = new ByteArrayOutputStream();
		
		FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
		FOUserAgent userAgent = fopFactory.newFOUserAgent();
		// Construct FOP with desired output format
		Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, userAgent, pdfStream);
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		
		// Setup input stream
		Source src = new StreamSource(foStream);
		
		// Resulting SAX events (the generated FO) must be piped through to FOP
		Result res = new SAXResult(fop.getDefaultHandler());
		
		// Start XSLT transformation and FOP processing
		transformer.transform(src, res);
		
		if (System.getProperty(FoTransformer.DEBUG_MODE) != null) {
			File userDir = CoreUtil.getWritableUserDir();
			File xmlOutput = new File(userDir, "medi-print_debug.pdf");
			try (FileOutputStream fo = new FileOutputStream(xmlOutput)) {
				fo.write(pdfStream.toByteArray());
			} catch (IOException e) {
				LoggerFactory.getLogger(PrintProvider.class)
					.error("Could not write medi-print debug pdf", e);
			}
		}
		
		// print pdf
		DocPrintJob printJob = createPdfPrintJob(printerName);
		if (printJob != null) {
			if (printJob.getPrintService().isDocFlavorSupported(DocFlavor.INPUT_STREAM.AUTOSENSE)) {
				Doc doc = new SimpleDoc(new ByteArrayInputStream(pdfStream.toByteArray()),
					DocFlavor.INPUT_STREAM.AUTOSENSE, null);
				printJob.print(doc, null);
			} else if (printJob.getPrintService()
				.isDocFlavorSupported(DocFlavor.INPUT_STREAM.PDF)) {
				Doc doc = new SimpleDoc(new ByteArrayInputStream(pdfStream.toByteArray()),
					DocFlavor.INPUT_STREAM.PDF, null);
				printJob.print(doc, null);
			}
		}
	}
}
