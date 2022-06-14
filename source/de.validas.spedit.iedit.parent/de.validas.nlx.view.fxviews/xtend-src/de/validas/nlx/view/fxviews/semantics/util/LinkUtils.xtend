package de.validas.nlx.view.fxviews.semantics.util

import de.validas.nlx.dictionary.type.ITypeAttributes
import de.validas.nlx.view.fxviews.access.WordPanelAccessor
import de.validas.nlx.view.fxviews.access.elements.ContainerItem
import de.validas.nlx.view.fxviews.access.elements.ShortCutItem
import de.validas.nlx.view.fxviews.access.elements.SmallItem
import de.validas.nlx.view.fxviews.semantics.ILink
import de.validas.nlx.view.fxviews.semantics.ILinkObj
import de.validas.nlx.view.fxviews.semantics.ILinkType
import de.validas.nlx.view.fxviews.semantics.ILinkable
import de.validas.nlx.view.fxviews.semantics.LinkStyle
import de.validas.nlx.view.fxviews.semantics.types.LiteralType
import de.validas.nlx.view.fxviews.semantics.types.WordType
import de.validas.nlx.view.fxviews.visual.ContainerPanel
import de.validas.nlx.view.fxviews.visual.IPanel
import de.validas.nlx.view.fxviews.visual.NodePanel
import de.validas.utils.data.types.XPair
import java.util.List
import java.util.Map
import javafx.geometry.Bounds
import javafx.geometry.Point2D

import static de.validas.nlx.view.fxviews.semantics.constants.LinkConstants.LINK_HEIGHT

class LinkUtils {
	/**
	 * similar to FindRoot in semantic linker but with different behavior
	 */
	def static List<ILinkable> traceRoot(ILinkable sourceLink) { // find highest rule
		if (sourceLink instanceof ILinkable) {
			var results = newArrayList()
			for (parent : sourceLink.getLink() ?: #[])
				results.addAll(traceRoot(parent))
			if (results.empty)
				return #[sourceLink]
			else
				return results
		} else {
			return null;
		}
	}

	def static List<XPair<Integer, ILinkable>> traceAllRoots(ILinkable sourceLink, int depth, boolean bidirect) { // find highest rule
		if (sourceLink !== null && sourceLink instanceof ILinkable) {
			var Map<String, List<ILink>> parents = newHashMap()
			if (sourceLink instanceof NodePanel) {
				parents = sourceLink.getLinks()
			} else {
				var links = sourceLink.getLink()
				if (links !== null && !links.isEmpty)
					parents = newHashMap(links.get(0).name -> links)
			}
			if (parents !== null && !parents.empty) {
				var result = newArrayList()
				for (key : parents.keySet) {
					for (link : parents.get(key)) {
						var l = if (link.level > depth) link.level else depth + 1
						var trace = traceAllRoots(link, l, bidirect)
						if (trace !== null)
							for (el : trace){
								if (el.value.lowerBound >= sourceLink.lowerBound || bidirect) // recurse only into links that are right of sourcelink
									result.add(el)
							}
					}
				}
				if (!result.empty)
					return result
			}
			return newArrayList(new XPair<Integer, ILinkable>(depth, sourceLink))
		} else {
			return null;
		}
	}

	def static autoRoute(ILinkObj startNode) {
		var eol = false;
		var ILinkObj next = startNode
		while (!eol) {
			var result = doRoute(next);
			if (result !== null) {
				next = next.successor as ILinkObj
				while (next !== null && next.token instanceof SmallItem) {
					next = next.successor as ILinkObj
				}
			} else
				return if (next === null)
					eol = true
		}
	}

	private def static doRoute(ILinkable link) {
		var root = LinkUtils.traceAllRoots(link, 0, true);
		var max = 0;
		var XPair<Integer, ILinkable> result = null;
		var i = 0
		var selection = -1;
		for (el : root ?: #[]) {
			var el_link = el.value
			var key = traceLeaves(el_link, 0) // el.getKey();
			if (el_link instanceof ILink) {
				var maxLevel = el_link.maxLevel
				if (maxLevel == 0 || maxLevel >= key )
					if (key > max && !isDisabled(el)) {
						max = key;
						result = el;
						selection = i
					} else if (result === null) {
						result = el;
					}
			}
			i++
		}
		if (result !== null) {
			for (i = 0; i < root.size(); i++) {
				var el = root.get(i)
				if (!isDisabled(el)) //TODO: 23.03.22 redundant check
					if (i === selection) {
						selectRoute(el.value, null, max)
					} else {
						deselectRoute(el.value, max)
					}
			}
		}
		return result
	}
	
	def static isDisabled(XPair<Integer, ILinkable> pair) {
		var v = pair.value
		if (v instanceof ILink){
			if (v.style.classes.contains(LinkStyle.DISABLED.classes.get(0)))
				return true
		}
		false
	}

	def static int traceLeaves(ILinkable linkable, int level) {
		if (linkable instanceof ILink) {
			var links = #[linkable.startLink.value, linkable.endLink.value]
			var int max = 0
			for (child : links) {
				var branches = traceLeaves(child, level + 1)
				if (branches > max)
					max = branches
			}
			return max
		}
		return level + 1
	}

	def static void selectRoute(ILinkable linkable, String typeName, int max) {
		if (linkable instanceof ILinkObj) { 
			var token = linkable.token
			if (token instanceof ShortCutItem) {
				token.selection = typeName
			}
		} else if (linkable instanceof ILink) {
			linkable.maxLevel = max
			linkable.style.replaceStyle(LinkStyle.LOW_LINK, LinkStyle.LINK) //TODO: 21.03.22 omit overriding dash
			selectRoute(linkable.endLink.value, linkable.endLink.key, max)
			selectRoute(linkable.startLink.value, linkable.startLink.key, max)
		}
	}

	def static void deselectRoute(ILinkable linkable, int max) {
		if (linkable instanceof ILink) {
			linkable.maxLevel = max
			// linkable.style = LinkStyle.CLEAR
			linkable.style.replaceStyle(LinkStyle.LINK, LinkStyle.LOW_LINK)
			deselectRoute(linkable.endLink.value,  max)
			deselectRoute(linkable.startLink.value,  max)
		}
	}

	def static ILinkObj findNextAdjacentPanel(ILinkable linkable, boolean leftOf) {
		if (linkable instanceof ILinkObj) {
			linkable
		} else {
			var ILink link = (linkable as ILink)
			var startPanel = findNextAdjacentPanel(link.startLink.value, leftOf)
			var endPanel = findNextAdjacentPanel(link.endLink.value, leftOf)
			var dir = (startPanel.index < endPanel.index)
			if (if (leftOf) dir else !dir)
				return endPanel
			startPanel
		}
	}
	
	def static Point2D linkToLinkCalculation(ILink link, boolean automatic) {
		var startLink = link.getStartLink();
		var endLink = link.getEndLink();

		var startPoint = recursiveLinkToPoint(startLink, link, false); // TODO: might be obsolete if method gets point
																		// from parent
		var endPoint = recursiveLinkToPoint(endLink, link, false);
		return calculateLinkOffset(startPoint, endPoint);
	}
	
	/**
	 * @param startPoint
	 * @param endPoint
	 * @return
	 */
	def static Point2D calculateLinkOffset(Point2D startPoint, Point2D endPoint) {
		if (startPoint === null || endPoint === null)
			return null;
		var ey = endPoint.getY()
		var sy = startPoint.getY()
		var double y = 0
		if (ey > sy)
			y = ey
		else
			y = sy
		return new Point2D((endPoint.getX() + startPoint.getX()) / 2, y + LINK_HEIGHT);
	}
	
	def static Point2D recursiveLinkToPoint(XPair<String,ILinkable> link, ILink parent, boolean automatic) {
		var linkObj = link.getValue()
		switch (linkObj){
			ContainerPanel: {
				var typesAll = (linkObj as ContainerPanel).getInnerLink()
				if (!((linkObj.token as ContainerItem).panelsAccessor instanceof WordPanelAccessor)) {
					if (typesAll !== null && !typesAll.empty)
						return midPointFromRoot(linkObj)
				} else {
					for (ILinkable type : typesAll?:#[]) 
						if (type.getName().equals(link.getKey()))
							return midPointFromRoot(linkObj)	
				}
				return null
			} 
			default: 
				return innerRecursionResolveLink(linkObj, parent, automatic)
		}
	}
	
	def static Point2D midPointFromRoot(IPanel opposite) {
		var root = opposite.root
		if (root !== null){
			var Bounds endBounds = root.boundsInParent
			return new Point2D((endBounds.minX + endBounds.maxX) / 2, endBounds.maxY);
		} else 
			return new Point2D(0,0);
	}
	
	def static innerRecursionResolveLink(ILinkable linkObj, ILink parent,  boolean automatic){
		switch (linkObj){
			IPanel: {
				var types = linkObj.getLink();
				if (types !== null && !types.isEmpty())  // TODO: 17.09.21 may be optimized to better find out if link matches object
					for (ILink type : types) {
						if (type.equals(parent) || parent === null)
							return midPointFromRoot(linkObj)
					}
				return null
			} 
			default: 
				return linkToLinkCalculation(linkObj as ILink, automatic)	
		}
	}
	
	def static getLinkHigherType(ILinkable linkable) { // consider to move Method in ILinkable
		var ILinkType type = null
		switch linkable {
			ContainerPanel:{
				if ((linkable.token as ContainerItem).panelsAccessor instanceof WordPanelAccessor){
					for(inner : linkable.innerLink ?: #[]) {
						if (type === null)
							type = inner.linkType	
					}
				} else 
					type = linkable.linkType
			}
			default: {
				type = linkable.linkType
			}
		}
		switch type {
			WordType: {
				return type.baseType //Due TypeAttributes Names are in key 
			}
			LiteralType: {
				return new XPair<String, ITypeAttributes>(type.getName, null)
			}
		}
	}
	
		/**
	 * @param start
	 * @param end
	 */
	def static calculateBounds(XPair<String, ILinkable> start, XPair<String, ILinkable> end) {
		var high = 0 
		var low = 0
		val startV = start.getValue();
		val endV = end.getValue();
		
		if (startV.getLowerBound()<endV.getHigherBound()) {
			low = startV.getLowerBound();
			high = endV.getHigherBound();
		} else {
			low = endV.getLowerBound();
			high = startV.getHigherBound();
		}
		return low -> high
	}
	
}
