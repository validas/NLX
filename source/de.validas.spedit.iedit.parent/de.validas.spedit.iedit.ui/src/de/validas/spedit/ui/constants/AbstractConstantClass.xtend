package de.validas.spedit.ui.constants

import de.validas.spedit.ui.util.PluginUtils

abstract class AbstractConstantClass {
	
	protected def static String getString(String key) {
		return PluginUtils.INSTANCE.getString(key);
	}
}
