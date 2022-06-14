package de.validas.pmt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

//import com.sun.org.apache.xpath.internal.operations.Lt;
//import com.sun.xml.internal.ws.assembler.dev.TubeFactory;

import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.ProcessModule;
import metaModel.suptertype.Named;
import metaModel.terms.Binding;
import metaModel.terms.Constant;
import metaModel.terms.EnumValue;
import metaModel.terms.EnumValueRef;
import metaModel.terms.ListTerm;
import metaModel.terms.ListType;
import metaModel.terms.Parameter;
import metaModel.terms.Term;
import metaModel.terms.TermsFactory;
import metaModel.terms.impl.TermsFactoryImpl;

/**
 * some utilies for Bindings creation (automated from Excel,... )
 * @author slotosch
 *
 */
public class BindingUtils {

	static final String PARAMETER_CONTAINER = "Container";
	static final String PARAMETER_TYPE = "Parameter Type";
	static final String PARAMETER_VALUE = "Parameter Value";
	public static TermsFactory factory = new TermsFactoryImpl();

	/** creates a binding (or finds) for all values for Parameter and adds it as a sibling to it 
	 * @throws Exception */
	public static Binding generateBinding(Parameter parameter, String sValues,List<String> lMsg) throws Exception {
		List<String> lValues = new LinkedList<String>();
		StringTokenizer st = new StringTokenizer(sValues, ",");
		while (st.hasMoreTokens()) {
			String sVal=st.nextToken();
			lValues.add(sVal);
		}
		return generateBinding(parameter,lValues,lMsg);
	}

	/** creates a binding (or finds) for all values for Parameter and adds it as a sibling to it 
	 * @throws Exception */
	public static Binding generateBinding(Parameter parameter, List<String> lValues,List<String> lMsg) throws Exception {
		EObject eoCont=parameter.eContainer();
		Binding bResult = findBinding(eoCont, parameter);
		if (bResult!=null) {
			lMsg.add("Extending existing Binding for Parameter "+parameter.getName());
			Term tVal = bResult.getValue();
			if (tVal!=null) {
				lMsg.add("existing values are:"+TermUtils.printTerm(tVal));
			}
		} else {
			bResult = factory.createBinding();
			lMsg.add("Created new Binding for Parameter "+parameter.getName());
			bResult.setParameter(parameter);
			if (parameter.getType() instanceof ListTerm || lValues.size()>1) {
				ListTerm lt = factory.createListTerm();	
				bResult.setValue(lt);
			}
			if (eoCont instanceof ProcessModule) {
				((ProcessModule)eoCont).getBindings().add(bResult);
			} else if (eoCont instanceof Process) {
				((Process)eoCont).getBindings().add(bResult);
			} else {
				lMsg.add("cannot add Binding to container "+eoCont.eClass().getName()+" of selected Parameter "+parameter.getName());
			}
		}
		Term tList = bResult.getValue();
		if (tList==null) {
			ListTerm lt=factory.createListTerm();
			bResult.setValue(lt);
		} else {
			if (!(tList instanceof ListTerm)) {
				String sMsg="Error cannot extend found Binding for Parameter "+parameter.getName()+": Value "+TermUtils.printTerm(tList)+" is not a ListTerm but "+tList.eClass().getName()+". Please remove it and retry";
				lMsg.add(sMsg);
				throw new Exception(sMsg);
			}
		}
		Term tValues = bResult.getValue();
		int iFound=0;
		int iNew=0;
		for (String sVal:lValues) {
			if (tValues instanceof ListTerm) {
				if (addValueToListBinding((ListTerm)tValues, sVal, lMsg)) {
					iNew++;
				}
			} else {
				if (tValues==null) {
					tValues = addSingleValueBinding(sVal, bResult,lMsg);
					iNew++;
				} else {
					if (sVal.equals(TermUtils.printTerm(tValues))) {
						lMsg.add("reusing value "+sVal);
						iFound++;
					} else {
						lMsg.add("Error cannot add more values to non-list term "+TermUtils.printTerm(tValues)+". Ignoring value "+sVal);
					}
				}
			}
		}
		lMsg.add("Created "+iNew+" new values for "+parameter.getName()+" (while reusing "+iFound+")");
		return bResult;
	}

	private static boolean addValueToListBinding(ListTerm lt, String s,List<String> lMsg) {
		for (Term t:lt.getTerms()) {
			if (TermUtils.printTerm(t).equals(s)) {
				lMsg.add("Reusing value "+s);
				return false;
			}
		}
		EnumValue ev =TermUtils.findEnumValue(lt, s);
		if (ev!=null) {
			EnumValueRef evr= factory.createEnumValueRef();
			evr.setEnumValue(ev);
			lt.getTerms().add(evr);
			return true;
		}
		Constant cNew = factory.createConstant();
		cNew.setValue(s);
		lt.getTerms().add(cNew);
		lMsg.add("Adding new value "+s);
		return true;
	}

	private static Binding findBinding(EObject eo,Parameter parameter) {
		Binding bUp=findBindingUpwards(eo, parameter);
		if (bUp!=null) {
			return bUp;
		}
		// finally search children
		TreeIterator<EObject> it = eo.eAllContents();
		while (it.hasNext()) {
			EObject eChild=it.next();
			if (eChild instanceof Binding && ((Binding)eChild).getParameter()==parameter) {
				return (Binding)eChild;
			}
		}
		return null;
	}
	private static Binding findBindingUpwards(EObject eo,Parameter parameter) {
		if (eo instanceof Binding) {
			return (Binding)eo;
		}
		if (eo instanceof ProcessModule) {
			ProcessModule pm=(ProcessModule)eo;
			for (Binding b:pm.getBindings()) {
				if (b.getParameter()!=null && b.getParameter()==parameter) {
					return b;
				}
			}
		}
		if (eo instanceof Process) {
			Process process=(Process)eo;
			for (Binding b:process.getBindings()) {
				if (b.getParameter()!=null && b.getParameter()==parameter) {
					return b;
				}
			}
		}
		if (eo.eContainer() instanceof EObject) {
			return findBindingUpwards(eo.eContainer(), parameter);
		}
		return null;
	}


	private static Parameter findParameter(EObject eo,String sParName) {
		if (eo instanceof Parameter) {
			return (Parameter)eo;
		}
		if (eo instanceof ProcessModule) {
			ProcessModule pm=(ProcessModule)eo;
			for (Parameter p:pm.getParameters()) {
				if (sParName.equals(p.getName())) {
					return p;
				}
			}
			for (Parameter p:pm.getParameterReferences()) {
				if (sParName.equals(p.getName())) {
					return p;
				}
			}
		}
		if (eo instanceof Process) {
			Process process=(Process)eo;
			for (Parameter p:process.getParameters()) {
				if (sParName.equals(p.getName())) {
					return p;
				}
			}
		}
		if (eo.eContainer() instanceof EObject) {
			return findParameter(eo.eContainer(), sParName);
		}
		// finally search children
		TreeIterator<EObject> it = eo.eAllContents();
		while (it.hasNext()) {
			EObject eChild=it.next();
			if (eChild instanceof Parameter && ((Parameter)eChild).getName().equals(sParName)) {
				return (Parameter)eChild;
			}
		}
		return null;
	}


	/** Excel import: for every tab create a binding/parameter (except if only one Parameter/Binding has been selected */
	public static int generateBinding(EObject selected, Map<String, List<List<String>>> neu, List<String> logs) {
		if (selected instanceof Parameter) {
			return importParameter(selected,((Parameter)selected).getName(),neu,logs);
		}
		if (selected instanceof Binding) {
			if (((Binding)selected).getParameter()==null) {
				logs.add("Error: no parameter found for selected Binding");
				return 0;
			}
			return importParameter(selected,((Binding)selected).getParameter().getName(),neu,logs);
		}
		int iSum=0;
		for (String sParamName:neu.keySet()) {
			Parameter p=findParameter(selected, sParamName);
			if (p==null) {
				// default: Project Parameter (most likely)
				p=factory.createProjectParameter();
				p.setName(sParamName);
				logs.add("Created new Parameter "+sParamName);
				if (selected instanceof ProcessModule) {
					((ProcessModule)selected).getParameters().add(p);
				} else if (selected instanceof Process) {
					((Process)selected).getParameters().add(p);
				}
			}
			iSum+=importParameter(selected,sParamName, neu, logs);
		}
		return iSum;
	}

	private static int importParameter(EObject selected,String name, Map<String, List<List<String>>> map, List<String> logs) {
		if (!map.containsKey(name)) {
			logs.add("Error no Tab "+name+" found in Excel file for Parameter "+name+". Ignoring");
			return 0;
		}
		List<List<String>> lValuesTab=map.get(name);
		if (lValuesTab.size()==0) {
			logs.add("Error no Data found in Tab "+name+" found in Excel file for Parameter "+name+".");
			return 0;
		}
		List<String> lHeader=lValuesTab.get(0);
		if (lHeader.size()==0 || lHeader.get(0)==null) {
			logs.add("Error no Header information found in Tab "+name+" found in Excel file for Parameter "+name+".");
			return 0;
		}
		if (!lHeader.get(0).trim().equalsIgnoreCase(PARAMETER_VALUE)) {
			logs.add("Incorrect Header (Expecting '"+PARAMETER_VALUE+"') found in Tab "+name+" found in Excel file for Parameter "+name+".");
			return 0;
		}
		if (lValuesTab.size()==1) {
			logs.add("igoring empty table for "+name);
			return 0;
		}
		Parameter parameter = findParameter(selected, name);
		Binding binding = findBinding(selected, parameter);
		if (binding==null) {
			binding = factory.createBinding();
			binding.setParameter(parameter);
			logs.add("Created new Binding for Parameter "+parameter.getName());
			if (parameter.getType() instanceof ListType || map.get(name).size()>1) {
				ListTerm lt=factory.createListTerm();
				binding.setValue(lt);
			}
			insertBinding(selected, logs, parameter, binding);
		}
		Term tValues=binding.getValue();
		int iRes=0;
		boolean bHeaderRow=true;
		for (List<String> sRow:lValuesTab) {
			if (bHeaderRow) {
				bHeaderRow=false;
				continue;
			}
			String sVal="";
			if (sRow.size()>0 && sRow.get(0)!=null) {
				sVal=sRow.get(0);
			}
			if (!sVal.trim().equals("")) {
				if (tValues instanceof ListTerm) {
					if (addValueToListBinding((ListTerm)tValues, sVal, logs)) {
						iRes++;
					}
				} else {
					if (tValues==null) {
						tValues = addSingleValueBinding(sVal, binding,logs);
						iRes++;
					} else {
						if (sVal.equals(TermUtils.printTerm(tValues))) {
							logs.add("reusing value "+sVal);
						} else {
							logs.add("Error cannot add more values to non-list term "+TermUtils.printTerm(tValues)+". Ignoring value "+sVal);
						}
					}
				}
			}
		}
		return iRes;
	}

	private static Term addSingleValueBinding(String sVal, Binding b,List<String> logs) {
		EnumValue ev =TermUtils.findEnumValue(b, sVal);
		if (ev!=null) {
			EnumValueRef evr= factory.createEnumValueRef();
			evr.setEnumValue(ev);
			return evr;
		}
		Constant cNew = factory.createConstant();
		cNew.setValue(sVal);
		b.setValue(cNew);
		logs.add("Adding new value "+sVal);
		return cNew;
	}

	private static void insertBinding(EObject selected, List<String> logs, Parameter parameter, Binding binding) {
		boolean bFound=false;
		EObject e=selected;
		while (!bFound && e!=null) {
			if (e instanceof ProcessModule) {
				((ProcessModule)e).getBindings().add(binding);
				bFound=true;
			} else if (e instanceof Process) {
				((Process)e).getBindings().add(binding);
				bFound=true;
			} else {
				e=e.eContainer();
			}
		}
		if (e==null) {
			logs.add("cannot add Binding to container "+selected.eClass().getName()+" of selected Parameter "+parameter.getName());
		}
	}

	/** returns the parameter-names and their values 
	 * @throws Exception */
	public static Map<String,Set<String>> getParameterMap(EObject eo) throws Exception {
		Map<String,Set<String>> mResult = new HashMap<String, Set<String>>();
		Set<Binding> sAllBindings = getAllBindingsInEObject(eo);
		for (Binding b:sAllBindings) {
			if (b.getParameter()!=null) {
				Parameter p=b.getParameter();
				if (p.getValueFromListParameter()!=null) {
					getParameterMapHelper(mResult, b.getValue(), p);
				}
			} else {
				String sContainer=" See "+getContainerName(b);
				throw new Exception("cannot export value in binding without assigned Parameter."+sContainer);
			}
		}
		// now add also the Parameters (that do not iterate over other lists and have not been added already)
		Set<Parameter> sAllParamss = getAllParametersInEObject(eo);
		for (Parameter p:sAllParamss) {
			if (p.getValueFromListParameter()!=null) {
				getParameterMapHelper(mResult, null, p);
			}
		}
		return mResult;
	}
	/** inserts a parameter to the map */
	private static void getParameterMapHelper(Map<String, Set<String>> mResult, Term tVals, Parameter p) {
		if (p.getName()!=null && !p.getName().trim().equals("")) {
			String sP=p.eClass().getName()+":"+p.getName().trim();
			if (!mResult.containsKey(sP)) {
				Set<String> linkedList = new HashSet<String>();
				mResult.put(sP, linkedList);
			}
			Set<String> tabParam = mResult.get(sP);
			if (tVals instanceof ListTerm) {
				ListTerm lt = (ListTerm)tVals;
				for (Term tV:lt.getTerms()) {
					tabParam.add(TermUtils.printTerm(tV));
				}
			} else if (tVals instanceof Term) {
				tabParam.add(TermUtils.printTerm((Term)tVals));
			}
		}
	}	
	public static Map<String,List<List<String>>> exportToExcel(EObject eo) throws Exception {
		Map<String,List<List<String>>> mResult = new HashMap<String, List<List<String>>>();
		Set<Binding> sAllBindings = getAllBindingsInEObject(eo);
		for (Binding b:sAllBindings) {
			if (b.getParameter()!=null) {
				Parameter p=b.getParameter();
				if (p.getValueFromListParameter()!=null && p.getName()!=null && !p.getName().trim().equals("")) {
					String sP=p.getName().trim();
					if (!mResult.containsKey(sP)) {
						LinkedList<List<String>> linkedList = new LinkedList<List<String>>();
						mResult.put(sP, linkedList);
						List<String> lHeader=new LinkedList<String>();
						lHeader.add(PARAMETER_VALUE);
						lHeader.add(PARAMETER_TYPE);
						lHeader.add(PARAMETER_CONTAINER);
						linkedList.add(lHeader);
					}
					List<List<String>> tabParam = mResult.get(sP);
					Term tVals = b.getValue();
					if (tVals instanceof ListTerm) {
						ListTerm lt = (ListTerm)tVals;
						for (Term tV:lt.getTerms()) {
							addParamLine(b, tabParam, tV);
						}
					}  
					if (tVals instanceof Term) {
						addParamLine(b, tabParam, (Term)tVals);
					}
				}
			} else {
				String sContainer=" See "+getContainerName(b);
				throw new Exception("cannot export value in binding without assigned Parameter."+sContainer);
			}
		}
		// now add also the Parameters (that do not iterate over other lists and have not been added already)
		Set<Parameter> sAllParamss = getAllParametersInEObject(eo);
		for (Parameter p:sAllParamss) {
			//OS: export all parameters
			// if (p.getValueFromListParameter()!=null) {
			String sPName="";
			if (p.getName()!=null) {
				sPName=p.getName();
			}
			if (!mResult.containsKey(sPName)) {
				List<List<String>> linkedList = new LinkedList<List<String>>();
				mResult.put(sPName, linkedList);
				List<String> lHeader=new LinkedList<String>();
				lHeader.add(PARAMETER_VALUE);
				lHeader.add(PARAMETER_TYPE);
				lHeader.add(PARAMETER_CONTAINER);
				linkedList.add(lHeader);
			}
			// add values (if present)
			List<List<String>> lTab = mResult.get(sPName);
			Parameter pList=p.getValueFromListParameter();
			if (pList!=null) {
				for (Binding bList:pList.getBinding()) {
					String sTyp="";
					if (p.getType()!=null) {
						sTyp=TermUtils.printType(p.getType());
					}
					String sContainer="";
					if (bList.eContainer() instanceof ProcessModule) {
						sContainer=HierarchyModel.getQualProcessModuleName((ProcessModule)bList.eContainer());
					} else if (bList.eContainer() instanceof Process) {
						sContainer=((Process)bList.eContainer()).getName();
					}
					for (String sVal:getValuesFromBinding(bList)) {
						List<String> lRow=new LinkedList<String>();
						lRow.add(sVal);
						lRow.add(sTyp);
						lRow.add(sContainer);
						lTab.add(lRow);
					}
				}
			}
			// OS: all parameters
			// }
		}
		return mResult;
	}

	private static List<String> getValuesFromBinding(Binding b) {
		List<String> lRes=new LinkedList<String>();
		if (b.getValue()==null) {
			return lRes;
		}
		Term t=b.getValue();
		if (t instanceof ListTerm) {
			ListTerm lt=(ListTerm)t;
			for (Term tSub:lt.getTerms()) {
				lRes.add(TermUtils.printTerm(tSub));
			}
		} else {
			lRes.add(TermUtils.printTerm(t));
		}
		return lRes;
	}
	private static void addParamLine(Binding b, List<List<String>> tabParam, Term tV) {
		List<String> l=new LinkedList<String>();
		tabParam.add(l);
		l.add(TermUtils.printTerm(tV));
		if (tV.getType()!=null) {
			l.add(TermUtils.printType(tV.getType()));
		} else {
			l.add("");
		}
		String sContainerName = getContainerName(b);
		l.add(sContainerName);
	}

	private static Set<Binding> getAllBindingsInEObject(EObject eo) {
		Set<Binding> sAllBindings=new HashSet<Binding>();
		if (eo instanceof Binding) {
			sAllBindings.add((Binding)eo);
		}
		TreeIterator<EObject> it=eo.eAllContents();
		while (it.hasNext()) {
			EObject eSub=it.next();
			if (eSub instanceof Binding) {
				sAllBindings.add((Binding)eSub);
			}
		}
		return sAllBindings;
	}
	private static Set<Parameter> getAllParametersInEObject(EObject eo) {
		Set<Parameter> sAllparams=new HashSet<Parameter>();
		if (eo instanceof Parameter) {
			sAllparams.add((Parameter)eo);
		}
		TreeIterator<EObject> it=eo.eAllContents();
		while (it.hasNext()) {
			EObject eSub=it.next();
			if (eSub instanceof Parameter) {
				sAllparams.add((Parameter)eSub);
			}
		}
		return sAllparams;
	}

	private static String getContainerName(Binding b) {
		String sContainerName="";
		if (b.eContainer() instanceof ProcessModule) {
			sContainerName=((ProcessModule)b.eContainer()).getName();
		} else if (b.eContainer() instanceof Process) {
			sContainerName=((Process)b.eContainer()).getName();
		}
		return sContainerName;
	}
}
