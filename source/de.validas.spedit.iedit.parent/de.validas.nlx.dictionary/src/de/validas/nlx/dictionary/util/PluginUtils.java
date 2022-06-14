/**
adapter Class to read plugin properties.
requires: org.eclipse.core.runtime
otherwise this produces: "the Hierarchy of the class implementation is inconsistent"

@author Felix Schaller
 */

package de.validas.nlx.dictionary.util;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;


public final class PluginUtils extends EMFPlugin {

	public static final PluginUtils INSTANCE = new PluginUtils();
	
	private static Implementation plugin;

	public PluginUtils() {
		super
			(new ResourceLocator [] {
			});
	}

	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	public static Implementation getPlugin() {
		return plugin;
	}
	

	public static class Implementation extends EclipseUIPlugin {

		public Implementation() {
			super();
	
			plugin = this;
		}
	}

}
