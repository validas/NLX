/**
 * 
 */
package de.validas.nlx.view.fxviews.semantics.constants;

/**
 * @author schaller
 * @deprecated: replace by plugin.properties constants
 */
@Deprecated
public enum SubClassType {
        EXT_BRACKET_SENTENCE("ExtBracketSentence"), 
        BRACKET_SENTENCE("BracketSentence"), 
        INTERPUNCTION("Interpunction"),
	    SEPARATOR("Separator");
        
        private String name;
        private SubClassType(String name) {
            this.name = name;
        }
       
        @Override
        public String toString(){
            return name;
        } 

}
