/**
 * 
 */
package de.validas.nlx.view.fxviews.views;

import java.util.List;

import org.eclipse.ui.IViewPart;

import de.validas.nlx.constants.Direction;
import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.dictionary.type.ITypeHierarchy;
import de.validas.nlx.view.fxviews.access.IPanelsAccessor;
import de.validas.nlx.view.fxviews.cache.INodeCacheManager;
import de.validas.nlx.view.fxviews.control.IDragController;
import de.validas.nlx.view.fxviews.control.SemanticFxViewController;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.ILinkable;
import de.validas.nlx.view.fxviews.semantics.LinkProcessor;
import de.validas.nlx.view.fxviews.semantics.SemanticLinker;
import de.validas.nlx.view.fxviews.views.SemanticFxViewPart.UpdateMessage;
import de.validas.nlx.view.fxviews.views.SemanticFxViewPart.UpdateTask;
import de.validas.utils.data.lists.LinkedList;
import javafx.scene.layout.HBox;

/**
 * @author schaller
 *
 */
public interface ISemanticTrainViewPart extends IViewPart{
	
	public void createPanels(IPanelsAccessor accessor, SemanticFxViewPart.UpdateMessage update);
	
	public LinkedList<ILinkObj> getPanelChain() ;	
	
	public SemanticFxViewController getCanvasController(); 

	public IDragController getDragController();

	public void connectNode(ILinkable sourcePanel, ILinkable parentPanel, Direction dir);  
	
	public IDictionaryAccess getDictAccess();

	public LinkProcessor getProcessor();

	public SemanticLinker getSemanticLinker();

	public List<ITypeHierarchy> getTypeHierarchy();

	public INodeCacheManager cacheManager();

	public void setPanelStack(IPanelsAccessor panelsAccessor,  UpdateMessage updateMSG);

	public UpdateTask<Boolean> getCreatePanelsTask(); 
	
	public Thread getBackgroundThread();

	public void setBackgroundThread(Thread bgThread);
	
	public String getBgThreadName();

}
