/**
 * 
 */
package de.validas.vvt.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.validas.vvt.Project;
import de.validas.vvt.VvtPackage;

/**
 * @author slotosch
 *
 */
public class Persistency {

	public static void saveModel(Project tc, String path) throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new VvtResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(VvtPackage.eNS_URI, VvtPackage.eINSTANCE);
		final URI fileUri = URI.createFileURI(new File(path).getAbsolutePath());
		final Resource res = resourceSet.createResource(fileUri);
		res.getContents().add(tc);

		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
			Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		res.save(saveOptions);
	}

}
