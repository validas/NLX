package de.validas.nlx.view.fxviews.semantics;

import java.util.List;
import java.util.Map;

import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.control.ICanvasController;
import de.validas.utils.data.lists.IAppendable;

public interface ILinkObj extends ILinkable, IAppendable {

	int getIndex();

	IItem getToken();

	ICanvasController getCanvasController();
	
	public Map<String, List<ILink>> getLinks();

}
