/**
 * (c) 2022 felixschaller.com
 */
package de.validas.nlx.view.fxviews.semantics;

import static de.validas.nlx.constants.Neo4jConstants._A;
import static de.validas.nlx.constants.Neo4jConstants._ATTR;
import static de.validas.nlx.constants.Neo4jConstants._HIT;
import static de.validas.nlx.constants.Neo4jConstants._LA;
import static de.validas.nlx.constants.Neo4jConstants._LINK;
import static de.validas.nlx.constants.Neo4jConstants._LK;
import static de.validas.nlx.constants.Neo4jConstants._LI;
import static de.validas.nlx.constants.Neo4jConstants._ID;
import static de.validas.nlx.constants.Neo4jConstants._NAME;
import static de.validas.nlx.constants.Neo4jConstants._SOURCE;
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._MENU_DELETE;
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._MENU_UNDO;
import static de.validas.nlx.constants.Neo4jConstants._P;
import static de.validas.nlx.dictionary.constants.DictionaryConstants._EXCLUDED;
import static de.validas.nlx.dictionary.constants.DictionaryConstants._ORDINAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.crypto.SecretKey;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.neo4j.driver.internal.value.NullValue;
import org.neo4j.driver.internal.value.StringValue;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Value;
import org.neo4j.driver.v1.types.Node;
import org.neo4j.driver.v1.types.Path;
import org.neo4j.driver.v1.types.Path.Segment;
import org.neo4j.driver.v1.types.Relationship;

import de.validas.nlx.dictionary.IDictionaryAccess;
import de.validas.nlx.dictionary.constants.AttributeSet;
import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.dictionary.type.LinkTypeAttribute;
import de.validas.nlx.dictionary.type.elements.IRelationshipEL;
import de.validas.nlx.view.fxviews.control.IDragController;
import de.validas.nlx.view.fxviews.semantics.types.CardinalType;
import de.validas.nlx.view.fxviews.semantics.types.LiteralType;
import de.validas.nlx.view.fxviews.semantics.util.LinkUtils;
import de.validas.nlx.view.fxviews.views.IPanelContainer;
import de.validas.utils.data.lists.LinkedList;
import de.validas.utils.data.lists.ListWrapper;
import de.validas.utils.data.types.XPair;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.control.MenuItem;

/**
 * @author schaller
 *
 */
@SuppressWarnings("rawtypes")
public class SemanticLink implements ILink {

	protected Set<ILink> links;
	protected XPair<String, ILinkable> startLink; // TODO: replace by typeElement class
	protected XPair<String, ILinkable> endLink;
	protected ILinkInfo linkInfo;
	protected ILinkType type;
	@Deprecated
	protected boolean overComma;
	protected ITypeAttributes linkAttribs;
	//protected IlinkObj forwardType;  // TODO: 14.03.2022 find out weather forward and cardinal types can be the same / are redundant
	protected ILinkable cardinalType; 
	
	protected LinkStyle linkStyle;

	protected LinkPath linkPath;
	protected IPanelContainer canvas;
	protected IDragController dragController;

	protected int maxLevel = 0;
	protected int level = 0;
	protected boolean drawn = false;
	protected Collection<MenuItem> menuItems;
	protected int lower;
	protected int higher;
	protected Map<? extends String, ? extends Object> intermediate;
	private HashMap<String, MenuItem> menuList = new HashMap<String, MenuItem>(){
		/**
		 * Map that defines the available menues
		 */
		private static final long serialVersionUID = 1L;

	{
		MenuItem itemDelete = new MenuItem(_MENU_DELETE);
		itemDelete.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				disableLinkPattern(getCanvas().getViewPart().getDictAccess());
			}
		});
		put(_MENU_DELETE, itemDelete);
		
		MenuItem itemUndo = new MenuItem(_MENU_UNDO);
		itemUndo.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				undoLinkPattern(getCanvas().getViewPart().getDictAccess());
			}
		});
		put(_MENU_UNDO, itemUndo);
		
	}};
	
	//TODO: inverse filter criteria, name the keys to keep not the one to remove
	protected static final List<String> FILTER_PROPS_PATTERN = new ArrayList<>(
		    Arrays.asList(_SOURCE)
			);
	protected static final List<String> FILTER_PROPS_ATTRS = new ArrayList<>(
		    Arrays.asList(_HIT)
			);

	/**
	 * @param endPanel
	 * @param startPanel
	 * 
	 */

	// TODO: move link calculation in SemanticLink

	public SemanticLink(XPair<String, ILinkable> start, XPair<String, ILinkable> end,  Map<? extends String, ? extends Object> intermed, ILinkInfo linkInfo, int level) {
		this(start, end, intermed, linkInfo, level, null);
	}

	public SemanticLink(XPair<String, ILinkable> start, XPair<String, ILinkable> end, Map<? extends String, ? extends Object> intermed, ILinkInfo linkInfo, int level,
			LinkStyle style) {
		// boolean pass = false;
		this.startLink = start;
		this.endLink = end;
		this.level = level;
		this.intermediate = intermed;
		ILinkable startConn = start.getValue();
		ILinkable endConn = end.getValue();
		this.links = new HashSet<ILink>();
		this.linkInfo = linkInfo;
		this.canvas = startConn.getCanvas();
		this.linkStyle = LinkStyle.DISABLED; //Initializing just in case of unexpected exceptions, because it can never be null elsewhere...
		endConn.setLink(end.getKey(), this);
		startConn.setLink(start.getKey(), this);
		linkAttribs = new LinkTypeAttribute((Node) linkInfo.getRecord(_LINK), start.getValue().getType().getValue(),
				end.getValue().getType().getValue());
		// TODO: consider to create a more specific class type:
		this.type = new LiteralType(((Node) linkInfo.getRecord(_LINK)).get(_NAME).asString(), this);
		this.dragController = canvas.getViewPart().getDragController();
		
		Pair<Integer, Integer> pair = LinkUtils.calculateBounds(start, end);
		this.lower = pair.getKey();
		this.higher = pair.getValue();
		
		this.canvas.addLinkBuffer(this);
		Set<String> menuSet = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet(_MENU_DELETE)); 
		
		if (style == null) {
			ILink parentS = null;
			ILink parentE = null;
			startConn = start.getValue();
			endConn = end.getValue();
			if (startConn instanceof ILink)
				parentS = (ILink) startConn;
			if (endConn instanceof ILink)
				parentE = (ILink) endConn;
			if (parentS != null || parentE != null) {  //FIXME: 18.03.22 double null check
				if (parentS != null && !parentS.getStyle().contains(LinkStyle.DISABLED) ) //TODO: 20.03.22 optimize redundant if's by setting states and decide by switch later
					this.linkStyle = clalculateLinkStyle();
				else if (parentS == null && parentE != null && !parentE.getStyle().contains(LinkStyle.DISABLED)){
					this.linkStyle = clalculateLinkStyle();
				} else {
					this.linkStyle = LinkStyle.create(LinkStyle.DISABLED);
				}
			} else
				this.linkStyle = clalculateLinkStyle();
			if (parentS != null && linkStyle.contains(LinkStyle.DISABLED) &&  !parentS.getStyle().contains(LinkStyle.DISABLED)) {
				menuSet = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet(_MENU_UNDO));
			}
		} else
			this.linkStyle = style;
		
		this.menuItems = createMenuItems(menuSet);
	}

	
	@SuppressWarnings("unchecked")
	private LinkStyle clalculateLinkStyle() {
		Map<AttributeSet, Collection<? extends IRelationshipEL>> attributes = Stream
				.of(new Object[][] {
						{ AttributeSet.START, ((LinkTypeAttribute) linkAttribs).getAttrsEL(AttributeSet.START) },
						{ AttributeSet.END, ((LinkTypeAttribute) linkAttribs).getAttrsEL(AttributeSet.END) }, })
				.collect(Collectors.toMap(data -> (AttributeSet) data[0],
						data -> (Collection<? extends IRelationshipEL>) data[1]));
		
		LinkStyle style;

		Record rec = linkInfo.getRecord();  // set base pattern
		List<Relationship> excluded = new ArrayList<>();
		if (linkInfo instanceof PathLinkInfo) {
			List<Record> records = ((PathLinkInfo)linkInfo).getRecordMap();
			for(Record rc : records) {
				Value ov = rc.get(_A).asNode().get(_ORDINAL);
				if (ov instanceof StringValue) {
					if (Integer.parseInt(ov.asString()) == 0)
						rec = rc;
				} else if (ov instanceof NullValue) {
					rec = rc;			//if first record is not base pattern
				}
				
				//add exclude patterns
				ArrayList<Object> pAttr = new ArrayList<Object>(rc.get(_ATTR).asList());
				for (Object el : pAttr) {
					if (el instanceof Map) {
						Map lk = (Map) ((Map) el).get(_LK);
						Relationship l = (Relationship) lk.get(_LA);
						if (l.type().equals(_EXCLUDED)) {
							excluded.add(l);
						}
					}
				}
			}
		} 
		Value a = rec.get(_A);
		List<Object> attr = null;
		if (!a.isNull()) {
			attr = new ArrayList<Object>(rec.get(_ATTR).asList());
			for (AttributeSet setKey : attributes.keySet())
				for (IRelationshipEL latt : attributes.get(setKey)) {
					Relationship ar = latt.getRelationship();
					Map found = null;
					for (Object el : attr) {
						if (el instanceof Map) {
							Map lk = (Map) ((Map) el).get(_LK);
							Relationship l = (Relationship) lk.get(_LA);
							if (ar.type().equals(l.type())) {
								if (l.get(_SOURCE).asString().equals(setKey.toString().toLowerCase())) {
									int dir = 0;
									if (ar.endNodeId() == l.endNodeId()) // TODO: 20.01.22 just for debug purposes,
																			// replace by logical OR in the future
										dir = 2;
									if (ar.startNodeId() == l.endNodeId())
										dir = 1;
									if (dir > 0) {
										Map propsL = new HashMap<String, Object>(l.asMap());
										for (String key : FILTER_PROPS_PATTERN) {
											propsL.remove(key);
										}
										Map propsA = new HashMap<String, Object>(ar.asMap());
										for (String key : FILTER_PROPS_ATTRS) {
											propsA.remove(key);
										}
										boolean match = false;
										if (!propsL.isEmpty() && !propsA.isEmpty()) {
											if (propsL.equals(propsA))
												match = true;
										} else
											match = true;
										if (match) {
											found = (Map) el;
											break;
										}
									}
								}
							}

						}

					}
					if (found != null)
						attr.remove(found);
				}
			
		}
		
//		remove attributes from exclusion patterns
		Set<Object> remove = new HashSet<>();
				
		for(Relationship rel : excluded) {
			for (Object at : attr) {
				
				if ((long)((Map) ((Map) at).get(_LK)).get(_LI) == Long.parseLong(rel.get(_ID).asString())) {
					remove.add(at);
				}
			}
			if (!remove.isEmpty()) {
				attr.removeAll(remove);
				remove.clear();
			}
		}
		if (attr != null && attr.isEmpty())
			style = LinkStyle.create(LinkStyle.DISABLED);
		else {
			style = LinkStyle.create(LinkStyle.LOW_LINK);
		
		}
		// Find Redundant patterns and set
		style = checkRedundance(style);

		return style;
	}

	private LinkStyle checkRedundance(LinkStyle style) {
		LinkStyle newStyle = LinkStyle.create(new ArrayList<String>());
		boolean intermedMatches = false;
		Map<? extends String, ? extends Object> intermed = startLink.getValue().getIntermediate();
		if (intermed != null && intermediate !=null && intermed.equals(intermediate))	
			intermedMatches = true;
		String cardinalStart;
		String cardinalEnd;
		if (startLink instanceof ILink && ((ILink)startLink.getValue()).hasCardinalType())
			cardinalStart =  ((ILink)startLink.getValue()).getCardinalType().getName();
		else
			cardinalStart = startLink.getKey();
		
		if (endLink instanceof ILink && ((ILink)endLink.getValue()).hasCardinalType())
			cardinalEnd =  ((ILink)endLink.getValue()).getCardinalType().getName();
		else
			cardinalEnd = endLink.getKey();
		
		if (cardinalStart.equals(cardinalEnd) && intermedMatches) {
			this.cardinalType = new CardinalType(this, startLink, endLink, linkAttribs);
			newStyle.add(style);
			newStyle.add(LinkStyle.DASHED);
			return newStyle;
		}

		return style;
	}

	/**
	 * @return the cardinalType
	 */
	public ILinkable getCardinalType() {
		return cardinalType;
	}
	
	public boolean hasCardinalType() {
		return cardinalType != null;
	}

	private Collection<MenuItem> createMenuItems(Set<String> menuSet) {
		if (menuItems == null)
			menuItems = new ArrayList<>();
		
		for (String item : menuSet) {
			
			menuItems.add(menuList .get(item));
		}
		// TODO: 06.12.21 returns a field, may be externalized into static Method.
		return menuItems;
	}

	private void disableLinkPattern(IDictionaryAccess dictAccess) {

		try {
			int cardinality =0;
			XPair<String, ITypeAttributes> attrs = null;
			if (cardinalType != null) {
				cardinality = cardinalType.getCardinality();
				attrs = cardinalType.getType();
			}
			dictAccess.disableNode((Node) linkInfo.getRecord(_LINK),
					((LinkTypeAttribute) linkAttribs).getParent(AttributeSet.START),
					((LinkTypeAttribute) linkAttribs).getParent(AttributeSet.END), cardinality, attrs);
			this.linkStyle = LinkStyle.create(LinkStyle.DISABLED);  //TODO: disable also all downstream links
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	private void undoLinkPattern(IDictionaryAccess dictAccess) {
		//TODO: 18.03.22 currently just delete but replace by pattern
		try {
			dictAccess.deletePatternFromNode((Node) linkInfo.getRecord(_LINK));
			this.linkStyle = LinkStyle.create(LinkStyle.LOW_LINK);  // should recaluculate route here
			//TODO: 20.03. Update LinkTypes and its descendants
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the linkInfo
	 */
	@Override
	public ILinkInfo getLinkInfo() {
		return linkInfo;
	}

/**
 * @deprecated: use getLinks
 */
	@Override
	@Deprecated
	public List<ILink> getLink() { //
		return getLinks();
	}

/**
 * gets the linked types	
 * @return: List<ILink>
 */
	public List<ILink> getLinks() { //
		return new ArrayList<ILink>(links);
	}

	public void addLink(ILink link) {
		final Function1<ILink, Long> _function = (ILink r) -> {
			return ((Node) r.getLinkInfo().getRecord(_LINK)).id();
		};
		List<Long> ids = ListExtensions.<ILink, Long>map(new ArrayList<ILink>(links), _function);
		if (!ids.contains(((Node) link.getLinkInfo().getRecord(_LINK)).id()))
			this.links.add(link);
	}

	/**
	 * @deprecated: use getLinks
	 */
	@Deprecated
	@Override
	public List<ILink> getParent() {
		return getLink();
	}

	/**
	 * @return the startPanel
	 */
	public XPair<String, ILinkable> getStartLink() {
		return startLink;
	}

	/**
	 * @return the endPanel
	 */
	public XPair<String, ILinkable> getEndLink() {
		return endLink;
	}

	@Override
	public XPair<String, ILinkable> getOpposite(ILinkable node) {
		if (startLink.getValue().equals(node))
			return endLink;
		else
			return startLink;
	}

	@Override
	public LinkPath getRoot() {
		return linkPath;
	}

	/**
	 * @return the overComma
	 */
	@Deprecated
	@Override
	public boolean isOverKomma() {
		return overComma;
	}

	/**
	 * @param overComma the overComma to set
	 */
	@Deprecated
	@Override
	public void setOverKomma(boolean overKomma) {
		this.overComma = overKomma;
	}

	@Override
	public ILinkType getLinkType() {
		return type;
	}

	@Override
	public String toString() {
		XPair<String, ILinkable> start = getStartLink();
		XPair<String, ILinkable> end = getEndLink();

		return String.format("Start: %1$s->%2$s End: %3$s->%4$s [OverComma]: %5$s", start.getKey(),
				start.getValue().getName(), end.getKey(), end.getValue().getName(), overComma ? "true" : "false");
	}

	@Override
	public IPanelContainer getCanvas() {
		return canvas;
	}

	@Override
	public String getName() {
		return ((Node)linkInfo.getRecord(_LINK)).get(_NAME).asString();
	}

	@Override
	public XPair<String, ITypeAttributes> getType() {
		return new XPair<>(getName(), linkAttribs);
	}

	// TODO: 30.11.21 this is a bad interface.
	@Deprecated
	@Override
	public List<XPair<String, ITypeAttributes>> getTypes() {
		List<XPair<String, ITypeAttributes>> types = new ArrayList<>();
		types.add(getType());
		return types;
	}

	@Override
	public void setStyle(LinkStyle style) {
		linkStyle = style;
	}

	@Override
	public LinkStyle getStyle() {
		return linkStyle;
	}

	@Override
	public void setLink(String type, ILink link) {
		// Ignore type
		// this.links.add(link);
		addLink(link);
	}

	@Override
	public int getLevel() {

		return level;
	}

	@Override
	public int getMaxLevel() {

		return maxLevel;
	}

	@Override
	public void setMaxLevel(int max) {
		maxLevel = max;
	}

	@Override
	public IDragController getDragController() {
		return dragController;
	}

	@Override
	public void removeLink() {
		if(Platform.isFxApplicationThread())
			scheduleRemove();
		else
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					scheduleRemove();
				}
			});
	}

	protected void scheduleRemove() {
		if (linkPath != null && drawn) {
			//avoid changes from other threads during delete
			synchronized(this) {
				//TODO: debugging
				boolean success = linkPath.remove();
				if (success) {
					linkPath = null;
					drawn = false;
				}
			}
		}
	}

	@Override
	public void draw(Point2D startPoint, Point2D endPoint) {
		if (!drawn || linkPath == null) {
			linkPath = new LinkPath(this, menuItems);
			linkPath.draw(startPoint, endPoint, ()->{drawn = true;}); // TODO: 12.05.21 add CSS hierarchy attribute here
		}
	}

	@Override
	public int getLowerBound() {
		return lower;
	}

	@Override
	public int getHigherBound() {
		return higher;
	}

	@Override
	public int getCardinality() {
		if (cardinalType == null)
			return 0;
		
		return cardinalType.getCardinality();
	}

	@Override
	public Map<? extends String, ? extends Object> getIntermediate() {
		return intermediate;
	}

}