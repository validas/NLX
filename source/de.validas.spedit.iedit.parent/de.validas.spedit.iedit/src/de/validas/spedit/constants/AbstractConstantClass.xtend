package de.validas.spedit.constants

import de.validas.spedit.util.PluginUtils

abstract class AbstractConstantClass {
	
	protected def static String getString(String key) {
		return PluginUtils.INSTANCE.getString(key);
	}
}
