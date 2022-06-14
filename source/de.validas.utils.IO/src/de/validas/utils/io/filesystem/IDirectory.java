package de.validas.utils.io.filesystem;

import de.validas.utils.data.lists.IAppendable;

public interface IDirectory extends IAppendable{

	public String getName();
	public void setName(String name);
	public boolean exists();

}
