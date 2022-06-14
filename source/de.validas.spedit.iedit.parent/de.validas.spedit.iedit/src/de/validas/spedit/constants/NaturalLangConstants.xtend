package de.validas.spedit.constants

class NaturalLangConstants extends AbstractConstantClass {
	
	public static val pluginName = 				getString("pluginName")				//"de.validas.spedit.iedit
	public static val providerName = 			getString("providerName") 			//"My Company
	public static val _Capitalize_Name = 		getString("_Capitalize_Name")		//"Word should start with a capital
																				//
	public static val _TYPO = 					getString("_TYPO") 					//"Typography
	public static val _TYPO_ = 					"Typography"						// **** required for some annotations
	
	public static val _INVALID_NAME = 			getString("_INVALID_NAME")			//"invalidName
	public static val _TRAIN_DICT = 			getString("_TRAIN_DICT")			//"trainDictionary
	public static val _TRAIN_DICT_ =        	"trainDictionary"					// **** required for some annotations
																				//
	public static val _CAPITALIZE_NAME = 		getString("_CAPITALIZE_NAME")		//"Word should start with a capital
	public static val _TRAIN_TYPE = 			getString("_TRAIN_TYPE")			//"Word type for \"%s\" \nnot trained
	public static val _MATCH_PATTERN = 			getString("_MATCH_PATTERN")			//"[a-zA-ZäöüÄÖÜêÊéÉèÈóÓòÒûÛôÔ]+
	public static val _LINE_POSITION_REGEX 		= getString("_LINE_POSITION_REGEX") // \\[Line:\\h+(?<line>\\d+)\\h+\\|\\h+Column:\\h+(?<column>\\d+)\\]
	
	public static val ENCODING 					= getString("ENCODING") 				// = "UTF-8"
	public static val MODEL_EXTENSION 			= getString("MODEL_EXTENSION")			// = "pmt"

	public static val _NEW_LINE 				= getString("_NEW_LINE")				// = "\r\n"
	
	public static val _INTRODUCTION 			= getString("_INTRODUCTION")			// = "Introduction"
	public static val _INTRO_DESC				= getString("_INTRO_DESC")              // = "Foreword and Content Table"
	public static val _REGEX_PATTERN			= getString("_REGEX_PATTERN")			// = "[a-zA-ZäöüÄÖÜ]+"
	public static val _DECIMAL_REGEX			= getString("_DECIMAL_REGEX")			// = "-?\\d+(\\.\\d+)?"
	public static val _SUB_REQUIREMENT 			= getString("_SUB_REQUIREMENT")			// = "Sub Requirement"
	public static val _FOOTNOTE 				= getString("_FOOTNOTE")				// = "Footnote"
	public static val _SUB_CHAPTER 				= getString("_SUB_CHAPTER")				// = "Sub Chapter"
	public static val _MAIN_CHAPTER 			= getString("_MAIN_CHAPTER")			// = "Main Chapter"
	public static val _DASH  					= getString("_DASH")					// = "-"
	public static val _NOTE                     = getString("_NOTE")					// = "Note"
	public static val _EXAMPLE                  = getString("_EXAMPLE")					// = "Example"
	
	public static val _INTERNAL_REF_NODE		= getString("_INTERNAL_REF_NODE")		//"Internal Reference Node"
	
	public static val NAME_MIN_LEN 				= 10
	

}