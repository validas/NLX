package de.validas.nlx.view.fxviews.semantics.constants

import de.validas.nlx.view.fxviews.util.PluginUtils

abstract class AbstractConstantClass {
	
	protected def static String getString(String key) {
		return PluginUtils.INSTANCE.getString(key);
	}
}