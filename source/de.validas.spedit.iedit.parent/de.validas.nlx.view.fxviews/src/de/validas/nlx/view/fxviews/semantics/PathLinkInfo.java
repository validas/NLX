/**
 * (c)2022 felixschaller.com 
 */
package de.validas.nlx.view.fxviews.semantics;

/**
 * @author schaller
 */

import java.util.List;

import org.neo4j.driver.v1.Record;

/**
 * class that extends LinkInfo to store exclusion patterns
 * @author schaller
 *
 */
public class PathLinkInfo extends LinkInfo implements ILinkInfo {

	private List<Record> recMap;

	public PathLinkInfo(List<Record> recMap) {
		//TODO: 03.06.2022 should check for empty List or null
		super(recMap.get(0));
		this.recMap = recMap;
	}

	public List<Record> getRecordMap() {
		return recMap;
	}

}
