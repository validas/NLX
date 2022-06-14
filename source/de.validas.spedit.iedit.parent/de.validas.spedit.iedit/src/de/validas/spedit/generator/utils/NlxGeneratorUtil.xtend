package de.validas.spedit.generator.utils

import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.ecore.resource.Resource
import java.util.regex.Pattern

import static de.validas.spedit.constants.NaturalLangConstants._DECIMAL_REGEX

class NlxGeneratorUtil {
	
	static Pattern pattern = Pattern.compile(_DECIMAL_REGEX);
	
	def static IPath findResourceInWS(Resource resource) {
	
		ResourcesPlugin.workspace.root.findMember(resource.URI.toPlatformString(true)).location
		
	}
	
	def static isNumeric(String strNum) {
	    if (strNum === null) {
	        return false; 
	    }
	    pattern.matcher(strNum).matches();
	}
	
	def static getNumeric(String strNum){
		 if (strNum === null) {
	        return null 
	    }
	    var match = pattern.matcher(strNum) 
	    if (match.find)
		    match.group(0)
	}
	
	def static StrToNum(String strNum){
		if (strNum === null) {
        	return null;
	    }
	    
	    var int i
	    try {
	        i = Integer.parseInt(strNum)
	    } catch (NumberFormatException nfe) {
	        return null;
	    }
	    i
	}
	
}
