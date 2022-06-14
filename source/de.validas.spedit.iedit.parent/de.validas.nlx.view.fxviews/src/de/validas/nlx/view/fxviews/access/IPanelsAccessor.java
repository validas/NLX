/**
 * 
 */
package de.validas.nlx.view.fxviews.access;

/**
 * @author schaller
 *
 */

public interface IPanelsAccessor {

	double size();

	IItem getToken(int i);

	boolean hasComboBox(int index);

	String getCssClass(int index);

}
