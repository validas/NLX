package de.validas.utils.io.filesystem;

import de.validas.utils.data.lists.IAppendable;

public class PathFactory {

	public PathFactory() {

	}

	public IAppendable createDevice(String device) {
		return new LocalDevice(device);
	}
	
	public IAppendable createUncDevice(String device) {
		return new UncDevice(device);
	}
	
	public IAppendable createDirectory(String directory) {
		return new Directory(directory);
	}
	
	public IAppendable createFile(String file) {
		return new File(file);
	}

	public IAppendable createHost(String host) {
		return new Host(host);	
	}

	public IAppendable createDirOrUnc(PathElement precessor, String segment) {
		if (precessor instanceof IHost)
			return new UncDevice(segment);
		else 
			return new Directory(segment);
	}


}
