/**
 * 
 */
package de.validas.spedit.ui.editor;

import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.editors.text.TextEditorActionContributor;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.ui.views.properties.IPropertySheetPage;

/**
 * @author Felix Schaller
 *
 */
public class NaturalLangActionBarContributor extends TextEditorActionContributor {

	protected DeleteAction deleteAction;

	/**
	 * This is the action used to implement cut.
	 */
	protected CutAction cutAction;

	/**
	 * This is the action used to implement copy.
	 */
	protected CopyAction copyAction;

	/**
	 * This is the action used to implement paste.
	 */
	protected PasteAction pasteAction;

	/**
	 * This is the action used to implement undo.
	 */
	protected UndoAction undoAction;

	/**
	 * This is the action used to implement redo.
	 */
	protected RedoAction redoAction;

	/**
	 * 
	 */
	public NaturalLangActionBarContributor() {
		super();
	}



	public void shareGlobalActions(NaturalLangPropertySheetPage naturalLangPropertySheetPage, IActionBars actionBars) {
		if (!(naturalLangPropertySheetPage instanceof IPropertySheetPage)) {
			actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteAction);
			actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(), cutAction);
			actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copyAction);
			actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(), pasteAction);
		}
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
	}

	public void init(IActionBars actionBars) {
		super.init(actionBars);
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();

		deleteAction = createDeleteAction();
		deleteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteAction);

		cutAction = createCutAction();
		cutAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));
		actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(), cutAction);

		copyAction = createCopyAction();
		copyAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
		actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copyAction);

		pasteAction = createPasteAction();
		pasteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));
		actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(), pasteAction);

		undoAction = createUndoAction();
		undoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);

		redoAction = createRedoAction();
		redoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
	}

	/**
	 * Returns the action used to implement delete.
	 * 
	 * @see #deleteAction
	 * @since 2.6
	 */
	protected DeleteAction createDeleteAction() {
		return new DeleteAction(removeAllReferencesOnDelete());
	}

	/**
	 * Returns the action used to implement cut.
	 * 
	 * @see #cutAction
	 * @since 2.6
	 */
	protected CutAction createCutAction() {
		return new CutAction();
	}

	/**
	 * Returns the action used to implement copy.
	 * 
	 * @see #copyAction
	 * @since 2.6
	 */
	protected CopyAction createCopyAction() {
		return new CopyAction();
	}

	/**
	 * Returns the action used to implement paste.
	 * 
	 * @see #pasteAction
	 * @since 2.6
	 */
	protected PasteAction createPasteAction() {
		return new PasteAction();
	}

	/**
	 * Returns the action used to implement undo.
	 * 
	 * @see #undoAction
	 * @since 2.6
	 */
	protected UndoAction createUndoAction() {
		return new UndoAction();
	}

	/**
	 * Returns the action used to implement redo.
	 * 
	 * @see #redoAction
	 * @since 2.6
	 */
	protected RedoAction createRedoAction() {
		return new RedoAction();
	}

	protected boolean removeAllReferencesOnDelete() {
		return false;
	}

}
