/**
 * Editor Extension Class
 * (c) Validas AG 2019
 * Author: Schaller
 */
package de.validas.spedit.ui.editor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

/**
 * @author Felix Schaller
 *
 */
public class NaturalLangPropertySheetPage extends PropertySheetPage {

	IXtextDocument iXtextDocument = null;

	protected List<?> input = Collections.emptyList();

	/**
	 * @param iXtextDocument
	 * 
	 */
	public NaturalLangPropertySheetPage(IXtextDocument iXtextDocument) {
		// TODO Auto-generated constructor stub
		super();
		this.iXtextDocument = iXtextDocument;
	}

	protected void setSelectionToViewer(List<?> selection) {
		// Do nothing.
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			input = ((IStructuredSelection) selection).toList();
		} else if (selection instanceof ITextSelection) {
			List<ISelection> newInput = new ArrayList<ISelection>();
			newInput.add(selection);
			input = newInput;
		} else {
			input = Collections.emptyList();
		}
		super.selectionChanged(part, selection);
	}

}
