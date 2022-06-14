package de.validas.spedit.ui.editor.property;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.OutlineWithEditorLinker;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.validas.nlx.view.fxviews.views.ISemanticViewSelector;
import de.validas.spedit.ui.editor.NaturalLangEditor;
import de.validas.spedit.ui.editor.NaturalLangPropertySheetPage;

public class NlxOutlineWithEditorLinker extends OutlineWithEditorLinker {

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.outline.actions.OutlineWithEditorLinker#selectInTreeView(org.eclipse.jface.viewers.ISelection)
	 */
	
	@Inject
	protected IPropertySourceProvider adapterFactory;
	
	@Inject(optional = true)
	private Provider<IPropertySheetPage> propertySheetProvider;

	@Override
	protected void selectInTreeView(ISelection selection) {
		
		Object part = outlinePage.getSite().getPage().getActivePart();

		
		if (selection instanceof ITextSelection && !treeViewer.getTree().isDisposed()) {
			ITextSelection textSelection = (ITextSelection) selection;
			ITextRegion selectedTextRegion = new TextRegion(textSelection.getOffset(), textSelection.getLength());
			Object input = treeViewer.getInput();
			if (input instanceof IOutlineNode) {
				try {
					IOutlineNode nodeToBeSelected = findBestNode((IOutlineNode) input, selectedTextRegion);
					if (nodeToBeSelected != null) {
						StructuredSelection sel = new StructuredSelection(nodeToBeSelected);
						treeViewer.setSelection(sel);
						if (part instanceof XtextEditor) {
							IPropertySheetPage page = ((NaturalLangEditor)part).getPropertySheetPage();
								page.selectionChanged((IWorkbenchPart) part, sel);
							ISemanticViewSelector trainerPage = ((NaturalLangEditor)part).getSemanticViewSelector();
								trainerPage.selectionChanged((IWorkbenchPart) part, sel);
						}
						// else:? what if part is not Editor???
					}
				} catch(Exception exc) {
					// ignore, editor can have a different state than the tree
					exc.printStackTrace();
				}
			}
		}
	}
	
	

}
