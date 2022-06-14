/**
 * 
 */
package de.validas.nlx.view.fxviews.visual;

import de.validas.nlx.view.fxviews.access.IPanelsAccessor;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.Parent;

/**
 * @author schaller
 *
 */
public interface IPanel extends ILinkObj {

	void configure(IPanelsAccessor accessor);

//	void selectItem(String newValue);
//
//	void addSelectionChangedListener(ChangeListener<? super String> selectionChangedListener);

	Node getRoot();

	void setListeners(ChangeListener<? super Bounds> changeListener);

	void scheduleDraw();

	Parent load();

}
