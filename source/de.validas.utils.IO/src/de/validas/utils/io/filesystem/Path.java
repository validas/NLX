package de.validas.utils.io.filesystem;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.BooleanSupplier;

import org.eclipse.core.runtime.IPath;

import de.validas.utils.data.lists.IAppendable;
import de.validas.utils.data.lists.ILeafAppendable;
import de.validas.utils.data.lists.LinkedList;

public class Path extends org.eclipse.core.runtime.Path {

	LinkedList<IAppendable> pathElements = null;

	PathFactory pathFactory = new PathFactory();

	public Path(String fullPath) {

		super(Paths.get(fullPath).normalize().toString());
		// String normalizedPath = Paths.get(fullPath).normalize().toString();

		pathElements = new LinkedList<IAppendable>();
		String device = getDevice();
		Iterator<String> iterator = Arrays.asList(this.segments()).iterator();

		if (device != null)
			pathElements.add(pathFactory.createDevice(device));

		if (isUNC() && iterator.hasNext()) {
			pathElements.add(pathFactory.createHost(iterator.next()));
		}

		addPathElements(iterator);

	}

	public Path(String device, String path) {

		super(device, path);
		pathElements = new LinkedList<IAppendable>();
		String internaldevice = getDevice();
		Iterator<String> iterator = Arrays.asList(this.segments()).iterator();

		if (internaldevice != null)
			pathElements.add(pathFactory.createDevice(internaldevice));
		else if (isUNC() && iterator.hasNext()) {
			pathElements.add(pathFactory.createHost(iterator.next()));
		}

		addPathElements(iterator);
	}

	private void addPathElements(Iterator<String> iterator) {

		while (iterator.hasNext()) {
			String segment = iterator.next();
			if (iterator.hasNext())
				pathElements.add(pathFactory.createDirOrUnc((PathElement) getLastPathElement(), segment));
			else
				addDirectoryOrFile(segment);
		}

	}

	private void addDirectoryOrFile(String segment) {
		java.io.File file = this.toFile();
		if (file.exists()) {
			if (file.isFile())
				pathElements.add(pathFactory.createFile(segment));
			else 
				pathElements.add(pathFactory.createDirOrUnc((PathElement) getLastPathElement(), segment));
			
		} else {
			if (getFileExtension() != null)
				pathElements.add(pathFactory.createFile(segment));
			else
				pathElements.add(pathFactory.createDirOrUnc((PathElement) getLastPathElement(), segment));
		}
	}

	public IAppendable getPathElement(int index) {
		int maxIndex = pathElements.size() - 1;
		if (index < 0 || index > maxIndex)
			throw new IndexOutOfBoundsException(
					String.format("Access Error Index: %1$d outside Bounds of %2$d", index, maxIndex));
		return pathElements.get(index);
	}

	public IAppendable getLastPathElement() {
		if (pathElements.size() == 0)
			return null;
		return getPathElement(pathElements.size() - 1);
	}

	public java.io.File toFilePath() {
		return ((PathElement) getLastPathElement()).buildPath();
	}

	public boolean exists() {
		PathElement last = ((PathElement) getLastPathElement());
		// TODO: relative path will not work
		return last.exists();

	}

	@Override
	public IPath append(String segment) {
		if (!(getLastPathElement() instanceof ILeafAppendable)) {
			addDirectoryOrFile(segment);
		}
		return super.append(segment);
	}

	public void prepend(String path) {
		if (!isAbsolute()) {
			Path absolute = new Path(path);
			pathElements.addAll(0, absolute.getAllElements());
		}
	}

	private Collection<? extends IAppendable> getAllElements() {
		return pathElements;
	}

	public int size() {
		return pathElements.size();
	}

	public int length() {
		return size();
	}
}
