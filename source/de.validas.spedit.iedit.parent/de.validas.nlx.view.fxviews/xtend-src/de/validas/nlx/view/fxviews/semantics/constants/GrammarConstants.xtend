/**
 * (c) 2021 felixschaller.com
 * this class is created separately to FxViewConstants due to the intention later separate semantic logic from view
 */

package de.validas.nlx.view.fxviews.semantics.constants

import de.validas.nlx.view.fxviews.semantics.constants.AbstractConstantClass

class GrammarConstants extends AbstractConstantClass {
	
	//public static val TYPE_CONTAINER_ 			= getString("TYPE_CONTAINER_")
	
	public static val PARAGRAPH_ 				= getString("PARAGRAPH_")
	public static val PLAIN_ 					= getString("PLAIN_")
	public static val SENTENCE_CLASS_ 			= getString("SENTENCE_CLASS_")
	
	public static val _FIRST					= getString("_FIRST")	
	public static val _SECOND           		= getString("_SECOND") 
	public static val _START					= getString("_START")	
	public static val _END		           		= getString("_END") 
		
	public static val _EXT_BRACKET_SENTENCE		= getString("_EXT_BRACKET_SENTENCE")     	// ExtBracketSentence
	public static val _BRACKET_SENTENCE			= getString("_BRACKET_SENTENCE")     		// BracketSentence       
	public static val _INTERPUNCTION			= getString("_INTERPUNCTION")     			// Interpunction            
	public static val _SEPARATOR 				= getString("_SEPARATOR")     				// Separator   
	
	public static val _FULL_STOP 				= getString("_FULL_STOP")					// ".";
	public static val _BRACKEDOPEN				= getString("_BRACKEDOPEN")					// (
	public static val _BRACKEDCLOSE				= getString("_BRACKEDCLOSE")				// )
	public static val _EX_BR_OPEN				= getString("_EX_BR_OPEN")					// [
	public static val _EX_BR_CLOSE				= getString("_EX_BR_CLOSE")					// ]
	public static val _EXX_BR_OPEN				= getString("_EXX_BR_OPEN")					// {
	public static val _EXX_BR_CLOSE				= getString("_EXX_BR_CLOSE")				// }
	public static val _KOMMA					= getString("_KOMMA")						// ,
	public static val _COLON					= getString("_COLON")						// :
	public static val _SEMI_COLON				= getString("_SEMI_COLON")					// ;
	public static val _QUESTION_M				= getString("_QUESTION_M")					// ?
	public static val _EXCLAMATION_M			= getString("_EXCLAMATION_M")				// !
}