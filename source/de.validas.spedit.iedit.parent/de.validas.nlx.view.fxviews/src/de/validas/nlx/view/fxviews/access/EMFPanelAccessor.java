/**
 * 
 */
package de.validas.nlx.view.fxviews.access;

import de.validas.nlx.dictionary.IDictionaryAccess;

/**
 * @author schaller
 *
 */
public class EMFPanelAccessor extends AbstractPanelAccessor {

	protected IDictionaryAccess dictAccess;
	/**
	 * 
	 */
	public EMFPanelAccessor(IDictionaryAccess dictAccess) {
		this.dictAccess = dictAccess;
	}

}
