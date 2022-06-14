/**
 * 
 */
package de.validas.nlx.view.fxviews.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPart;

import de.validas.nlx.dictionary.IDictionaryAccess;

/**
 * @author schaller
 *
 */
public interface ISemanticViewSelector {

	void setSelectionToViewer(List<?> selection);

	void setActionBars(IActionBars actionBars);
	
	void selectionChanged(IWorkbenchPart part, ISelection selection);

	void addViewer(ISemanticTrainViewPart myViewPart);
	
	public IDictionaryAccess getDictAccess();

	void removeViewer(ISemanticTrainViewPart myViewPart);

}
