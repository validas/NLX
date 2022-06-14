/**
 * 
 */
package de.validas.utils.io.filesystem;

/**
 * @author Felix Schaller
 *
 */
public class FileExt {

	/**
	 * holds Extension of Files
	 */
	protected String name;
	
	
	public FileExt() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public String getNameWSeparator() {
		return String.format(".{0}", name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
