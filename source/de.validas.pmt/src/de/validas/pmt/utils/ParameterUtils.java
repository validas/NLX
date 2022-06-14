/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import metaModel.referenceProcess.ProcessModule;
import metaModel.terms.Binding;
import metaModel.terms.ListTerm;
import metaModel.terms.ListType;
import metaModel.terms.ParamRef;
import metaModel.terms.Parameter;
import metaModel.terms.ProjectParameter;
import metaModel.terms.Term;
import metaModel.terms.Type;
import metaModel.referenceProcess.Process;

/**
 * @author slotosch
 *
 */
public class ParameterUtils {

	public static String printParameters(ProcessModule pm) {
		String sParams="";
		Map<Parameter, Object> map = getPrintableParameters(pm);
		for (Parameter p:map.keySet()) {
			if (!sParams.equals("")) {
				sParams+=",";
			}
			sParams+=p.getName();
			Object valueOrType = getValueOrType(p,pm);
			if (valueOrType instanceof String) {
				sParams+="="+valueOrType;
			} else if (valueOrType instanceof Type) {
				sParams+=":"+TermUtils.printType((Type)valueOrType);
			}
		}
		return sParams;
	}

	/** returns a map of all printable parameters, mapping to - a Value (String) if defined, or a Type if no value */
	public static Map<Parameter,Object> getPrintableParameters(ProcessModule pm) {
		Map<Parameter, Object> sParams=new HashMap<Parameter, Object>();
		for (Parameter p:HierarchyModel.getAllParameters(pm)) {
			if (getShowParameter(p,pm) ) {
				sParams.put(p,getValueOrType(p,pm));
			}
		}
		return sParams;
	}
	public static boolean getShowParameter(Parameter p, ProcessModule pm) {
		// hide bound parameters+
		// System.out.println("getShowParameter("+p.getName()+")");
		if (hasValue(p, pm)) {
			return false;
		}
		// show declared parameters
		if (pm.getParameters().contains(p)) {
			return true;
		}
		if (usesParameter(pm, p)) {
			return true;
		}
		// only standard parameters are not hidden
		return (p instanceof ProjectParameter && p.getIteratorParameters().size()==0);
	}

	private static boolean usesParameter(ProcessModule pm, Parameter p) {
		TreeIterator<EObject>ti = pm.eAllContents();
		while (ti.hasNext()) {
			EObject eoNext=ti.next();
			if (eoNext instanceof ParamRef) {
				ParamRef pr=(ParamRef)eoNext;
				if (pr.getParameter()==p) {
					return true;
				}
			}
		}
		return false;
	}
	/** 
	 * return the value of the parameter (from a corresponding binding)
	 * searches bottom up), if nothing found: return type of parameter (if specified)
	 * @param p
	 * @param pm
	 * @return
	 */
	public static Object getValueOrType(Parameter p,ProcessModule pm) {
		for (Binding b:pm.getBindings()) {
			if (b.getParameter()==p) {
				return TermUtils.printTerm(b.getValue());
			}
		}
		if (pm.eContainer() instanceof ProcessModule) {
			return getValueOrType(p,(ProcessModule)pm.eContainer());
		}
		if (pm.eContainer() instanceof Process) {
			return getValueOrType(p,(Process)pm.eContainer());
		}
		// else: print typ (if present)
		if (p.getType()!=null) {
			p.getType();
		}
		return ":?";
	}	

	/** 
	 * return the value of the parameter (from a corresponding binding)
	 * searches bottom up), if nothing found: return type of parameter (if specified)
	 * @param p
	 * @param pm
	 * @return
	 */
	public static Object getValueOrType(Parameter p,Process pm) {
		for (Binding b:pm.getBindings()) {
			if (b.getParameter()==p) {
				return TermUtils.printTerm(b.getValue());
			}
		}
		// else: print typ (if present)
		if (p.getType()!=null) {
			return p.getType();
		}
		return ":?";
	}	

	/** 
	 * return the set of values to be instantiated for this parameter, null is no value list found
	 */
	public static Set<String> getInstantiationValues(Parameter p,ProcessModule pm) throws  Exception {
		Parameter pInst = p.getValueFromListParameter();
		if (pInst==null) {
			return null;
		}
		for (Binding b:pm.getBindings()) {
			if (b.getParameter()==pInst) {
				return getBoundValuesForParameter(pInst, b);
			}
		}
		// check in super process
		if (pm.eContainer() instanceof ProcessModule) {
			return getInstantiationValues(p, (ProcessModule)pm.eContainer());
		}
		if (pm.eContainer() instanceof Process) {
			return getInstantiationValues(p, (Process)pm.eContainer());
		}
		return null;
	}

	public static Set<String> getInstantiationValues(Parameter p,Process proc) throws  Exception {
		Parameter pInst = p.getValueFromListParameter();
		if (pInst==null) {
			return null;
		}
		for (Binding b:proc.getBindings()) {
			if (b.getParameter()==pInst) {
				return getBoundValuesForParameter(pInst, b);
			}
		}
		return null;
	}
	private static Set<String> getBoundValuesForParameter(Parameter pInst, Binding b) throws Exception {
		Term tValue = b.getValue();
		if (tValue==null || tValue.getType()==null) {
			throw new Exception("Instanciated value "+TermUtils.printTerm(tValue)+" of ListParameter "+pInst.getName()+" has no type");
		}
		if (!(tValue.getType() instanceof ListType)) {
			throw new Exception("ListParameter "+pInst.getName()+" has noListType:"+TermUtils.printType(tValue.getType()));
		}
		if (!(tValue instanceof ListTerm)) {
			throw new Exception("ListParameter "+TermUtils.printTerm(tValue)+" is no ListTerm");
		}
		ListTerm lt=(ListTerm)tValue;
		Set<String> sRes= new HashSet<String>();
		for (Term tRes:lt.getTerms()) {
			sRes.add(TermUtils.printTerm(tRes));
		}
		return sRes;
	}
	/** 
	 * return the value of the parameter (from a corresponding binding)
	 * searches bottom up), if nothing found: return type of parameter (if specified)
	 * @param p
	 * @param pm
	 * @return
	 */
	public static boolean hasValue(Parameter p,ProcessModule pm) {
		for (Binding b:pm.getBindings()) {
			if (b.getParameter()==p) {
				return true;
			}
		}
		if (pm.eContainer() instanceof ProcessModule) {
			return hasValue(p,(ProcessModule)pm.eContainer());
		}
		if (pm.eContainer() instanceof Process) {
			return hasValue(p,(Process)pm.eContainer());
		}
		return false;
	}

	/** 
	 * return the value of the parameter (from a corresponding binding)
	 * searches bottom up), if nothing found: return type of parameter (if specified)
	 * @param p
	 * @param pm
	 * @return
	 */
	public static boolean hasValue(Parameter p,Process pm) {
		for (Binding b:pm.getBindings()) {
			if (b.getParameter()==p) {
				return true;
			}
		}
		return false;
	}
	private static Set<Parameter> getAllListParameters(ProcessModule pm) {
		Set<Parameter> sRes = new HashSet<Parameter>();
		for (Parameter p:pm.getParameters()) {
			if (p.getType() instanceof ListType) {
				sRes.add(p);
			}
		}
		if (pm.eContainer() instanceof ProcessModule) {
			sRes.addAll(getAllListParameters((ProcessModule)pm.eContainer()));
		}
		return sRes;

	}
}