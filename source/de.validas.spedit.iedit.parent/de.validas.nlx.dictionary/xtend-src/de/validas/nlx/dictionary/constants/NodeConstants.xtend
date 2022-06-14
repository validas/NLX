/**
 * Node Constants for Dictionary Queries
 * (c) 2020 licensed under Apache Public License 2.0
 * www.felixschaller.com
 * @author Felix Schaller
 */

package de.validas.nlx.dictionary.constants

import de.validas.nlx.dictionary.constants.AbstractConstantClass

class NodeConstants extends AbstractConstantClass{


	public  static val _KOMMA_SEP_FILTER 	= getString("_KOMMA_SEP_FILTER");	//"\\s*,\\s*"
	public  static val _KOMMA				= getString("_KOMMA");				//","
	public  static val _NEGATIVE_FILTER		= getString("_NEGATIVE_FILTER");	//"!"

	public  static val _CONTRACTION_FILTER	= getString("_CONTRACTION_FILTER");	//"(?=\')"
	public  static val _APOSTROPH			= getString("_APOSTROPH");			//"'"
	public  static val REGEX_ 			= getString("REGEX_")				//"[a-z][^aeiouöäü\\\\s]?[aeiouöäü][a-z]*"

/**
 * Constants for Implicit Dict Rule Parser
 * 
 */	
	public static val _WORD 			= getString("_WORD")				//"Word";
	public static val _WORD_CLASS 		= getString("_WORD_CLASS")			//"WordClass";
	public static val _WORD_FRAGMENT 	= getString("_WORD_FRAGMENT")		//"WordFragment"
	public static val _IMPL_RULE_TOKEN 	= getString("_IMPL_RULE_TOKEN")		//"ImplRuleToken";
	public static val _IMPL_DICT_RULE 	= getString("_IMPL_DICT_RULE")		//"ImplDictRule"
	public static val _ACTION 			= getString("_ACTION")				//"Action";
	public static val _ACTION_OBJECT	= getString("_ACTION_OBJECT")		//"ActionObject";
	public static val _TENSE			= getString("_TENSE")				//"Tense";
	public static val _CONDITION		= getString("_CONDITION")			//"Condition";
	public static val _BOOL_AND			= getString("_BOOL_AND")			//"bool and"
	public static val _BOOL_OR			= getString("_BOOL_OR")				//"bool or"
	public static val _GET_NAME			= getString("_GET_NAME")			//"getname";
	public static val _TYPE				= getString("_TYPE")				//"type"
	public static val _T_YPE			= getString("_T_YPE")				//"Type"
	public static val _SHORT_OF			= getString("_SHORT_OF")			//"shortOf"
	public static val _NAME_OBJ			= getString("_NAME_OBJ")			//"NameObj";
	public static val _ATTR_NAME		= getString("_ATTR_NAME")			//"name";
	public static val _QUERY			= getString("_QUERY")				//"query";
	public static val _OF_CLASS			= getString("_OF_CLASS")			//"ofClass"
	public static val _SUBCLASS_OF		= getString("_SUBCLASS_OF")			//"subClassOf"
	public static val _INTERPUNCTION	= getString("_INTERPUNCTION")		//"Interpunction"
	public static val _GRAMMAR			= getString("_GRAMMAR")				//"Grammar"
	public static val _FORM				= getString("_FORM")				//"form"
	public static val _SHORT_CUT		= getString("_SHORT_CUT")			//"shortCut"
	
	public static val _DICTIONARY 		= getString("_DICTIONARY")			//"Dictionary"
	public static val _M 				= getString("_M")					//"m"
	public static val _W 				= getString("_W")					//"w"
	public static val SUBSTRING_ 		= getString("SUBSTRING_")			//'substring'
	@Deprecated //Continuous
	public static val SUFFIX_ 			= getString("SUFFIX_")				//"ing"
	public static val CONTINUOUS_ 		= getString("CONTINUOUS_")			//"continuous"
	
	public static val GRAMMAR_LINK_ 	= getString("GRAMMAR_LINK_");		//"grammarLink"
	public static val GRAMMAR_CLUSTER_	= getString("GRAMMAR_CLUSTER_");	//"GrammarCluster" //TODO: move to Dictionary bundle
	
	public static val _NONE				= getString("_NONE")				//"None"
	
}
