/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

//import com.sun.org.apache.bcel.internal.generic.LMUL;

import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.Requirement;
import metaModel.suptertype.Named;
import metaModel.terms.Binding;
import metaModel.terms.ProcessParameter;
import metaModel.terms.Parameter;
import metaModel.terms.Term;
import metaModel.terms.Type;

/**
 * @author slotosch
 * checks the configured ness of the process:
 * - all Configuration Parameters have to be bound
 * - There have to be some requirements claims in some prozess modules
 *  (currently just done by printing the info to the user)
 */
public class ConfigurationChecker {

	public static List<String> checkConfiguration(Process n,String sName) {

		List<String> lRes =  Configuration.printConfiguration(n);
		TreeIterator<EObject> ti = n.eAllContents();
		while (ti.hasNext()) {
			EObject eo=ti.next();
			checkConfigurationEObject(eo, lRes);
		}
		lRes.add("PROCESS COMPLETE="+Configuration.isProcessComplete(n));
		lRes.add("PLAN COMPLETE="+Configuration.isPlanningComplete(n));
		lRes.add("PROJECT INSTANTIATION COMPLETE="+Configuration.isProjectComplete(n));
		return lRes;
	}

	private static boolean checkConfigurationEObject(EObject n,List<String> lResult) {
		if (n instanceof Binding) {
			return checkConfigurationBinding((Binding)n,lResult);
		}
		return true;
	}

	private static boolean checkConfigurationBinding(Binding n, List<String> lResult) {
		Term t=n.getValue();
		if (t==null) {
			lResult.add("no value found in binding for "+n.getParameter().getName());
			return false;
		}
		if (!TypeChecker.isConstant(t)) {
			lResult.add("no constant value ("+TermUtils.printTerm(t)+") found in binding for "+n.getParameter().getName());
			return false;
		}
		return true;
	}

}
