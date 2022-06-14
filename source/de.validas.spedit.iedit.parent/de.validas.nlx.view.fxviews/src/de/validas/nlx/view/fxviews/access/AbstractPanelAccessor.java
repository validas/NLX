/**
 * 
 */
package de.validas.nlx.view.fxviews.access;

import java.util.ArrayList;
import java.util.List;

/**
 * @author schaller
 *
 */
public abstract class AbstractPanelAccessor implements IPanelsAccessor {
	
	protected List<IItem> tokenChain = new ArrayList<>();

	/**
	 * 
	 */
	public AbstractPanelAccessor() {
		
	}

	@Override
	public double size() {
		if (tokenChain == null)
			return 0;
		return tokenChain.size();
	}

	@Override
	public IItem getToken(int index) {
		if (index < tokenChain.size()) 
			return tokenChain.get(index);
		return null;
	}

	@Override
	public boolean hasComboBox(int index) {
		if (index < tokenChain.size()) 
			return tokenChain.get(index).hasComboBox();
		return false;
	}

	@Override
	public String getCssClass(int index) {
		if (index < tokenChain.size()) 
			return tokenChain.get(index).getCssClass();
		return null;
	}

}
