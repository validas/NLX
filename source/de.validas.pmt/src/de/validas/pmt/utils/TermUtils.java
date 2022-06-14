/**
 * 
 */
package de.validas.pmt.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.Process;
import metaModel.suptertype.Named;
import metaModel.suptertype.Variantable;
import metaModel.terms.ANDTerm;
import metaModel.terms.Binding;
import metaModel.terms.BoolTerm;
import metaModel.terms.Constant;
import metaModel.terms.EQTerm;
import metaModel.terms.EnumType;
import metaModel.terms.EnumValue;
import metaModel.terms.EnumValueRef;
import metaModel.terms.InList;
import metaModel.terms.ListType;
import metaModel.terms.ListTerm;
import metaModel.terms.NOTTerm;
import metaModel.terms.ORTerm;
import metaModel.terms.ParamRef;
import metaModel.terms.Parameter;
import metaModel.terms.ProcessVariable;
import metaModel.terms.Term;
import metaModel.terms.Type;

/**
 * @author slotosch
 *
 */
public class TermUtils {

	/** prints terms */
	/*****************/

	public static String printTerm(Term t) {
		if (t==null) {
			return "null";
		}
		if (t instanceof Constant) {
			return printTerm((Constant)t);
		}
		if (t instanceof EQTerm) {
			return printEQTerm((EQTerm)t);
		}
		if (t instanceof ANDTerm) {
			return printANDTerm((ANDTerm)t);
		}
		if (t instanceof ORTerm) {
			return printORTerm((ORTerm)t);
		}
		if (t instanceof NOTTerm) {
			return printNOTTerm((NOTTerm)t);
		}
		if (t instanceof InList) {
			return printInList((InList)t);
		}
		if (t instanceof ParamRef) {
			return printParamRef((ParamRef)t);
		}
		if (t instanceof ListTerm) {
			return printListTerm((ListTerm)t);
		}
		if (t instanceof EnumValueRef) {
			return printEnumValueRef((EnumValueRef)t);
		}
		System.err.println("strange case "+t.getClass().getSimpleName()+" in printTerm");
		return "?"+t.eClass().getName();
	}
	public static String printTerm(Constant c) {
		if (c.getValue()==null) {
			return "Constant without value";
		}
		return c.getValue();
	}
	public static String printInList(InList c) {
		String sRes="";
		for (Term tSub:c.getTerms()) {
			if (!sRes.equals("")) {
				sRes+=" in ";
			}
			sRes+=printTerm(tSub);
		}
		return "("+sRes+")";
	}
	public static String printListTerm(ListTerm c) {
		String sRes="";
		for (Term tSub:c.getTerms()) {
			if (!sRes.equals("")) {
				sRes+=", ";
			}
			sRes+=printTerm(tSub);
		}
		return "["+sRes+"]";
	}
	public static String printANDTerm(ANDTerm c) {
		String sRes="";
		for (Term tSub:c.getTerms()) {
			if (!sRes.equals("")) {
				sRes+=" && ";
			}
			sRes+=printTerm(tSub);
		}
		return "("+sRes+")";
	}
	public static String printORTerm(ORTerm c) {
		String sRes="";
		for (Term tSub:c.getTerms()) {
			if (!sRes.equals("")) {
				sRes+=" || ";
			}
			sRes+=printTerm(tSub);
		}
		return "("+sRes+")";
	}
	public static String printEQTerm(EQTerm c) {
		String sRes="";
		for (Term tSub:c.getTerms()) {
			if (!sRes.equals("")) {
				sRes+=" == ";
			}
			sRes+=printTerm(tSub);
		}
		return "("+sRes+")";
	}
	public static String printNOTTerm(NOTTerm c) {
		String sRes="";
		for (Term tSub:c.getTerms()) {
			if (!sRes.equals("")) {
				sRes+=" == ";
			}
			sRes+="!("+printTerm(tSub)+")";
		}
		return sRes;
	}
	public static String printParamRef(ParamRef c) {
		Parameter p=c.getParameter();
		if (p!=null) {
			return p.getName();
		}
		return "?";
	}
	public static String printEnumValueRef(EnumValueRef c) {
		EnumValue p=c.getEnumValue();
		if (p!=null) {
			return p.getName();
		}
		return "?";
	}

	public static String printType(Type t) {
		if (t==null) {
			return "null";
		}
		if (t instanceof ListType) {
			ListType lt=(ListType)t;
			String sBase="";
			if (lt.getBaseType()!=null) {
				sBase=printType(lt.getBaseType());
			}
			return"["+sBase+"]";
		}
		return t.getName();
	}
	/** returns all used types in this term */
	public static Set<Type> getAllTypes(Term t) {
		Set<Type> sRes= new HashSet<Type>();
		if (t.getType()!=null) {
			sRes.addAll(getAllTypes(t.getType()));
		}
		TreeIterator<EObject> ti=t.eAllContents();
		while (ti.hasNext()) {
			EObject eo = ti.next();
			if (eo instanceof Term && ((Term)eo).getType()!=null) {
				sRes.addAll(getAllTypes(((Term)eo).getType()));
			}
		}
		return sRes;
	}
	/** returns all used types in this type */
	public static Set<Type> getAllTypes(Type typ) {
		Set<Type> sRes= new HashSet<Type>();
		sRes.add(typ);
		TreeIterator<EObject> ti=typ.eAllContents();
		while (ti.hasNext()) {
			EObject eo = ti.next();
			if (eo instanceof Type) {
				sRes.add((Type)eo);
			}
		}
		return sRes;
	}

	/**
	 * checks if the given String is an EnumValue that is defined in the Process
	 * @param eo: an element in the process
	 * @param s: the values to be checked
	 * @return the EnumValue (if found, otherwise null);
	 */
	public static EnumValue findEnumValue(EObject eo,String s) {
		EObject eoHelp=eo;
		while (!(eoHelp instanceof Named) && eoHelp!=null) {
			eoHelp=eoHelp.eContainer();
		}
		if (eoHelp==null) {
			System.err.println("strange case: no named container found for "+eo.eClass().getName());
			return null;
		}
		Process pSuper = HierarchyModel.getProzessSuper((Named)eoHelp);
		for (Type t:pSuper.getTypes()) {
			if (t instanceof EnumType) {
				for (EnumValue ev:((EnumType)t).getEnumValues()) {
					if (s.equals(ev.getName())) {
						return ev;
					}
				}
			}
		}
		return null;
	}
	/** Return true if the term has a ProcessVariable reference */
	public static boolean hasProcessVariable(Term t) {
		return getProcessVariables(t).size()>0;
	}
	/** Return true if the term has a ProcessVariable reference */
	public static Set<ProcessVariable> getProcessVariables(Term t) {
		Set<ProcessVariable> sRes = new HashSet<ProcessVariable>();
		for (Parameter p:getParameters(t)) {
			if (p instanceof ProcessVariable) {
				sRes.add((ProcessVariable)p);
			}
		}
		return sRes;
	}
	/** Return true if the term has a ProcessVariable reference */
	public static boolean hasParameters(Term t) {
		return getParameters(t).size()>0;
	}

	/** Return all getParameters referenced by Term */
	public static Set<Parameter> getParameters(Term t) {
		Set<Parameter> sRes = new HashSet<Parameter>();
		if (t==null) {
			return sRes;
		}
		if (t instanceof Constant) {
			return sRes;
		}
		if (t instanceof BoolTerm) {
			for (Term tSub:((BoolTerm)t).getTerms()) {
				sRes.addAll(getParameters(tSub));
			}
			return sRes;
		}
		if (t instanceof ParamRef) {
			ParamRef pr = (ParamRef)t;
			if (pr.getParameter()==null) {
				return sRes;
			}
			sRes.add(pr.getParameter());
			return sRes;
		}
		if (t instanceof ListTerm) {
			for (Term tSub:((ListTerm)t).getTerms()) {
				sRes.addAll(getParameters(tSub));
			}
			return sRes;
		}
		if (t instanceof EnumValueRef) {
			return sRes;
		}
		System.err.println("strange case "+t.getClass().getSimpleName()+" in getParameters");
		return sRes;
	}

	/** Return all EnumValues referenced by Term */
	public static Set<EnumValue> getEnumValues(Term t) {
		Set<EnumValue> sRes = new HashSet<EnumValue>();
		if (t==null) {
			return sRes;
		}
		if (t instanceof Constant) {
			return sRes;
		}
		if (t instanceof BoolTerm) {
			for (Term tSub:((BoolTerm)t).getTerms()) {
				sRes.addAll(getEnumValues(tSub));
			}
			return sRes;
		}
		if (t instanceof EnumValueRef) {
			EnumValueRef er = (EnumValueRef)t;
			if (er.getEnumValue()==null) {
				return sRes;
			}
			sRes.add(er.getEnumValue());
			return sRes;
		}
		if (t instanceof ListTerm) {
			for (Term tSub:((ListTerm)t).getTerms()) {
				sRes.addAll(getEnumValues(tSub));
			}
			return sRes;
		}
		if (t instanceof ParamRef) {
			return sRes;
		}
		System.err.println("strange case "+t.getClass().getSimpleName()+" in getEnumValues");
		return sRes;
	}

	/** shows the references to this element (Parameter, EnumValue, Type): 
	 * first computes the root element and then check all variantable elements
	 * @param filteredBindings 
	 */
	public static List<String> showTermReferences(List<Named> lEOs, List<Binding> lBs) {
		List<String> lRes = new LinkedList<String>();
		for (Named eo:lEOs) {
			Process pRoot = HierarchyModel.getProzessSuper(eo);
			lRes.add("References for "+eo.eClass().getName()+" "+eo.getName()+" in "+pRoot.getName()+ ":");
			lRes.add("----------------------------------------------------------------------------------");
			int iNr=0;
			if (eo instanceof Parameter) {
				// first check bindings
				for (Binding b:HierarchyModel.getAllBindings(pRoot)) {
					if (b.getParameter()!=null && getParameters(b.getValue()).contains(eo) 
							|| b.getParameter()==eo) {
						iNr++;
						String sIn="";
						if (b.eContainer() instanceof Named) {
							sIn=" in "+HierarchyModel.getQualName((Named)b.eContainer())+" ";
						}
						lRes.add(""+iNr+". Binding "+sIn+" for "+b.getParameter().getName()+":="+printTerm(b.getValue()));
					}
				}
				for (Variantable v:HierarchyModel.getAllVariantablesWithConditions(pRoot)) {
					for (Term tCond:v.getVariants()) {
						if (getParameters(tCond).contains(eo)) {
							iNr++;
							lRes.add(""+iNr+". "+HierarchyModel.getQualName(v, pRoot)+":"+printTerm(tCond));
						}
					}
				}
			}
			else if (eo instanceof EnumValue) {
				EnumValue ev=(EnumValue)eo;
				iNr=addEnumValueReferences(lRes, ev, pRoot, iNr);
			}
			else if (eo instanceof EnumType) {
				for (Binding b:HierarchyModel.getAllBindings(pRoot)) {
					if (b.getParameter()!=null && b.getParameter().getType()==eo) {
						iNr++;
						String sIn="";
						if (b.eContainer() instanceof Named) {
							sIn=" in "+HierarchyModel.getQualName((Named)b.eContainer())+" ";
						}
						lRes.add(""+iNr+". Binding "+sIn+" for "+b.getParameter().getName()+":"+((EnumType)eo).getName()+" = "+printTerm(b.getValue()));
					}
				}
				for (Parameter b:HierarchyModel.getAllParameters(pRoot)) {
					if (b.getType()==eo) {
						iNr++;
						String sIn="";
						if (b.eContainer() instanceof Named) {
							sIn=" in "+HierarchyModel.getQualName((Named)b.eContainer())+" ";
						}
						lRes.add(""+iNr+". Parameter "+sIn+" for "+b.getName()+":"+((EnumType)eo).getName());
					}
				}
				for (EnumValue ev:((EnumType)eo).getEnumValues()) {
					iNr=addEnumValueReferences(lRes, ev, pRoot, iNr);
				}
			}
		}
		for (Binding b:lBs) {
			if (b.eContainer() instanceof Named && b.getParameter()!=null) {
				Process pRoot = HierarchyModel.getProzessSuper((Named)b.eContainer());
				lRes.add("References for Binding "+printBiding(b));
				lRes.add("----------------------------------------------------------------------------------");
				int iNr=0;
				for (Variantable v:HierarchyModel.getAllVariantablesWithConditions(pRoot)) {
					for (Term tCond:v.getVariants()) {
						if (getParameters(tCond).contains(b.getParameter())) {
							iNr++;
							lRes.add(""+iNr+". "+HierarchyModel.getQualName(v, pRoot)+":"+printTerm(tCond));
						}
					}
				}
			}
		}
		return lRes;
	}

		public static String printBiding(Binding b) {
			String sParam="";
			if (b.getParameter()!=null) {
				sParam=" "+b.getParameter().getName()+" := ";
			} else {
				sParam=" ? := ";
			}
			String sValue="";
			if (b.getValue()!=null) {
				sValue=TermUtils.printTerm(b.getValue());
			} 
			return sParam+sValue;
		}
		private static int addEnumValueReferences(List<String> lRes, EnumValue ev, Process pRoot, int iNr) {
			for (Binding b:HierarchyModel.getAllBindings(pRoot)) {
				if (b.getParameter()!=null && getEnumValues(b.getValue()).contains(ev)) {
					iNr++;
					String sIn="";
					if (b.eContainer() instanceof Named) {
						sIn=" in "+HierarchyModel.getQualName((Named)b.eContainer())+" ";
					}
					lRes.add(""+iNr+". Binding "+sIn+" for "+b.getParameter().getName()+":="+printTerm(b.getValue()));
				}
			}
			for (Variantable v:HierarchyModel.getAllVariantablesWithConditions(pRoot)) {
				for (Term tCond:v.getVariants()) {
					if (getEnumValues(tCond).contains(ev)) {
						iNr++;
						lRes.add(""+iNr+". "+HierarchyModel.getQualName(v, pRoot)+":"+printTerm(tCond));
					}
				}
			}
			return iNr;
		}
	}
