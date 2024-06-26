/*******************************************************************************
 * Copyright (c) 2014 MEDEVIT.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     T. Huster - initial API and implementation
 *******************************************************************************/
package at.medevit.elexis.outbox.ui.part.provider;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import at.medevit.elexis.outbox.model.IOutboxElement;
import at.medevit.elexis.outbox.ui.part.model.PatientOutboxElements;
import ch.elexis.core.model.IPatient;
import ch.elexis.core.types.Gender;
import ch.elexis.core.ui.icons.Images;

public class OutboxElementLabelProvider extends LabelProvider implements IColorProvider {

	private OutboxElementUiExtension extension;

	public OutboxElementLabelProvider() {
		extension = new OutboxElementUiExtension();
	}

	@Override
	public String getText(Object element) {
		if (element instanceof PatientOutboxElements) {
			return ((PatientOutboxElements) element).toString();
		} else if (element instanceof IOutboxElement) {
			String text = extension.getText((IOutboxElement) element);
			if (text != null) {
				return text;
			} else {
				return "unbekannt";
			}
		}
		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof PatientOutboxElements) {
			IPatient pat = ((PatientOutboxElements) element).getPatient();
			if (pat != null) {
				if (pat.getGender().equals(Gender.MALE)) {
					return Images.IMG_MANN.getImage();
				} else {
					return Images.IMG_FRAU.getImage();
				}
			} else {
				return Images.IMG_QUESTION_MARK.getImage();
			}
		} else if (element instanceof IOutboxElement) {
			Image image = extension.getImage((IOutboxElement) element);
			if (image != null) {
				return image;
			} else {
				return Images.IMG_QUESTION_MARK.getImage();
			}
		}
		return null;
	}

	public Color getForeground(Object element) {
		if (element instanceof IOutboxElement) {
			Color color = extension.getForeground((IOutboxElement) element);
			if (color != null) {
				return color;
			}
		}
		return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
	}

	public Color getBackground(Object element) {
		if (element instanceof IOutboxElement) {
			Color color = extension.getBackground((IOutboxElement) element);
			if (color != null) {
				return color;
			}
		}
		return Display.getCurrent().getSystemColor(SWT.COLOR_WHITE);
	}
}