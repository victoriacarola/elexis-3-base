/*******************************************************************************
 * Copyright (c) 2007, G. Weirich and Elexis
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    G. Weirich - initial implementation
 *
 *******************************************************************************/
package ch.elexis.dialogs;

import static ch.elexis.agenda.text.AgendaTextTemplateRequirement.TT_AGENDA_LIST;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import ch.elexis.agenda.data.IPlannable;
import ch.elexis.agenda.data.Termin;
import ch.elexis.agenda.util.Plannables;
import ch.elexis.core.data.activator.CoreHub;
import ch.elexis.core.data.events.ElexisEventDispatcher;
import ch.elexis.core.ui.text.ITextPlugin.ICallback;
import ch.elexis.core.ui.text.TextContainer;
import ch.elexis.core.ui.util.SWTHelper;
import ch.elexis.data.Brief;
import ch.elexis.data.Patient;

public class TerminListeDruckenDialog extends TitleAreaDialog implements ICallback {
	IPlannable[] liste;

	public TerminListeDruckenDialog(Shell shell, IPlannable[] liste) {
		super(shell);
		this.liste = liste;
		// use first appointment for day and section reference
		if (liste != null && liste.length > 0) {
			Termin termin = (Termin) liste[0];
			ElexisEventDispatcher.fireSelectionEvent(termin);
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite ret = new Composite(parent, SWT.NONE);
		ret.setLayout(new FillLayout());
		ret.setLayoutData(SWTHelper.getFillGridData(1, true, 1, true));
		TextContainer text = new TextContainer(getShell());
		text.getPlugin().createContainer(ret, this);
		text.getPlugin().showMenu(false);
		text.getPlugin().showToolbar(false);
		text.createFromTemplateName(null, TT_AGENDA_LIST, Brief.UNKNOWN, CoreHub.getLoggedInContact(), "Agenda");
		String[][] termine = new String[liste.length + 1][5];
		termine[0] = new String[] { "von", "bis", "Typ", "Name", "Grund" };
		for (int i = 1; i < liste.length; i++) {
			termine[i][0] = Plannables.getStartTimeAsString(liste[i - 1]);
			termine[i][1] = Plannables.getEndTimeAsString(liste[i - 1]);
			termine[i][2] = liste[i - 1].getType();
			Patient pat = Patient.load(liste[i - 1].getText());
			String patCode = StringUtils.EMPTY;
			if (pat.exists()) {
				patCode = ", Id: " + pat.getPatCode();
			}
			termine[i][3] = liste[i - 1].getTitle() + patCode;
			termine[i][4] = liste[i - 1].getReason();
		}

		text.getPlugin().setFont("Helvetica", SWT.NORMAL, 9);
		text.getPlugin().insertTable("[Termine]", 0, termine, new int[] { 15, 15, 20, 50, 20 });
		return ret;
	}

	@Override
	public void create() {
		super.create();
		setMessage("Terminliste ausdrucken");
		setTitle("Terminliste");
		getShell().setText("Agenda");
		getShell().setSize(800, 700);

	}

	@Override
	protected void okPressed() {
		super.okPressed();
	}

	public void save() {
	}

	public boolean saveAs() {
		return false;
	}
}
