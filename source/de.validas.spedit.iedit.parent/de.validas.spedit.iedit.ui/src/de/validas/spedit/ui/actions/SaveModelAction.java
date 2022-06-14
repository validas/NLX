package de.validas.spedit.ui.actions;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public class SaveModelAction implements IObjectActionDelegate {

	private List<EObject> filteredSelection;
	private EditingDomain editingDomain;
	private IWorkbenchPart targetPart;

	@Override
	public void run(IAction action) {
		
		String sPlur = ""; //$NON-NLS-1$
		if (filteredSelection.size() > 1) {
			sPlur = "s"; //$NON-NLS-1$
		}
		final String message = "Do you really want to delete " + filteredSelection.size() + //$NON-NLS-1$
			" selected element" + sPlur + " ?"; //$NON-NLS-1$ //$NON-NLS-2$
		if (MessageDialog.openQuestion(targetPart.getSite().getShell(), "Delete All Selected", message)) { //$NON-NLS-1$
			//editingDomain.getCommandStack().execute(DeleteCommand.create(editingDomain, filteredSelection));
		}
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

		if (!(selection instanceof IStructuredSelection)) {
			action.setEnabled(false);
			return;
		}

		final StructuredSelection structuredSelection = (StructuredSelection) selection;
		filteredSelection = new LinkedList<EObject>();
		for (final Object x : structuredSelection.toList()) {
			if (x instanceof EObject) {
				filteredSelection.add((EObject) x);
			}
		}
		if (filteredSelection.size() > 0) {
			action.setEnabled(true);
		} else {
			action.setEnabled(false);
		}
	}

	private IViewerProvider ivp = null;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		if (targetPart instanceof IEditingDomainProvider) {
			editingDomain = ((IEditingDomainProvider) targetPart).getEditingDomain();
		}
		this.targetPart = targetPart;
		if (targetPart instanceof IViewerProvider) {
			ivp = (IViewerProvider) targetPart;
		}
	}

}
