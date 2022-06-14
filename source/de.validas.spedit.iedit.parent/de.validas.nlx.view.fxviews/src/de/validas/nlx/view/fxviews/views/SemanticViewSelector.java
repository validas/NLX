/**
 * 
 */
package de.validas.nlx.view.fxviews.views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.util.concurrent.Service.State;

import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.view.fxviews.access.ContextData;
import de.validas.nlx.view.fxviews.access.EObjectPanelAccessor;
import de.validas.nlx.view.fxviews.access.IPanelsAccessor;
import de.validas.nlx.view.fxviews.access.ListPanelAccessor;
import de.validas.nlx.view.fxviews.control.SemanticFxViewController;
import de.validas.nlx.view.fxviews.views.SemanticFxViewPart.UpdateDelegate;
import de.validas.nlx.view.fxviews.views.SemanticFxViewPart.UpdateTask;
import de.validas.spedit.naturalLang.BracketSentence;
import de.validas.spedit.naturalLang.FreeSentence;
import de.validas.spedit.naturalLang.Sentence;
import de.validas.spedit.naturalLang.SentenceChain;
import de.validas.spedit.presets.NlxDictConstants;
import de.validas.utils.data.types.XPair;

/**
 * @author schaller
 * manages the selection from the text editor to trigger the node spawning
 */
public class SemanticViewSelector implements ISemanticViewSelector, IAdaptable, ISelectionListener {

	protected IWorkbenchPart viewer;

	// TODO: maybe get from View via getter
	// TODO: Confusing use across other classes
	protected List<String> wordTypes = NlxDictConstants.getAllTypes();
	protected SemanticFxViewController controller;
	protected IDictionaryAccess dictAccess;

	/**
	 * @param dictAcc 
	 * 
	 */
	public SemanticViewSelector(IDictionaryAccess dictAcc) {
		this.dictAccess = dictAcc;
	}
	
	/**
	 * selection handler
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection sel) {
		if (sel instanceof IStructuredSelection) {
			// TODO: 11.02.22 check if this is necessary to force viwer assignment 
			IWorkbenchPart foundView = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("de.validas.nlx.view.fxviews.views.SemanticFxViewPart");
			if (viewer == null)
				viewer = foundView;
			
			if (viewer != null) {
				
				Object element = ((IStructuredSelection)sel).getFirstElement();  
				IPanelsAccessor panelsAccessor = null;
				
				if (element instanceof EObjectNode) { 
					IXtextDocument document = ((EObjectNode) element).getDocument();
					XtextResource resource = document.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
				         public XtextResource exec(XtextResource state) throws Exception {
				                 return state;
				                 }
				         });
					
					//EObject test = resource.getResourceSet().getEObject(((EObjectNode) element).getEObjectURI(), true);
					EObject attachedEObject = ((EObjectNode) element).getEObject(resource);
					
					panelsAccessor = new EObjectPanelAccessor(findSentenceObject(attachedEObject), dictAccess); 
					
				} else {
					List<String> demoList = new ArrayList<>();
					panelsAccessor = new ListPanelAccessor(wordTypes, demoList);
				}
				controller = ((ISemanticTrainViewPart)viewer).getCanvasController();
				if (controller != null) {
					UpdateTask<Boolean> task = ((ISemanticTrainViewPart)viewer).getCreatePanelsTask();
					task.setAccessor(panelsAccessor);
					task.setDelegate((v1,v2) -> {
						((ISemanticTrainViewPart)viewer).setPanelStack(v1,v2);
					});
					Thread bgThread = ((ISemanticTrainViewPart)viewer).getBackgroundThread();
					if (bgThread == null || bgThread.getState() == Thread.State.TERMINATED) {
						bgThread = new Thread(task);
						bgThread.setName("NLX BackgroundThread");
						bgThread.setDaemon(true);
						bgThread.start();
						((ISemanticTrainViewPart)viewer).setBackgroundThread(bgThread);
					} else {
						Object lock = ((ISemanticTrainViewPart)viewer).getBgThreadName();
						synchronized(lock) {
							lock.notifyAll();
						}
					}
					
				}
			}
		}

	}

	// see: org.eclipse.ui.views.properties.PropertySheetPage.getAdapter(Class<T>)
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		return null;
	}

	//****************************
	@Override
	public void setSelectionToViewer(List<?> selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setActionBars(IActionBars actionBars) {
		// TODO Auto-generated method stub

	}

	protected void setFocus() {
		// TODO Auto-generated method stub

	}
	//*******************
	

	/**
	 * looks downwards the hierarchy to find containing sentence. if hierarchy is
	 * lower than sentence, null will be returned
	 * 
	 * @param attachedEObject
	 * @return
	 */
	protected XPair<EList<FreeSentence>, ContextData> findSentenceObject(EObject attachedEObject) {
		EObject currentObj = attachedEObject;
		EObject parent = null;
		if (currentObj == null)
			return null;
		do {
			parent = currentObj.eContainer();
			if (parent instanceof Sentence)
				return createSentenceContext(new BasicEList<FreeSentence>(Collections.singletonList((Sentence) parent)));
			currentObj = parent;
		} while (parent != null);
		return null;

	}
	
	/**
	 * creates context for sentence.
	 * NOTE: [29.03.22] this should be provisional unless structure is not embedded in a bigger context of the document object model (DOM)
	 * @param sentence
	 * @return
	 */
	public static XPair<EList<FreeSentence>, ContextData> createSentenceContext(EList<FreeSentence> sentences) {
		if (sentences.size() <= 0)
			return null;
		EObject parent = sentences.get(0).eContainer();
		
		if (parent instanceof SentenceChain) {
			int pos = 0;
			for (EObject sent : ((SentenceChain)parent).getSentences()) {
				if (sent == sentences.get(0)) break;
				pos++;
			}
			return new XPair<EList<FreeSentence>, ContextData>(sentences, new ContextData(pos, ((SentenceChain) parent).getSeparators(), null, ((SentenceChain) parent).getEndpoint()));
		} else if (parent instanceof BracketSentence) {
			int pos = 0;
			for (EObject sent : ((BracketSentence)parent).getBrackedSentences()) {
				if (sent == sentences.get(0)) break;
				pos++;
			}
			return new XPair<EList<FreeSentence>, ContextData>(sentences, new ContextData(pos, ((BracketSentence)parent).getSeparator(), ((BracketSentence)parent).getOpen(), ((BracketSentence)parent).getClose()));
		}
		return null;
	}

	@Override
	public void addViewer(ISemanticTrainViewPart viewPart) {
		this.viewer = viewPart;

	}

	/**
	 * @return the dictAccess
	 */
	public IDictionaryAccess getDictAccess() {
		return dictAccess;
	}

	@Override
	public void removeViewer(ISemanticTrainViewPart myViewPart) {
		this.viewer = null;
	}

}
