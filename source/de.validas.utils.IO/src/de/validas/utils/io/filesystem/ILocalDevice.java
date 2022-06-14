package de.validas.utils.io.filesystem;

import de.validas.utils.data.lists.IRootAppendable;

public interface ILocalDevice extends IRootAppendable {
	
	public String getDeviceName();
	public void setDeviceName(String name);
}
