/**
 * 
 */
package de.validas.nlx.view.fxviews.control;

import java.util.ArrayList;
import java.util.List;

/**
 * @author schaller
 *
 */
public class PanelsDragController implements IDragController {

	protected List<IDragevent> dragevents;
	/**
	 * 
	 */
	public PanelsDragController() {
		dragevents = new ArrayList<>();
	}

	@Override
	public void add(IDragevent dragevent) {
		dragevents.add(dragevent);
	}
	
	public void clear() {
		dragevents = new ArrayList<>();
	}

	@Override
	public List<IDragevent> getEvents() {
		
		return dragevents;
	}
	
}
