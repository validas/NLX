package de.validas.nlx.dictionary;

import java.util.HashMap;
import java.util.List;

import org.eclipse.xtext.builder.debug.IBuildLogger;
import org.neo4j.driver.v1.Record;

import de.validas.nlx.ai.IDbAccess;
import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.dictionary.type.ITypeHierarchy;
import de.validas.nlx.dictionary.type.TypeAttributes;
import de.validas.nlx.dictionary.type.ITypeInfo;
import de.validas.utils.data.types.XPair;

import java.util.Set;
import org.neo4j.driver.v1.types.Node;

public interface IDictionaryAccess {
	
	public abstract void addToDictionary(String word, String type);
	
	public abstract ITypeInfo findInDictionary(String word);

	public abstract IDbAccess getDbAccessor();
	
	public abstract boolean isConnected();
	
	public abstract ITypeInfo getLinkTypes(String name,  String fromType);
	
	public abstract ITypeInfo getLinkTypes(String name,  String fromType, boolean update);
	
	public abstract IBuildLogger getLogger();

	public abstract List<String> listAllLabel(String wordClass);
	
	public abstract List<String> listAllLabelTo(String label, String linkLabel, String targetL);

	public abstract List<ITypeHierarchy> resolveTypeHierarchy(String root, String branch);

	public abstract TypeAttributes addTypeToWord(String word, String type);

	public abstract void replaceTypeForWord(String word, String oldType, String newType);

	public abstract void addSuccessor(DictItem source, DictItem target, Set<String> strings); 
	
	public abstract void addSuccessor(DictItem source, DictItem target, Set<String> strings, List<ITypeAttributes> attribs);

	public abstract List<Record> processPrefix(String string, List<ITypeAttributes> attributes);

	public abstract List<Record> processSuffix(String string, List<ITypeAttributes> attributes);

	public abstract void deleteNode(Node node); 
	
	public abstract List<Record> deletePatternFromNode(Node node);
	
	public abstract List<Record> disableNode(Node node, ITypeAttributes start, ITypeAttributes end, int cardinality, XPair<String, ITypeAttributes> attrs);



}
