package de.validas.utils.io.filesystem;

import de.validas.utils.data.lists.IRootAppendable;

public interface IHost extends IRootAppendable {
	
	public String getHostName();
	public void setHostName(String name);

}
