package de.validas.nlx.dictionary.constants

import de.validas.nlx.dictionary.util.PluginUtils

abstract class AbstractConstantClass {
	
	protected def static String getString(String key) {
		return PluginUtils.INSTANCE.getString(key);
	}
}
