/** 
 * @author schaller
 * 
 * */
package de.validas.spedit.ui.actions;

import static de.validas.spedit.ui.constants.EditorUiConstants._UI_EDITOR_SAVEAS_OVERWRITE_TITLE;
import static de.validas.spedit.ui.constants.EditorUiConstants._UI_ENCODING;
import static de.validas.spedit.ui.constants.EditorUiConstants._UI_Editor_saveAs_overwrite_message;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.expressions.EvaluationResult;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.editors.text.NLSUtility;
import org.eclipse.ui.internal.handlers.AbstractSaveHandler;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.validas.spedit.ui.editor.NaturalLangEditor;
import de.validas.spedit.ui.editor.model.NlxDocument;

@SuppressWarnings("restriction")
public class SaveModelHandler extends AbstractSaveHandler{
	private NaturalLangEditor editorPart;
	
	public final static String[] filters = new String[] { "NLX Model File (*.nlxm)" };
	public final static String[] extensions = new String[] { "*.nlxm" };

	@Execute
	public Object execute(ExecutionEvent event) {
		ISaveablePart saveablePart = getSaveablePart(event);
		
		// no saveable
		if (saveablePart == null)
			return null;

		// if editor
		if (saveablePart instanceof NaturalLangEditor) {
			editorPart = (NaturalLangEditor) saveablePart;
			
			XtextResource xtextResource = ((NlxDocument) editorPart.getDocument()).readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
		         public XtextResource exec(XtextResource state) throws Exception {
		                 return state;
		                 }
		         });
			ResourceSet resourceSet = xtextResource.getResourceSet();
			Resource res = selectResource(resourceSet);
			performSaveAs(editorPart.getProgressMonitor(), res);
			//IWorkbenchPage page = editorPart.getSite().getPage();
			//page.saveEditor(editorPart, false);
			return null;
		}

		// if view
		IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		WorkbenchPage page = (WorkbenchPage) activePart.getSite().getPage();
		//page.saveSaveable(saveablePart, activePart, false, false);

		return null;
	}
	
	private Resource selectResource(ResourceSet resourceSet) {
		for (Resource res : resourceSet.getResources() ) {
			if (res instanceof LazyLinkingResource) return res;
		}
		return null;
	}

	public Resource createModelResource(URI fileURI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		return resourceSet.createResource(fileURI);
	}
	
	protected void saveModelResource(Resource modelResource) {
		// Save the contents of the resource to the file system.
		//
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, _UI_ENCODING);
		try {
			modelResource.save(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void performSaveAs(IProgressMonitor progressMonitor, Resource resource) {
		Shell shell= PlatformUI.getWorkbench().getModalDialogShellProvider().getShell();
		final IEditorInput input= editorPart.getEditorInput();

//		IDocumentProvider provider= editorPart.getDocumentProvider();
//		final IEditorInput newInput;

		if (input instanceof IFileEditorInput) {
			FileDialog dialog= new FileDialog(shell, SWT.SAVE);
			IPath oldPath= URIUtil.toPath(((IURIEditorInput)input).getURI());
			if (oldPath != null && !oldPath.isEmpty()) {
				String name = oldPath.lastSegment().split("\\.")[0] + ".nlxm";
				dialog.setFilterNames(filters);
				dialog.setFilterExtensions(extensions);
				dialog.setFileName(name);
				dialog.setFilterPath(oldPath.removeLastSegments(1).toOSString());
			}

			String path= dialog.open();
			if (path == null) {
				if (progressMonitor != null)
					progressMonitor.setCanceled(true);
				return;
			}

			// Check whether file exists and if so, confirm overwrite
			final File localFile= new File(path);
			if (localFile.exists()) {
		        MessageDialog overwriteDialog= new MessageDialog(
		        		shell,
		        		_UI_EDITOR_SAVEAS_OVERWRITE_TITLE,
		        		null,
		        		NLSUtility.format(_UI_Editor_saveAs_overwrite_message, path),
		        		MessageDialog.WARNING,
		        		new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL },
		        		1); // 'No' is the default
				if (overwriteDialog.open() != Window.OK) {
					if (progressMonitor != null) {
						progressMonitor.setCanceled(true);
						return;
					}
				}
			}

			Resource output = createModelResource(URI.createFileURI(localFile.getAbsolutePath()));
			output.getContents().addAll(resource.getContents());
			//Resource modelResource = resourceSet.createResource(URI.createFileURI(localFile.getAbsolutePath()));
			saveModelResource(output);
		}

		if (progressMonitor != null)
			progressMonitor.setCanceled(false);
	}
	
	@Override	
	protected EvaluationResult evaluate(IEvaluationContext context) {

//		IWorkbenchWindow window = InternalHandlerUtil.getActiveWorkbenchWindow(context);
//		// no window? not active
//		if (window == null)
//			return EvaluationResult.FALSE;
//		WorkbenchPage page = (WorkbenchPage) window.getActivePage();
//
//		// no page? not active
//		if (page == null)
//			return EvaluationResult.FALSE;
//
//		// get saveable part
		ISaveablePart saveablePart = getSaveablePart(context);
//		if (saveablePart == null)
//			return EvaluationResult.FALSE;
//
//		if (saveablePart instanceof ISaveablesSource) {
//			ISaveablesSource modelSource = (ISaveablesSource) saveablePart;
//			if (SaveableHelper.needsSave(modelSource))
//				return EvaluationResult.TRUE;
//			return EvaluationResult.FALSE;
//		}

		if (saveablePart.isDirty())
			return EvaluationResult.TRUE;

		return EvaluationResult.FALSE;
	}
	
		
}
