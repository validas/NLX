/**
 * 
 */
package de.validas.spedit.presets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.xtext.xbase.lib.Conversions;

import com.google.common.collect.Iterables;

/**
 * @author schaller
 *
 */
public enum NlxDictConstants {  //TODO: 28.02.22 replace by plugin.properties values

	NOUN("Noun"),
	NAME("Name"),
	PRONOUN("Pronoun"),
	ARTICLE("Article"),
	VERB("Verb"),
	ADJECTIVE("Adjective"),
	ADVERB("Adverb"),
	PREPOSITION("Preposition"),
	CONJUNCTION("Conjunction"),
	INTERJECTION("Interjection"),
	SPECIAL_TYPE("SpecialType");
	
private static final String[] wordDefault = { "None" };
	  
	String nodeType;
	protected static final List<String> allTypes = new ArrayList<String>(
			Arrays.asList(
					NOUN.toString(),
					NAME.toString(),
					PRONOUN.toString(),
					ARTICLE.toString(),
					VERB.toString(),
					ADJECTIVE.toString(),
					ADVERB.toString(),
					PREPOSITION.toString(),
					CONJUNCTION.toString(),
					INTERJECTION.toString(),
					SPECIAL_TYPE.toString())); 
	
	protected static final List<String> allTypesWNone =  Stream.concat(Arrays.asList(wordDefault).stream(), allTypes.stream())
            .collect(Collectors.toList());
	
	/**
	 * constructor
	 */
	private NlxDictConstants(String nodeType) {
		this.nodeType = nodeType;
	}
	
	@Override
	public String toString() {
		return nodeType;
	}
	
	public String getNodeType()
	{
		return nodeType;
	}
	
	public static List<String> getAllTypes(){
		return allTypes;
	}
	
	public static List<String> getAllTypesWithNone(){
		return allTypesWNone;
	}

}
