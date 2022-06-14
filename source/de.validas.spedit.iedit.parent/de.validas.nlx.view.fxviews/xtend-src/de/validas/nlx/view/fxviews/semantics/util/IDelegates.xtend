package de.validas.nlx.view.fxviews.semantics.util

interface IDelegates { 
	
	interface Procedure<E> {	
		def void apply(E ev);
	}
	
	interface Procedure2<E, T> {	
		def void apply(E par, T ev);
	}
}