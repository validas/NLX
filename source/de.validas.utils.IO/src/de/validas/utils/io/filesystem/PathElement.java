/**
 * 
 */
package de.validas.utils.io.filesystem;

import java.io.IOException;

import de.validas.utils.data.lists.IAppendable;
import de.validas.utils.data.lists.IRootAppendable;

/**
 * @author Felix Schaller
 *
 */
public abstract class PathElement implements IAppendable{

	//TODO: all PathElements and its descendants should trigger listeners to update info's in Mother Class via Listener calls
	// Contained Path Objects can be modified externally w.o. the Mother Class knowing about it.
	
	/**
	 * Abstract Version of a Path element used for Path Objects
	 */
	protected String name;
	
	protected IAppendable precessor = null;
	protected IAppendable successor = null;
	
	public PathElement(String name) {
		this.name = name;
	}
	
	@Override
	public IAppendable getSuccessor() {
		return successor;
	}

	@Override
	public void setSuccessor(IAppendable next) {
		successor = next;
	}

	@Override
	public IAppendable getPrecessor() {
		return precessor;
	}

	@Override
	public void setPrecessor(IAppendable previous) {
		precessor = previous;
	}
	
	public String getName()
	{
	  return this.name;
	}
	
	public void setName(String name)
	{
	  this.name = name;	
	}
	
	public boolean exists() {
		//TODO: actually this is task of
		try {
			return buildPath().getCanonicalFile().exists();
		} catch (IOException e) {
			return false;
		}
	}

	public java.io.File buildPath() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		
		
		if (precessor instanceof PathElement) {
			PathElement accessor = (PathElement) precessor;
			sb.insert(0, java.io.File.separator);
			do {
				sb.insert(0, accessor.getName());
				IAppendable newaccessor = accessor.getPrecessor();
				if (newaccessor instanceof PathElement) {
					accessor = (PathElement) newaccessor;
					sb.insert(0, java.io.File.separator);
				} 
				else 
					accessor = null;
				
			} while (accessor != null || accessor instanceof IRootAppendable);
			return new java.io.File(sb.toString());
		} else 
			return null;
	}

}
