/**
 * SemanticFxViewPart. View Part Class for JavaFX view editing the grammar training.
 * (c) 2020 felixschaller.com and sub brands
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * www.felixschaller.com
 * @author Felix Schaller
 */

package de.validas.nlx.view.fxviews.views;

import static de.validas.nlx.dictionary.constants.NodeConstants._DICTIONARY;
import static de.validas.nlx.dictionary.constants.NodeConstants._WORD_CLASS;
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants.FXML_DESCR_FILE;
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants.NLX_BACKGROUND_THREAD;

import java.io.IOException;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.fx.ui.workbench3.FXViewPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.WorkbenchPlugin;

import com.google.inject.Inject;

import de.validas.nlx.constants.Direction;
import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.dictionary.type.ITypeHierarchy;
import de.validas.nlx.dictionary.util.LogUtils;
import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.access.IPanelsAccessor;
import de.validas.nlx.view.fxviews.access.ListPanelAccessor;
import de.validas.nlx.view.fxviews.access.elements.SmallItem;
import de.validas.nlx.view.fxviews.cache.INodeCacheManager;
import de.validas.nlx.view.fxviews.cache.NodeCacheManager;
import de.validas.nlx.view.fxviews.control.IController;
import de.validas.nlx.view.fxviews.control.IDragController;
import de.validas.nlx.view.fxviews.control.PanelObjController;
import de.validas.nlx.view.fxviews.control.PanelsDragController;
import de.validas.nlx.view.fxviews.control.SemanticFxViewController;
import de.validas.nlx.view.fxviews.control.SmallPanelObjController;
import de.validas.nlx.view.fxviews.semantics.ILink;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.ILinkable;
import de.validas.nlx.view.fxviews.semantics.IListener;
import de.validas.nlx.view.fxviews.semantics.Intermediate;
import de.validas.nlx.view.fxviews.semantics.LinkProcessor;
import de.validas.nlx.view.fxviews.semantics.util.LinkUtils;
import de.validas.nlx.view.fxviews.semantics.SemanticLinkListener;
import de.validas.nlx.view.fxviews.semantics.SemanticLinker;
import de.validas.nlx.view.fxviews.util.CachingFXMLClassLoader;
import de.validas.nlx.view.fxviews.visual.IPanel;
import de.validas.nlx.view.fxviews.visual.NodePanel;
import de.validas.nlx.view.fxviews.visual.NodePanelFactory;
import de.validas.utils.data.lists.IAppendable;
import de.validas.utils.data.lists.LinkedList;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

@SuppressWarnings("restriction")
public class SemanticFxViewPart extends FXViewPart
		implements IPartListener, ISelectionListener, ISemanticTrainViewPart, IPanelContainer {

	protected static final List<String> DEFAULT_ACCESSOR_MSG = new ArrayList<>(
			Arrays.asList("Please", "Select", "a", "Sentence"));

	protected static final IPanelsAccessor DEFAULT_ACCESSOR = 
			new ListPanelAccessor(null, DEFAULT_ACCESSOR_MSG);
	
	
	protected SemanticFxViewController controller;
	protected PanelObjController panelCtrl;
	protected IPanelsAccessor accessor = DEFAULT_ACCESSOR;
	
	//TODO: consider to replace panelChain and behavior in an own Class for the future:
	protected LinkedList<ILinkObj> panelChain;
	protected FXMLLoader loader;
	protected FXMLLoader panel_loader;

	protected IDragController dragController;
	protected ISemanticViewSelector selectionController;

	protected SemanticLinker semanticLinker;
	protected IListener linkListener;
	protected IDictionaryAccess dictAccess;
	protected LinkProcessor processor;
	protected NodePanelFactory nodePanelFactory;
	protected List<ITypeHierarchy> typeHierarchy;
	private boolean changed = true;
	private String bgThreadName = NLX_BACKGROUND_THREAD;

	// @Inject  TODO: inject does not work here, because this class has no dependency to to the UI module
	protected INodeCacheManager cacheManager;
	private List<ILink> linkBuffer;
	
	protected UpdateTask<Boolean> createPanelsTask = new UpdateTask<Boolean>(bgThreadName); 
	private Thread backgroundThread;
	
	interface UpdateMessage {
		void update (Integer progress, String message, Boolean display);
	}
	
	interface UpdateDelegate {
		void call (IPanelsAccessor accessor, UpdateMessage msg);
	}
	
	@SuppressWarnings("unchecked")
	class UpdateTask<V extends Boolean> extends Task<V>{
	    
		
		UpdateMessage update = (Integer progress, String message, Boolean display) -> {
			if (progress != null)
				updateProgress(progress, 100);
			if (message != null)
				updateMessage(message);
			if (display != null)
				updateValue((V) display);
		};
		private IPanelsAccessor panelsAccessor;
		private UpdateDelegate delegate;
		private Object lock;
		
		UpdateTask(Object lock){
			this.lock = lock;
		}
		
		@Override
	    public V call() {
	    	if (panelsAccessor != null && delegate != null)
	    		while(!isCancelled()) {
	    			try {
	    				delegate.call(panelsAccessor, update);
					} catch (Exception e) {
						e.printStackTrace();
					}
	    			try {
	    				synchronized(lock) {
	    					lock.wait();
	    				}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	    		}
	    	else 
	    		return (V) Boolean.FALSE;
	    	return (V) Boolean.TRUE;
	    }	
	    
	    void setAccessor(IPanelsAccessor panelsAccessor){
	    	this.panelsAccessor = panelsAccessor;
	    }
	    
	    void setDelegate(UpdateDelegate delegate) {
	    	this.delegate =  delegate;
	    }

		public UpdateDelegate getDelegate() {
			return delegate;
		}

		UpdateMessage getUpdateMessage() {
	    	return update;
	    }
	    
	};
	
	// #Options
	boolean postprocess = true;
	
	/**
	 * @return the postprocess
	 */
	public boolean isPostprocess() {
		return postprocess;
	}

	@Inject
	private LogUtils logUtil;
	
	public static ClassLoader cachingClassLoader = new CachingFXMLClassLoader(FXMLLoader.getDefaultClassLoader()); 
	

	/**
	 * Constructor
	 */
	public SemanticFxViewPart() {

		dragController = new PanelsDragController();
		semanticLinker = new SemanticLinker();
		nodePanelFactory = new NodePanelFactory(this, dragController);
		cacheManager = new NodeCacheManager();
	}

	private IPartListener2 partListener = new IPartListener2() {
		
		@Override
		public void partActivated(IWorkbenchPartReference partRef) {
			if (partRef == null) {
				 WorkbenchPlugin.log("partRef is null in PageBookView partActivated");
				 //$NON-NLS-1$
				return;
			}
			IWorkbenchPart part = partRef.getPart(false);
			SemanticFxViewPart.this.partActivated(part);
			if (changed) {
				update(accessor);
				
			}
		}

		// TODO: check if these methods below are really neccessary??
		@Override
		public void partBroughtToTop(IWorkbenchPartReference partRef) {
			SemanticFxViewPart.this.partBroughtToTop(partRef.getPart(false));
//			if (logUtil != null)
//				logUtil.logAccess("debug", 0, "partBroughtToTop");
		}

		@Override
		public void partClosed(IWorkbenchPartReference partRef) {
			SemanticFxViewPart.this.partClosed(partRef.getPart(false));
		}

		@Override
		public void partDeactivated(IWorkbenchPartReference partRef) {
			SemanticFxViewPart.this.partDeactivated(partRef.getPart(false));
		}

		@Override
		public void partHidden(IWorkbenchPartReference partRef) {
			SemanticFxViewPart.this.partHidden(partRef.getPart(false));
		}

		@Override
		public void partInputChanged(IWorkbenchPartReference partRef) {
		}

		@Override
		public void partOpened(IWorkbenchPartReference partRef) {
			SemanticFxViewPart.this.partOpened(partRef.getPart(false));
		}

		@Override
		public void partVisible(IWorkbenchPartReference partRef) {
			SemanticFxViewPart.this.partVisible(partRef.getPart(false));
		}
	};

	

	@Override
	public void createPartControl(Composite parent) {
		getSite().getPage().addPartListener(partListener);
		super.createPartControl(parent);
	}
	

	protected void update(IPanelsAccessor accessor2) {
		createPanelsTask.setAccessor(accessor);
		createPanelsTask.setDelegate((v1,v2) -> {
			createPanels(v1,v2);
		});
		if (backgroundThread == null) {
			backgroundThread = new Thread(createPanelsTask);
			backgroundThread.setName("NLX BackgroundThread");
			backgroundThread.setDaemon(true);
			backgroundThread.start();
		} else {
			if (!(backgroundThread.getState().equals(State.TIMED_WAITING) || backgroundThread.getState().equals(State.WAITING))) {
				Platform.runLater(()->{
					wakeupBgThread();
				});
			}else 
				wakeupBgThread();
		}
		controller.getScrollpane().layout();
	}

	private void wakeupBgThread() {
		synchronized(bgThreadName) {
			bgThreadName.notifyAll();
		}
	}


	@Override
	public void init(IViewSite site) throws PartInitException {
		site.getPage().addPostSelectionListener(this);
		super.init(site);
	}
	
	static void clipChildren(Region region) {

	    final Rectangle outputClip = new Rectangle();
	    region.setClip(outputClip);

	    region.layoutBoundsProperty().addListener((ov, oldValue, newValue) -> {
	        outputClip.setWidth(newValue.getWidth());
	        outputClip.setHeight(newValue.getHeight());
	    });        
	}

	@Override
	protected Scene createFxScene() {

		Parent pane;
		try {

			loader = new FXMLLoader(getClass().getResource(FXML_DESCR_FILE));
			loader.setClassLoader(cachingClassLoader);
			pane = loader.load();
			controller = loader.getController();
			linkListener = new SemanticLinkListener(this); 
			
			clipChildren(controller.getScrollpane());
			controller.getIndicator().progressProperty().bind(createPanelsTask.progressProperty());
			controller.getStatusMessage().textProperty().bind(createPanelsTask.messageProperty());
			controller.getOverlayPane().visibleProperty().bind(createPanelsTask.valueProperty());

			update(accessor);
			changed = false;
			
			return new Scene(pane, Color.LIGHTGREY);
		} catch (IOException e) {
			e.printStackTrace();
			if (logUtil != null)
				logUtil.logAccess("LoadFXML", 0, String.format("loading of %s failed", FXML_DESCR_FILE));
			else
				Logger.getLogger(SemanticFxViewPart.class.getName()).log(Level.SEVERE,
					String.format("loading of %s failed", FXML_DESCR_FILE), e);	
		}
		return null;
	}
	
	@Override
	public void setPanelStack(IPanelsAccessor panelsAccessor,  UpdateMessage updateMSG) {
		this.accessor = panelsAccessor; 
		this.changed = true;
		updateMSG.update(0, "selectionChanged, click here to refresh", true);
	}
	
	@Override
	public void createPanels(IPanelsAccessor accessor, UpdateMessage updateMSG) {
		updateMSG.update(1, "create Containers...", true);
		
		ObservableList<Node> childContainter = controller.getPanelStack().getChildren();
		Platform.runLater(()->{
			childContainter.clear(); //TODO: 14.02.2022 must be on application Thread
		});
		panelChain = new LinkedList<>();
		
		for (int i = 0; i < accessor.size(); i++) {
			
			IPanel nodePanel;
			IItem token = accessor.getToken(i);
			
				nodePanel = nodePanelFactory.create(token, accessor, linkListener, i, childContainter); //TODO: 14.02.2022 must be on application Thread
				//nodePanel.configure(accessor, i);
			
			panelChain.add(nodePanel);
			
			updateMSG.update((int)Math.round(50*(i/accessor.size())), null, null);
		}
	
		updateMSG.update(50, "create GrammarLinks...", null);

		if (panelChain != null && processor != null && !panelChain.isEmpty() && dictAccess.getDbAccessor() != null) {
			linkListener.setPanelChain(panelChain);
			semanticLinker.setListener(linkListener);
			if (panelChain.get(0) instanceof ILinkable) {
				try {
					processor.evaluateNext((ILinkable)panelChain.get(0));
					updateMSG.update(80, "postprocess Grammar...", null);
					
					for (ILinkObj panel : panelChain)
						if (postprocess) processor.postProcess(panel);
					ILinkObj start = panelChain.get(0);
					while (start.getToken() instanceof SmallItem)
						start = (ILinkObj) start.getSuccessor();
					if (start != null)
						LinkUtils.autoRoute(start);
				} catch (Exception e) {
					e.printStackTrace();
				}
				updateMSG.update(100, null, null);
				
			}
		}
		updateMSG.update(null, null, false);
		changed = false;
		Platform.runLater(()->{
				synchronized(this) {
					linkListener.update();
				}
		});
		
	}

	/**
	 * @return the createPanelsTask
	 */
	@Override
	public UpdateTask<Boolean> getCreatePanelsTask() {
		return createPanelsTask;
	}

	/**
	 * @return the bgThreadName
	 */
	public String getBgThreadName() {
		return bgThreadName;
	}

	/**
	 * @return the backgroundThread
	 */
	@Override
	public Thread getBackgroundThread() {
		return backgroundThread;
	}

	/**
	 * @param backgroundThread the backgroundThread to set
	 */
	@Override
	public void setBackgroundThread(Thread backgroundThread) {
		this.backgroundThread = backgroundThread;
	}

	/**
	 * @return the panelChain
	 */
	public LinkedList<ILinkObj> getPanelChain() {
		return panelChain;
	}

	/**
	 * @return the controller
	 */
	public SemanticFxViewController getCanvasController() {
		return controller;
	}

	/**
	 * @return the dragController
	 */
	public IDragController getDragController() {
		return dragController;
	}

	/**
	 * @return the dictAccess
	 */
	public IDictionaryAccess getDictAccess() {
		return dictAccess;
	}

	@Override
	public void partActivated(IWorkbenchPart part) {
		selectionController = Adapters.adapt(part, ISemanticViewSelector.class);
		if (selectionController != null) {
			selectionController.addViewer(this);
			dictAccess = selectionController.getDictAccess();
			if (dictAccess != null) {
				if (logUtil == null)
					logUtil = new LogUtils(dictAccess.getLogger());
				//TODO: cache once
				typeHierarchy = dictAccess.resolveTypeHierarchy(_DICTIONARY, _WORD_CLASS);
			}
			processor = new LinkProcessor(dictAccess, semanticLinker, cacheManager); //TODO: consider singleton instance
		}
	}

	@Override
	protected void setFxFocus() {
//		if (logUtil != null)
//			logUtil.logAccess("debug", 0, "[DEBUG]: setFxFocus()");
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
//		if (logUtil != null)
//		logUtil.logAccess("debug", 0, "partBrought to Top");

	}

	@Override
	public void partClosed(IWorkbenchPart part) {
//				TODO: 11.02.22 deactivate trainer if closed
//		if (logUtil != null)
//			logUtil.logAccess("debug", 0, "part Closed");
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
		if (selectionController!=null)
			selectionController.removeViewer(this);
//		if (logUtil != null)
//			logUtil.logAccess("debug", 0, "partDeactivated");
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
		// TODO Auto-generated method stub

	}

	protected void partVisible(IWorkbenchPart part) {
//		if (part == null || part != hiddenPart) {
//			return;
//		}
		partActivated(part);
	}

	protected void partHidden(IWorkbenchPart part) {
//		if (part == this) {
//			wasHidden = true;
//		}
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO: connect with selection changed of SemanticViewSelector
		// if instance of TreeSelection
		if (selectionController != null)
			selectionController.selectionChanged(part, selection);
		
	}
	
//	private static String getString(String key) {
//		return PluginUtils.INSTANCE.getString(key);
//	}

	
	
	//TODO: consider to move this to another class related to Semantic Links
	@Override
	public void connectNode(ILinkable source, ILinkable target, Direction dir) {
		try {

			ILinkable first;
			ILinkable second;
			IItem mid;
			Intermediate intermed = null;
			
			if (semanticLinker == null)
				return;
		
			if (dir == Direction.RIGHT) { //TODO: more elegant with delegate
				mid = ((NodePanel) ((IAppendable)LinkUtils.findNextAdjacentPanel(source, true)).getSuccessor()).getToken();
				first = source;
				second = target;
			} else {
				mid = ((NodePanel) ((IAppendable)LinkUtils.findNextAdjacentPanel(source, false)).getPrecessor()).getToken();
				first = target;
				second = source;
			}
			if (mid instanceof SmallItem) {
				intermed = new Intermediate(((SmallItem) mid).getInternalType(), ((SmallItem) mid).getElement());
			}
			if (intermed != null)
				System.out.println("[connectNode]: first: " + first.getName() + " second " + second.getName() + "(intermed):" + intermed.getType());
				
			processor.createLink(first, second, intermed);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ISemanticTrainViewPart getViewPart() {
		return this;
	}

	/**
	 * @return the processor
	 */
	public LinkProcessor getProcessor() {
		return processor;
	}

	/**
	 * @return the semanticLinker
	 */
	public SemanticLinker getSemanticLinker() {
		return semanticLinker;
	}

	/**
	 * @return the typeHieratchy
	 */
	public List<ITypeHierarchy> getTypeHierarchy() {
		return typeHierarchy;
	}

	@Override
	public IController getController() {
		return getCanvasController();
	}

	@Override
	public INodeCacheManager cacheManager() {
		return cacheManager;
	}

	@Override
	public ClassLoader getFxClassLoader() {
		return cachingClassLoader;
	}

	@Override
	public IListener getLinkListener() {
		return linkListener;
	}

	@Override
	public List<ILink> getLinkBuffer() {
		return linkBuffer;
	}

	@Override
	public void addLinkBuffer(ILink semanticLink) {
		if (linkBuffer == null)
			linkBuffer = new ArrayList<ILink>();
		linkBuffer.add(semanticLink);
	}

}