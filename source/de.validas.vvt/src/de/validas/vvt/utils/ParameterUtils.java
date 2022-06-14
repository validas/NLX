/**
 * 
 */
package de.validas.vvt.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.validas.vvt.Instance;
import de.validas.vvt.Parameter;
import de.validas.vvt.ParameterValue;
import de.validas.vvt.Project;
import de.validas.vvt.VvtFactory;
import de.validas.vvt.impl.VvtFactoryImpl;

/**
 * @author slotosch
 *
 */
public class ParameterUtils {

	private static final String PARAMETER_VALUE = "Parameter Value";
	//	private static final String PARAMETER_CONTAINER = "Container";
	//	private static final String PARAMETER_TYPE = "Parameter Type";

	private static VvtFactory factory = new VvtFactoryImpl();

	/** finds all Instances for a given parameter in the project */
	public static Set<Instance> getAllInstances(Project project) {
		Set<Instance> sRes = new HashSet<Instance>();
		TreeIterator<EObject> it=project.eAllContents();
		while (it.hasNext()) {
			Object eo = it.next();
			if (eo instanceof Instance) {
				sRes.add((Instance)eo);
			}
		}
		return sRes;
	}

	/** returns all values for a given Parameter (from the contained ParameterValues) */
	public static Set<String> getAllInstanceValues(Parameter param) {
		Set<String> sRes = new HashSet<String>();
		for (ParameterValue pv:param.getParameterValues()) {
			if (pv.getValue()!=null && !pv.getValue().trim().equals("")) {
				sRes.add(pv.getValue());
			}
		}
		return sRes;
	}

	public static String getInstanceString(Instance instance) {
		String sText = "";
		final Parameter parameter = instance.getParameter();
		if (parameter != null && parameter.getName() != null) {
			sText = parameter.getName();
		} else {
			sText = "?";
		}
		sText += "=";
		if (instance.getParameterValue() != null) {
			sText += instance.getParameterValue().getValue();
		} else {
			sText += "?";
		}
		return sText;
	}

	/** prints the list of parameters (sorted) */
	public static String printListParamters(List<Parameter> lPV) {
		Collections.sort(lPV, new DescribedComparator(true));
		String sRes="";
		for (Parameter pv:lPV) {
			if (!sRes.equals("")) {
				sRes+=",";
			}
			sRes+=pv.getName();
		}
		return "["+sRes+"]";
	}
	
	/** prints the list of parameter values */
	public static String printListParamterValues(List<ParameterValue> lPV) {
		String sRes="";
		for (ParameterValue pv:lPV) {
			if (!sRes.equals("")) {
				sRes+=",";
			}
			Parameter parameter = (Parameter)pv.eContainer();
			if (parameter != null && parameter.getName() != null) {
				sRes+= parameter.getName();
			} else {
				sRes+= "?";
			}
			sRes += "=";
			if (pv.getValue() != null) {
				sRes+=pv.getValue();
			} else {
				sRes += "?";
			}
		}
		return "["+sRes+"]";
	}
	
	
	public static Map<String,List<List<String>>> exportToExcel(Project project) throws Exception {
		Map<String,List<List<String>>> mResult = new HashMap<String, List<List<String>>>();
		for (Parameter p:project.getParameter()) {
			String sPName="";
			if (p.getName()!=null) {
				sPName=p.getName();
			}
			if (!mResult.containsKey(sPName)) {
				List<List<String>> linkedList = new LinkedList<List<String>>();
				mResult.put(sPName, linkedList);
				List<String> lHeader=new LinkedList<String>();
				lHeader.add(PARAMETER_VALUE);
				//					lHeader.add(PARAMETER_TYPE);
				//					lHeader.add(PARAMETER_CONTAINER);
				linkedList.add(lHeader);
			}
			// add values (if present)
			List<List<String>> lTab = mResult.get(sPName);
			for (ParameterValue pv:p.getParameterValues()) {
				List<String> lRow=new LinkedList<String>();
				lRow.add(pv.getValue());
				lTab.add(lRow);
			}
		}
		return mResult;
	}

	public static int importParameters(Project project, Map<String, List<List<String>>> neu, List<String> logs) {
		int iNewElements=0;
		for (String sTab:neu.keySet()) {
			Parameter pFound=null;
			for (Parameter p:project.getParameter()) {
				if (sTab.equals(p.getName())) {
					pFound=p;
				}
			}
			if (pFound==null) {
				pFound = factory.createParameter();
				pFound.setName(sTab);
				project.getParameter().add(pFound);
				iNewElements++;
				logs.add("Created new Parameter "+sTab);
			}
			List<List<String>> lTab=neu.get(sTab);
			int iRow=0;
			for (List<String> lRow:lTab) {
				if (iRow>0) {
					String sVal="";
					if (lRow.size()>0) {
						sVal=lRow.get(0);
					}
					ParameterValue pvFound=null;
					for (ParameterValue pv:pFound.getParameterValues()) {
						if (sVal.equals(pv.getValue())) {
							pvFound=pv;
						}
					}
					if (pvFound==null) {
						pvFound=factory.createParameterValue();
						pFound.getParameterValues().add(pvFound);
						pvFound.setValue(sVal);
						logs.add("Create new Value "+sVal+" for "+iRow+" parameter "+pFound.getName());
						iNewElements++;
					}
				}
				iRow++;
			}
		}
		return iNewElements;
	}

}
