/**
 *
 */
package de.validas.nlx.view.fxviews.access.elements;

import org.eclipse.emf.ecore.EObject;

import de.validas.nlx.view.fxviews.semantics.types.InterpunctionType;
import javafx.scene.Node;

/**
 * @author schaller
 *	
 *	Abstract class to Gather SmallItem Features
 */
public abstract class SmallItem extends AbstractItem {

	/**
	 * @param el
	 */
	public SmallItem(EObject el) {
		super(el);
	}
	
	@Override
	public boolean hasComboBox() {
		return false;
	}
	
	@Override
	public Node instantiateTypes() {
		update();
		return null;
	}

	protected void update() {
		if (type instanceof InterpunctionType) {
			((InterpunctionType)type).update();
		}
	}
	

}
