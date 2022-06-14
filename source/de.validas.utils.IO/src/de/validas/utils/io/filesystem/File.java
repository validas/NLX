package de.validas.utils.io.filesystem;

import com.google.common.io.Files;

import de.validas.utils.data.lists.IAppendable;


public class File extends Directory implements IFile {
	
	public final static char EXTENSION_SEPARATOR = '.';

	String extension;
	
	public File(String name) {
		this (Files.getNameWithoutExtension(name), Files.getFileExtension(name)); 
		
	}
	
	public File (String fileName, String extension) {
		super (fileName);
		this.extension = extension;
	}

	String getNameWoExtension(){
		return super.getName();
	}
	
	/* (non-Javadoc)
	 * @see de.validas.utils.io.filesystem.Directory#getName()
	 */
	@Override
	public String getName() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName());
		sb.append(EXTENSION_SEPARATOR);
		sb.append(extension);
		return sb.toString();
	}

	/**
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * @param extension the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
}
