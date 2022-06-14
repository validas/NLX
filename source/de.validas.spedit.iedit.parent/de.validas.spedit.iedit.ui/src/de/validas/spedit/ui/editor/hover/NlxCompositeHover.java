/**
 * 
 */
package de.validas.spedit.ui.editor.hover;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.ITextHover;
import org.eclipse.xtext.ui.editor.hover.DefaultCompositeHover;

/**
 * @author Felix Schaller
 *
 */
public class NlxCompositeHover extends DefaultCompositeHover {

	/**
	 * 
	 */
	public NlxCompositeHover() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.hover.DefaultCompositeHover#createHovers()
	 */
	@Override
	protected List<ITextHover> createHovers() {
		List<ITextHover> list = new ArrayList<ITextHover>();
		list.add (annotationHover);
		if(htmlHover instanceof ITextHover)
			list.add ((ITextHover) htmlHover);
		// add more Hovers here later
		return list;
	}

}
