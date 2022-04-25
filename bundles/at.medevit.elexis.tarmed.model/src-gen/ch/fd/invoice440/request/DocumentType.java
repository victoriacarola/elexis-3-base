//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.18 at 03:48:09 PM CET 
//


package ch.fd.invoice440.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="base64" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/choice>
 *       &lt;attribute name="filename" use="required" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_255" />
 *       &lt;attribute name="mimeType" use="required" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" />
 *       &lt;attribute name="viewer" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentType", propOrder = {
    "base64",
    "url"
})
public class DocumentType {

    protected byte[] base64;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "filename", required = true)
    protected String filename;
    @XmlAttribute(name = "mimeType", required = true)
    protected String mimeType;
    @XmlAttribute(name = "viewer")
    @XmlSchemaType(name = "anyURI")
    protected String viewer;

    /**
     * Gets the value of the base64 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64() {
        return base64;
    }

    /**
     * Sets the value of the base64 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64(byte[] value) {
        this.base64 = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the viewer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewer() {
        return viewer;
    }

    /**
     * Sets the value of the viewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewer(String value) {
        this.viewer = value;
    }

}
