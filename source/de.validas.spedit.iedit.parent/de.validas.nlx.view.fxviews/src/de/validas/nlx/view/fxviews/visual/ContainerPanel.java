/**
 * 
 */
package de.validas.nlx.view.fxviews.visual;

import static de.validas.nlx.constants.Neo4jConstants._LINK;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.neo4j.driver.v1.types.Node;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.access.IPanelsAccessor;
import de.validas.nlx.view.fxviews.access.WordPanelAccessor;
import de.validas.nlx.view.fxviews.access.elements.ContainerItem;
import de.validas.nlx.view.fxviews.control.ContainerController;
import de.validas.nlx.view.fxviews.control.IContainerController;
import de.validas.nlx.view.fxviews.control.IDragController;
import de.validas.nlx.view.fxviews.semantics.ILink;
import de.validas.nlx.view.fxviews.semantics.ILinkContainer;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.ILinkable;
import de.validas.nlx.view.fxviews.semantics.IListener;
import de.validas.nlx.view.fxviews.semantics.LinkProcessor;
import de.validas.nlx.view.fxviews.semantics.util.LinkUtils;
import de.validas.nlx.view.fxviews.semantics.SemanticLinkListener;
import de.validas.nlx.view.fxviews.semantics.SemanticLinker;
import de.validas.nlx.view.fxviews.views.IPanelContainer;
import de.validas.nlx.view.fxviews.views.ISemanticTrainViewPart;
import de.validas.utils.data.lists.LinkedList;
import de.validas.utils.data.types.XPair;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;

/**
 * @author schaller
 *
 */
public class ContainerPanel extends NodePanel implements IPanel, ILinkContainer, IPanelContainer {

	protected NodePanelFactory nodePanelFactory;
	protected Pane container;
	// TODO: consider to replace panelChain and behavior in an own Class for the
	// future.
	protected LinkedList<ILinkObj> panelChain;
	protected IListener linkListener;
	protected boolean resolved;
	protected LinkProcessor processor;
	protected SemanticLinker linker;
	protected List<ILinkable> innerlink;
	private List<ILink> links;
	private List<ILink> linkBuffer;
	private SemanticLinkListener innerLinkListener;

	/**
	 * @param token
	 * @param dragController
	 * @param url
	 * @param container 
	 * @param linkListener 
	 * @param linkListener
	 * @param i 
	 * @param accessor 
	 * 
	 */
	public ContainerPanel(IPanelContainer outer, URL url, List<javafx.scene.Node> childContainer, IDragController dragController, IListener linkListener, IItem token, IPanelsAccessor accessor, int i) {
		super(outer, url, childContainer, dragController, linkListener, token, accessor, i);
		nodePanelFactory = new NodePanelFactory(this, dragController);
		// TODO: consider that maybe container objects need their own listeners
		this.links = new ArrayList<ILink>();
		this.linker = new SemanticLinker(); // create new instance, not reuse //getViewPart().getSemanticLinker();
		ISemanticTrainViewPart viewPart = getParent().getViewPart();
		IDictionaryAccess dictAccess = viewPart.getDictAccess();
		if (dictAccess.isConnected())
			this.processor = new LinkProcessor(dictAccess, linker, viewPart.cacheManager());
		innerlink = new ArrayList<ILinkable>();
	}
	
	@Override
	public void scheduleDraw() {
		this.innerLinkListener = new SemanticLinkListener(this);
		configure(accessor);
		if (controller instanceof ContainerController) {
			container = ((ContainerController) controller).getLayoutSpace();
			createChildren(((ContainerItem) token).getPanelsAccessor());
		}
		Platform.runLater(()->{
			if (root != null && !canvasParent.contains(root)) {
				canvasParent.add(root);
			}
		});
	}

	public void createChildren(IPanelsAccessor accessor) {
		ObservableList<javafx.scene.Node> childContainter = container.getChildren();

		panelChain = new LinkedList<>();

		for (int i = 0; i < accessor.size(); i++) {

			IPanel nodePanel;
			IItem token = accessor.getToken(i);

			nodePanel = nodePanelFactory.create(token, accessor, innerLinkListener, i, childContainter);
//			nodePanel.configure(accessor, i);
//
			panelChain.add(nodePanel);

			//childContainter.add(nodePanel.getRoot());

		}

		if (panelChain != null && processor != null && !panelChain.isEmpty()) {
			if (panelChain.get(0) instanceof ILinkable) {
				innerLinkListener.setPanelChain(panelChain);
				linker.setListener(innerLinkListener);
				List<XPair<ILinkable, Boolean>> solutions = processor.evaluateNext((ILinkable) panelChain.get(0));
				for (ILinkObj panel : panelChain)
					if (isPostprocess()) processor.postProcess(panel);
				LinkUtils.autoRoute(panelChain.get(0));

				if (solutions != null && !solutions.isEmpty()) {

					for (XPair<ILinkable, Boolean> solution : solutions) { //forward innerlink outwards
						ILinkable resolvedLink = solution.getKey();
						if ((solution.getValue() || panelChain.size() <= 2) && !innerlink.contains(resolvedLink)) {
							resolved = true;
							innerlink.add(resolvedLink); // TODO: 12.05.21 multiple words in container return node panel
														// if not resolved
						}
					}
				}
			}
		}

	}

	@Override
	public LinkedList<ILinkObj> getPanelChain() {
		return panelChain;
	}

	@Override
	public boolean getIsResolved() {
		return resolved;
	}

	public IContainerController getController() {
		return (IContainerController) controller;
	}

	@Override
	public void setListeners(ChangeListener<? super Bounds> changeListener) {
		// addSelectionChangedListener(selectionChangedListener);
		root.boundsInParentProperty().addListener(changeListener);
	}

	/**
	 * @return the innerlink
	 */
	@Override
	public List<ILinkable> getAllInnerLinks() {
		return innerlink;
	}
	
	@Override
	public List<ILinkable> getInnerLink() {
		
		if (innerlink != null && !innerlink.isEmpty()) {
			List<ILinkable> result = new ArrayList<ILinkable>();
			for (ILinkable type : innerlink) { 					//TODO: 24.01.22 try to cache this and just update with listeners
				if (LinkUtils.innerRecursionResolveLink(type, null, false) != null)
					result.add(type);
			}	
			return result;
		}	
		return null;
	}

	@Override
	public ClassLoader getFxClassLoader() {
		return getCanvas().getFxClassLoader();
	}

	@Override
	public List<XPair<String, ITypeAttributes>> getTypes() {
		final Function1<ILinkable, XPair<String, ITypeAttributes>> _function = (ILinkable r) -> {
			if (r!= null)
				return r.getType();
			else
				return null; 
		};
		if (innerlink != null)
			if (((ContainerItem) token).getPanelsAccessor() instanceof WordPanelAccessor)
				return new ArrayList<XPair<String, ITypeAttributes>>(ListExtensions.<ILinkable, XPair<String, ITypeAttributes>>map(innerlink, _function));
			else
				return new ArrayList<XPair<String, ITypeAttributes>>(Arrays.asList(token.getInternalType().getBaseType()));
		return null;
	}


	@Override
	public IListener getLinkListener() {
		return innerLinkListener;
	}

	/**
	 * @deprecated use addLink instead
	 */
	@Override
	@Deprecated
	public void setLink(String type, ILink link) { //
		// ignore Type
		addLink(type, link);
	}

	/**
	 * substitude setLink because of multible assignments for link
	 * 
	 * @param type
	 * @param link
	 */
	public void addLink(String type, ILink link) { //
		final Function1<ILink, Long> _function = (ILink r) -> {
			return ((Node)r.getLinkInfo().getRecord(_LINK)).id();
		};
		List<Long> ids = ListExtensions.<ILink, Long>map(new ArrayList<ILink>(links), _function);
		if (!ids.contains(((Node)link.getLinkInfo().getRecord(_LINK)).id()))
			this.links.add(link);
	}

	@Override
	public List<ILink> getLink() {
		return links;
	}

	@Override
	public Map<String, List<ILink>> getLinks() {
		return Collections.singletonMap(token.getInternalType().getName(), links);
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

	@Override
	public boolean isPostprocess() {
		return getCanvas().isPostprocess();
	}

}
