/*
 * generated by Xtext 2.16.0
 */
package de.validas.spedit


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class NaturalLangStandaloneSetup extends NaturalLangStandaloneSetupGenerated {

	def static void doSetup() {
		new NaturalLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}