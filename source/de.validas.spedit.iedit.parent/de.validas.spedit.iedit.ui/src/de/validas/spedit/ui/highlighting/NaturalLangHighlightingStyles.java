package de.validas.spedit.ui.highlighting;

import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;

/**
 * 
 * @author Felix Schaller
 *
 */

@SuppressWarnings("restriction")
public interface NaturalLangHighlightingStyles extends HighlightingStyles {

	/**
	 * Syntax Highlighting
	 * -------------------
	 * given rules: 
	 * 
	 * #			public static final int RULE_ALPHA=21;
	 * #	    	public static final int RULE_ALPHA_NUMERIC_C=23;
	 *     public static final int RULE_SMILEY=11;
	 * #		    public static final int RULE_NEWLINE=5;
	 * #		    public static final int RULE_ESCAPED_CHAR=19;
	 * #		    public static final int RULE_STRING=8;
	 *     public static final int RULE_EMAIL=17;
	 *     public static final int RULE_IGNORED=12;
	 * #		    public static final int RULE_SL_COMMENT=30;
	 *     public static final int RULE_DOUBLE=14;
	 *     public static final int RULE_ARROW=10;
	 * #		    public static final int EOF=-1;
	 * #		    public static final int T__31=31;
	 * #		    public static final int T__32=32;
	 * #		    public static final int RULE_EMAIL_ALPHA=24;
	 * #		    public static final int RULE_ID=15;
	 * #		    public static final int RULE_WS=18;
	 * #		    public static final int RULE_DECORATIONS=26;
	 * #		    public static final int RULE_EOL=27;
	 * #		    public static final int RULE_ALPHA_NUMERIC=22;
	 * #		    public static final int RULE_URL_PROTOCOL=28;
	 *     public static final int RULE_LIST_POINT=6;
	 * #		    public static final int RULE_ANY_OTHER=9;
	 * #		    public static final int RULE_ALPHA_CAPITAL=20;
	 * 	   public static final int RULE_KOMMA=7;
	 * #		    public static final int RULE_INT=13;
	 * #		    public static final int RULE_URL=16;
	 * #		    public static final int RULE_ML_COMMENT=29;
	 * 	   public static final int RULE_FULL_STOP=4;
	 * #		    public static final int RULE_URL_ALPHA=25;
	 */
	
	public static final String KOMMA = "komma";
	
	public static final String FULL_STOP ="full.stop";
	
	public static final String DOUBLE = "double";

	public static final String SYMBOLS = "symbols";
	
	public static final String EMAIL = "email";
	
	public static final String URL = "url";
	
	public static final String LIST_POINT = "list.point";
	
	public static final String ITWORD = "itWord";
	
	public static final String IGNORED ="ignored.Text";

}
