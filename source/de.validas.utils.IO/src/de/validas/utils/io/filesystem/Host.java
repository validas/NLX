package de.validas.utils.io.filesystem;

public class Host extends PathElement implements IHost {

	public Host(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHostName() {
		return name;
	}

	@Override
	public void setHostName(String name) {
		setName(name);
	}
	
	public String getName() {
		return String.format("%1$s%1$s%2$s", java.io.File.separator, name);
	}

}
