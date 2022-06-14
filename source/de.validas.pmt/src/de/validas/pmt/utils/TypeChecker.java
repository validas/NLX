/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.TableUI;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

//import com.sun.org.apache.bcel.internal.generic.LMUL;
//import com.sun.xml.internal.ws.api.pipe.TubeCloner;

import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessFactory;
import metaModel.referenceProcess.impl.ReferenceProcessFactoryImpl;
import metaModel.suptertype.Named;
import metaModel.suptertype.Variantable;
import metaModel.terms.Binding;
import metaModel.terms.BoolTerm;
import metaModel.terms.Constant;
import metaModel.terms.EnumType;
import metaModel.terms.EnumValue;
import metaModel.terms.EnumValueRef;
import metaModel.terms.InList;
import metaModel.terms.ListTerm;
import metaModel.terms.ListType;
import metaModel.terms.ParamRef;
import metaModel.terms.Parameter;
import metaModel.terms.Term;
import metaModel.terms.TermsFactory;
import metaModel.terms.Type;
import metaModel.terms.impl.TermsFactoryImpl;

/**
 * @author slotosch
 * checks the types in the model elemetns
 * 
 * currently only Parameters are checked oif they have a type
 */
public class TypeChecker {

	public static List<String> checkTypes(Named n) {
		List<String> lResult=new LinkedList<String>();
		checkTypesEObject(n,lResult);
		TreeIterator<EObject> ti = n.eAllContents();
		while (ti.hasNext()) {
			EObject eo=ti.next();
			checkTypesEObject(eo, lResult);
		}
		return lResult;
	}

	private static boolean checkTypesEObject(EObject eo,List<String> lResult) {
		if (eo instanceof Parameter) {
			return checkTypesParameter((Parameter)eo,lResult);
		}
		if (eo instanceof Type) {
			return checkTypesType((Type)eo,lResult);
		}
		if (eo instanceof Term) {
			return checkTypesTerm((Term)eo,lResult);
		}
		if (eo instanceof Binding) {
			return checkTypesBinding((Binding)eo,lResult);
		}
		return true;
	}
	public static boolean checkTypesParameter(Parameter p, List<String> lResult) {
		if (p.getType()!=null) {
			if (checkTypesType(p.getType(), lResult)) {
				lResult.add("successfully checked type of Parameter "+p.getName()+":"+TermUtils.printType(p.getType()));
				return true;
			} else {
				lResult.add("Error: could not check type of Parameter "+p.getName());		
				return false;
			}
		}
		lResult.add("Eror: Parameter "+p.getName()+" has no type");
		return false;
	}
	public static boolean checkTypesBinding(Binding b, List<String> lResult) {
		String sName="";
		if (b.getParameter()!=null) {
			sName=b.getParameter().getName();
		}
		if (b.getValue()!=null) {
			if (checkTypesTerm(b.getValue(), lResult)) {
				lResult.add("successfully checked type of Binding for "+sName+"="+TermUtils.printTerm(b.getValue()));
				return true;
			} else {
				lResult.add("Error: could not check type of Binding "+sName);		
				return false;
			}
		}
		lResult.add("Error: Binding "+sName+" has no value");
		return false;
	}

	/** checks types of types (Lists musts have an argument )*/
	public static boolean checkTypesType(Type t, List<String> lResult) {
		if (t instanceof metaModel.terms.ListType) {
			metaModel.terms.ListType lt = (metaModel.terms.ListType)t;
			if (lt.getBaseType()!=null) {
				return true;
			} else {
				lResult.add("no BaseType found for List-Type "+t.getName());
				return false;
			}
		}
		return true;
	}

	/** checks types of types (Lists musts have an argument )*/
	public static boolean checkTypesTerm(Term t, List<String> lResult) {
		if (t.getType()==null) {
			lResult.add("no type found for "+TermUtils.printTerm(t));
			return false;
		}
		Type type=t.getType();
		if (t instanceof InList) {
			InList ti=(InList)t;
			if (ti.getTerms().size()!=2) {
				lResult.add("Wrong number of arguments for inList term "+TermUtils.printTerm(t)+": "+ti.getTerms().size()+"!=2");
				return false;
			}
			Term t1=ti.getTerms().get(0);
			Term t2=ti.getTerms().get(1);
			if (!checkTypesTerm(t1, lResult)) {
				lResult.add("cannot check types of "+TermUtils.printTerm(t1)+" in "+TermUtils.printTerm(t));
				return false;
			}
			if (!checkTypesTerm(t2, lResult)) {
				lResult.add("cannot check types  of "+TermUtils.printTerm(t2)+" in "+TermUtils.printTerm(t));
				return false;
			}
			Type typ1=t1.getType();
			Type typ2=t2.getType();
			if (!(typ2 instanceof ListType)) {
				lResult.add("cannot check types of "+TermUtils.printTerm(t)+":"+TermUtils.printType(typ2)+" is no List Type");
				return false;
			}
			Type typ2elem = ((ListType)typ2).getBaseType();
			String s1=TermUtils.printType(typ1);
			String s2=TermUtils.printType(typ2elem);
			if (!s1.equals(s2)) {
				lResult.add("cannot check inList type of "+TermUtils.printTerm(t)+": "+s1+"!="+s2);
				return false;
			}
			return true;
		}
		if (t instanceof BoolTerm) {
			BoolTerm bt =(BoolTerm)t;
			String tFound = TermUtils.printType(type).toLowerCase();
			if (!(tFound.equals("bool") || tFound.equals("boolean"))) {
				lResult.add("no boolean type (but "+tFound+") found for "+TermUtils.printTerm(t));
				return false;
			}
			Type typSub=null;
			for (Term tSub:bt.getTerms()) {
				if (!checkTypesTerm(tSub, lResult)) {
					lResult.add("cannot check types of "+TermUtils.printTerm(t));
					return false;
				}
				if (typSub==null) {
					typSub=tSub.getType();
				} else {
					String s1=TermUtils.printType(typSub);
					String s2=TermUtils.printType(tSub.getType());
					if (!s1.equals(s2)) {
						lResult.add("cannot check types of "+TermUtils.printTerm(t)+": "+s1+"!="+s2);
						return false;
					}
				}
			}
			return true;	
		}
		if (t instanceof EnumValueRef) {
			EnumValue ev=((EnumValueRef)t).getEnumValue();
			EnumType et = (EnumType)ev.eContainer();
			String s1=TermUtils.printType(type);
			String s2=et.getName();
			if (!s1.equals(s2)) {
				lResult.add("cannot check enum value type of "+TermUtils.printTerm(t)+": "+s1+"!="+s2);
				return false;
			}
			return true;
		}
		if (t instanceof ParamRef) {
			Parameter par=((ParamRef)t).getParameter();
			if (par==null) {
				return false;
			}
			Type pt =par.getType();
			String s1=TermUtils.printType(type);
			String s2=TermUtils.printType(pt);
			if (!s1.equals(s2)) {
				lResult.add("cannot check param value type of "+TermUtils.printTerm(t)+": "+s1+"!="+s2);
				return false;
			}
			return true;
		}
		if (t instanceof ListTerm) {
			ListTerm lt = (ListTerm)t;
			if (!(type instanceof ListType)) {
				lResult.add("cannot check types of "+TermUtils.printTerm(t)+":"+TermUtils.printType(type)+" is no List Type");
				return false;
			}
			Type tb=((ListType)type).getBaseType();
			for (Term tSub:lt.getTerms()) {
				if (!checkTypesTerm(tSub, lResult)) {
					lResult.add("cannot check types of "+TermUtils.printTerm(tSub)+" in "+TermUtils.printTerm(t));
					return false;
				}
				String s1=TermUtils.printType(tb);
				String s2=TermUtils.printType(tSub.getType());
				if (!s1.equals(s2)) {
					lResult.add("cannot check ListTerm type of "+TermUtils.printTerm(lt)+": "+s1+"!="+s2);
					return false;
				}
			}
			return true;
		}
		return true;
	}

	/* 	checks if the term is constant, i.e. does no contain ParamRefs */
	public static boolean isConstant(Term t) {
		if (t instanceof ParamRef) {
			return ((ParamRef)t).getParameter()!=null;
		}
		if (t instanceof Constant) {
			return true;
		}
		if (t instanceof EnumValueRef) {
			return ((EnumValueRef)t).getEnumValue()!=null;
		}
		if (t instanceof ListTerm) {
			ListTerm lt = (ListTerm)t;
			for (Term tSub:lt.getTerms()) {
				if (!isConstant(tSub)) {
					return false;
				}
			}
			return true;
		}
		if (t instanceof BoolTerm) {
			BoolTerm bt = (BoolTerm)t;
			for (Term tSub:bt.getTerms()) {
				if (!isConstant(tSub)) {
					return false;
				}
			}
			return true;
		}
		System.out.println("isConstant: straneg case:"+t.eClass().getName());
		return false;
	}

	public static TermsFactory factory = new TermsFactoryImpl();

	/**
	 * routines to infer & set the type (if not set)
	 */
	public static List<String> inferTypes(Named n) {
		List<String> lResult=new LinkedList<String>();
		inferTypesEObject(n,n,lResult);
		TreeIterator<EObject> ti = n.eAllContents();
		while (ti.hasNext()) {
			EObject eo=ti.next();
			inferTypesEObject(eo, n,lResult);
		}
		return lResult;
	}

	public static Map<EObject,String> inferAllTypesEObject(EObject eo,Named n, List<String> lResult) {
		Set<EObject> sIns = new HashSet<EObject>();
		sIns.add(eo);
		return inferAllTypesEObject(sIns, n, lResult);
	}

	/** 
	 * infers the types of all object
	 * @param sEOs: set of element to check (including all children)
	 * @param n: an Named element to get the root for the creation of types
	 * @param lResult: the messages
	 * @return: the set of unchecked elements, with a message
	 */
	public static Map<EObject,String> inferAllTypesEObject(Set<EObject> sIns,Named n, List<String> lResult) {
		Set<EObject> sEOs = new HashSet<EObject>();
		Set<Parameter> sAllParameters=new HashSet<Parameter>();
		for (EObject eo:sIns) {
			addObjects(sEOs, sAllParameters, eo);
			TreeIterator<EObject> ti=eo.eAllContents();
			while (ti.hasNext()) {
				EObject next = ti.next();
				addObjects(sEOs, sAllParameters, next);
			}
		}
		Map<EObject,Set<Parameter>> mDependencies=computeDependencies(sEOs);
		Set<EObject> sWorking=new HashSet<EObject>();
		sWorking.addAll(mDependencies.keySet());
		Map<EObject,String> mUnchecked=new HashMap<EObject, String>();
		Set<Parameter> sChecked=computeChecked(sEOs);
		boolean bCheckedOne=true;
		lResult.add("Inferring types for "+sWorking.size()+" elements");
		while (sWorking.size()>0 && bCheckedOne) {
			Set<EObject> sCheckedInThisRound= new HashSet<EObject>();
			bCheckedOne=false;
			for (EObject eo:sWorking) {
				Set<Parameter> sRequired=mDependencies.get(eo);
				if (sChecked.containsAll(sRequired)) {
					Type tChecked=inferTypesEObject(eo, n, lResult);
					if (tChecked!=null) {
						sCheckedInThisRound.add(eo);
						bCheckedOne=true;
						if (eo instanceof Term) {
							// check for new parameters that have been checked					
							for (Parameter p:getReferrencedParameters((Term)eo)) {
								if (p.getType()!=null) {
									sChecked.add(p);
								}
							}
						}
						if (eo instanceof Parameter) {
							sChecked.add((Parameter)eo);
						}
					}
				}
			}
			sWorking.removeAll(sCheckedInThisRound);
			lResult.add("checked "+sCheckedInThisRound.size()+" remaining "+sWorking.size());

		}
		lResult.add("inferred types in "+sIns.size()+" selected elements with "+mDependencies.keySet().size()
				+" elements. Uncheckable (Remaining): "+sWorking.size());
		for (EObject eo:sWorking) {
			String sName="";
			if (eo instanceof Named) {
				sName=((Named)eo).getName();
			}
			if (eo instanceof Binding && ((Binding)eo).getParameter()!=null) {
				sName="for Parameter "+((Binding)eo).getParameter().getName();
			}
			if (eo instanceof Term) {
				sName=TermUtils.printTerm((Term)eo);
			}
			Set<Parameter> sRequired=mDependencies.get(eo);
			String sParams="";
			for (Parameter pReq:sRequired) {
				if (!(sParams.equals(""))) {
					sParams+=", ";
				}
				sParams+=pReq.getName();
				if (!sChecked.contains(pReq)) {
					sParams+=" (missing)";
				} else {
					sParams+=" (OK)";
				}
			}
			lResult.add("Unchecked: "+eo.eClass().getName()+" "+sName+":"+sParams);
		}
		return mUnchecked;
	}

	private static void addObjects(Set<EObject> sEOs, Set<Parameter> sAllParameters, EObject next) {
		if (next instanceof Term) {
			sAllParameters.addAll(getReferrencedParameters((Term)next));
			sEOs.add(next);
		}
		if (next instanceof Parameter) {
			sAllParameters.add((Parameter)next);
			sEOs.add(next);
		}
		if (next instanceof Binding) {
			sEOs.add(next);
			if (((Binding)next).getParameter()!=null) {
				sAllParameters.add(((Binding)next).getParameter());
			}
		}
	}

	public static Map<EObject, Set<Parameter>> computeDependencies(Set<EObject> sEOs) {
		Map<EObject,Set<Parameter>> mDependencies = new HashMap<EObject, Set<Parameter>>();
		for (EObject eo:sEOs) {
			Set<Parameter> sDepend=new HashSet<Parameter>();
			mDependencies.put(eo, sDepend);
			if(eo instanceof Binding) {
				Binding b=(Binding)eo;
				if (b.getValue()!=null) {
					for (Parameter p:getReferrencedParameters(b.getValue())) {
						if (p.getType()==null) {
							sDepend.add(p);
						}
					}
				}
			}
			if (eo instanceof Parameter) {
				if (((Parameter)eo).getType()==null) {
					for (Binding b:((Parameter)eo).getBinding()) {
						if (b.getValue()!=null) {
							for (Parameter p:getReferrencedParameters(b.getValue())) {
								if (p.getType()==null) {
									sDepend.add(p);
								}
							}
						}
					}
				}
			}
			if (eo instanceof Variantable) {
				for (BoolTerm bt:((Variantable)eo).getVariants()) { 
					for (Parameter p:getReferrencedParameters(bt)) {
						if (p.getType()==null) {
							sDepend.add(p);
						}
					}
				}
			}
		}
		return mDependencies;
	}

	/** computes the set of all used parameters that have a type */
	public static  Set<Parameter> computeChecked(Set<EObject> sEOs) {
		Set<Parameter> sChecked = new HashSet<Parameter>();
		for (EObject eo:sEOs) {
			if(eo instanceof Binding) {
				Binding b=(Binding)eo;
				if (b.getValue()!=null) {
					for (Parameter p:getReferrencedParameters(b.getValue())) {
						if (p.getType()!=null) {
							sChecked.add(p);
						}
					}
				}
			}
			if (eo instanceof Parameter) {
				if (((Parameter)eo).getType()==null) {
					for (Binding b:((Parameter)eo).getBinding()) {
						if (b.getValue()!=null) {
							for (Parameter p:getReferrencedParameters(b.getValue())) {
								if (p.getType()!=null) {
									sChecked.add(p);
								}
							}
						}
					}
				}
			}
			if (eo instanceof Variantable) {
				for (BoolTerm bt:((Variantable)eo).getVariants()) { 
					for (Parameter p:getReferrencedParameters(bt)) {
						if (p.getType()!=null) {
							sChecked.add(p);
						}
					}
				}
			}
		}
		return sChecked;
	}
	private static Type inferTypesEObject(EObject eo,Named n, List<String> lResult) {
		if (eo instanceof Parameter) {
			return inferTypesParameter((Parameter)eo,lResult);
		}
		if (eo instanceof Term) {
			lResult.add("inferring Term "+TermUtils.printTerm((Term)eo));
			return inferTypesTerm((Term)eo,n,lResult);
		}
		if (eo instanceof Variantable) {
			Type  tLast=null;
			for (BoolTerm bt:((Variantable)eo).getVariants()) { 
				lResult.add("inferring Variantable "+((Variantable)eo).getName()
						+" with "+TermUtils.printTerm(bt));
				tLast = inferTypesTerm(bt,n,lResult);
			}
			// return some thing:
			return tLast;
		}
		if (eo instanceof Binding) {
			return inferTypesBinding((Binding)eo,lResult);
		}
		return null;
	}
	public static Type inferTypesParameter(Parameter p, List<String> lResult) {
		if (p.getType()!=null) {
			return p.getType();
		}
		// try to inferr the type from Bindings before creating a new one
		Type typMGU=null;
		Term tVal=null;
		for (Binding b:p.getBinding()) {
			Type tFound = inferTypesBinding(b, lResult);
			if (typMGU==null) {
				typMGU=tFound;
				tVal=b.getValue();
			} else if (tFound!=null) {
				if (tFound!=typMGU) {
					typMGU=getMostGenralUnifier(typMGU, tFound, p);
					if (typMGU!=tFound) {
						tVal=b.getValue();
					}
				}
			}
		}
		if (typMGU!=null) {
			lResult.add("set type "+TermUtils.printType(typMGU)+" for parameter "+p.getName()+" to inferred type bound value "+TermUtils.printTerm(tVal));
			p.setType(typMGU);
		}
		Type tParam=factory.createType();
		String sTypeName=getNiceTypeName(p.getName());
		tParam.setName(sTypeName);
		metaModel.referenceProcess.Process pRoot=HierarchyModel.getProzessSuper(p);
		pRoot.getTypes().add(tParam);
		lResult.add("Created new Type "+tParam.getName()+" for Parameter "+p.getName());		
		return tParam;
	}
	public static Type inferTypesBinding(Binding b, List<String> lResult) {
		Parameter parameter = b.getParameter();
		String sName="";
		if (parameter !=null && parameter.getName()!=null) {
			sName=parameter.getName();
		}
		Term value = b.getValue();
		if (value==null) {
			if (parameter==null) {
				lResult.add("Error: Binding has no value and no parameter");
				return null;
			}
			if (parameter.getType()==null) {
				lResult.add("Error: Binding has no value and no type for parameter "+sName);
				return null;
			}
			return parameter.getType();
		}
		System.out.println("inferring types for bound parameter "+sName+" from "+TermUtils.printTerm(value));
		Type tFound = inferTypesTerm(value, (Named)b.eContainer(), lResult);
		return tFound;
	}

	private static Type getMostGenralUnifier(Type t1, Type t2,Named n) {
		if (t1==null) {
			return t2;
		}
		if (t2==null) {
			return t1;
		}
		if (t1 instanceof ListType || t2 instanceof ListType) {
			// String and ListString -> ListString
			Type bt1=t1;
			if (t1 instanceof ListType) {
				bt1=((ListType)t1).getBaseType();
			}
			Type bt2=t2;
			if (t2 instanceof ListType) {
				bt2=((ListType)t2).getBaseType();
			}
			Type mgu=getMostGenralUnifier(bt1, bt2, n);
			if (mgu==bt1) {
				return t1;
			}
			if (mgu==bt2) {
				return t2;
			}
			return getListTypeForBaseType(mgu,n);
		}
		Type tString=Evaluator.getSTRING(n);
		if (t1==tString || t2==tString) {
			return tString;
		}
		Type tDouble=Evaluator.getDOUBLE(n);
		if (t1==tDouble || t2==tDouble) {
			return tDouble;
		}
		Type tInt=Evaluator.getINTEGER(n);
		if (t1==tInt || t2==tInt) {
			return tInt;
		}
		Type tBool=Evaluator.getBOOLEAN(n);
		if (t1==tBool || t2==tBool) {
			return tBool;
		}
		System.err.println("strange types "+TermUtils.printType(t1)+" and "+TermUtils.printType(t2));
		return t1;
	}
	private static ListType getListTypeForBaseType(Type bt, Named n) {
		metaModel.referenceProcess.Process pRoot=HierarchyModel.getProzessSuper(n);
		for (Type typ:pRoot.getTypes()) {
			if (typ instanceof ListType) {
				if (((ListType)typ).getBaseType()==bt) {
					return (ListType)typ;
				}
			}
		}
		ListType ltRes = factory.createListType();
		ltRes.setName(getNiceListOfName(TermUtils.printType(bt)));
		ltRes.setBaseType(bt);
		pRoot.getTypes().add(ltRes);
		return ltRes;
	}

	/**
	 * try to adapt to naming convention of parameter/Parameter/PARAMETER
	 * @param sName
	 * @return nice name with _type appended
	 */
	private static String getNiceTypeName(String sName) {
		String sTypeName="";
		if (sName!=null &&sName.trim().length()>0) {
			sTypeName=sName.trim();
			char cLast=sTypeName.charAt(sTypeName.length()-1);
			if (cLast>='A' && cLast<='Z') {
				sTypeName+="_TYPE";
			} else {
				char cFirst=sTypeName.charAt(0);
				if (cFirst>='A' && cFirst<='Z') {
					sTypeName+="Type";
				} else {
					sTypeName+="_type";
				}
			}
		} else {
			sTypeName="Type of Unnamed";
		}
		return sTypeName;
	}
	/**
	 * try to adapt to naming convention of parameter/Parameter/PARAMETER
	 * @param sName
	 * @return nice name with list_of_ prefix
	 */
	private static String getNiceListOfName(String sName) {
		String sTypeName="";
		if (sName!=null &&sName.trim().length()>0) {
			sTypeName=sName.trim();
			char cLast=sTypeName.charAt(sTypeName.length()-1);
			if (cLast>='A' && cLast<='Z') {
				sTypeName="LIST_OF_"+sTypeName;
			} else {
				char cFirst=sTypeName.charAt(0);
				if (cFirst>='A' && cFirst<='Z') {
					sTypeName="ListOf"+sTypeName;
				} else {
					sTypeName="list_of_"+sTypeName;
				}
			}
		} else {
			sTypeName="Type of Unnamed List";
		}
		return sTypeName;
	}
	/** checks types of types (Lists musts have an argument )*/
	public static Type inferTypesTerm(Term t, Named n,List<String> lResult) {
		if (t.getType()!=null) {
			return t.getType();
		}
		if (t instanceof InList) {
			InList ti=(InList)t;			
			Type tRes = Evaluator.getBOOLEAN(n);
			t.setType(tRes);
			lResult.add("Setting type of InList term "+TermUtils.printTerm(t)+" to "+TermUtils.printType(tRes));
			if (ti.getTerms().size()!=2) {
				lResult.add("Warning: Wrong number of arguments for inList term "+TermUtils.printTerm(t)+": "+ti.getTerms().size()+"!=2");
				for (Term tSub:ti.getTerms()) {
					inferTypesTerm(tSub, n, lResult);
				}
				t.setType(tRes);
				return tRes;
			}
			Term t1=ti.getTerms().get(0);
			Term t2=ti.getTerms().get(1);
			Type typ1 = inferTypesTerm(t1, n, lResult);
			Type typ2 = inferTypesTerm(t2, n, lResult);
			if (!(typ2 instanceof ListType)) {
				lResult.add("Warning: cannot infer types of "+TermUtils.printTerm(t)+":"+TermUtils.printType(typ2)+" is no List Type");
				return tRes;
			}
			Type typ2elem = ((ListType)typ2).getBaseType();
			if (typ1==typ2elem) {
				return tRes;
			}
			// something strange
			lResult.add("Warning: cannot infer types of "+TermUtils.printTerm(t)+":"+TermUtils.printType(typ2)+" is no List Type of "+TermUtils.printType(typ1));
			Type tNew=getMostGenralUnifier(typ1, typ2elem, n);
			if (typ1!=tNew) {
				lResult.add("setting type of "+TermUtils.printTerm(t1)+" from "+TermUtils.printType(typ1)+" to "+TermUtils.printType(tNew));
				setTypeWithParameter(t1,tNew);
			}
			ListType listTypeForBaseType = getListTypeForBaseType(typ2elem, n);
			if (typ2!=listTypeForBaseType) {
				lResult.add("setting type of "+TermUtils.printTerm(t2)+" from "+TermUtils.printType(typ2)+" to "+TermUtils.printType(listTypeForBaseType));
				setTypeWithParameter(t2,listTypeForBaseType);
			}
			return tRes;
		}
		if (t instanceof BoolTerm) {
			BoolTerm bt =(BoolTerm)t;
			Type typSub=null;
			for (Term tSub:bt.getTerms()) {
				Type tFound = inferTypesTerm(tSub, n, lResult);
				if (typSub==null) {
					typSub=tFound;
				} else {
					typSub=getMostGenralUnifier(typSub, tFound, n);
				}
			}
			// set the types to mgu
			for (Term tSub:bt.getTerms()) {
				if (tSub.getType()!=typSub) {
					lResult.add("setting type of "+TermUtils.printTerm(tSub)+" from "+TermUtils.printType(tSub.getType())+" to "+TermUtils.printType(typSub));
					setTypeWithParameter(tSub,typSub);
				}
			}
			Type tRes = Evaluator.getBOOLEAN(n);
			lResult.add("setting type of "+TermUtils.printTerm(t)+" to "+TermUtils.printType(tRes));
			t.setType(tRes);
			return tRes;
		}	
		if (t instanceof EnumValueRef) {
			EnumValue ev=((EnumValueRef)t).getEnumValue();
			if (ev==null) {
				lResult.add("no EnumValue in EnumValueRef "+TermUtils.printTerm(t));
				return null;
			}
			EnumType et = (EnumType)ev.eContainer();
			lResult.add("setting type of EnumValueRef "+TermUtils.printTerm(t)+" to "+TermUtils.printType(et));
			t.setType(et);
			return et;
		}
		if (t instanceof ParamRef) {
			Parameter par=((ParamRef)t).getParameter();
			if (par==null) {
				lResult.add("no Parameter in ParamValueRef "+TermUtils.printTerm(t));
				return null;
			}
			Type pt = inferTypesParameter(par, lResult);
			lResult.add("setting type of ParamValueRef "+TermUtils.printTerm(t)+" to "+TermUtils.printType(pt));
			t.setType(pt);
			return pt;
		}
		if (t instanceof ListTerm) {
			ListTerm lt = (ListTerm)t;
			Type typMGU=null;
			for (Term tSub:lt.getTerms()) {
				Type tFound = inferTypesTerm(tSub, n, lResult);
				if (typMGU==null) {
					typMGU=tFound;
				} else {
					typMGU=getMostGenralUnifier(typMGU, tFound, n);
				}
			}
			// set the types to mgu
			for (Term tSub:lt.getTerms()) {
				if (tSub.getType()!=typMGU) {
					lResult.add("setting type of "+TermUtils.printTerm(tSub)+" from "+TermUtils.printType(tSub.getType())+" to "+TermUtils.printType(typMGU));
					setTypeWithParameter(tSub,typMGU);
				}
			}
			ListType listTypeForBaseType = getListTypeForBaseType(typMGU, n);
			lResult.add("setting type of "+TermUtils.printTerm(lt)+" to "+TermUtils.printType(listTypeForBaseType));
			lt.setType(listTypeForBaseType);
			return listTypeForBaseType;
		}
		if (t instanceof Constant) {
			String sVal=((Constant)t).getValue();
			if (sVal==null || sVal.trim().equals("")) {
				lResult.add("Warning inferring String for empty value in Constant");
				Type tString=Evaluator.getSTRING(n);
				t.setType(tString);
				return tString;
			}
			if (sVal.equalsIgnoreCase("true") || sVal.equalsIgnoreCase("false")) {
				Type tBool=Evaluator.getBOOLEAN(n);
				lResult.add("Inferring Type "+TermUtils.printType(tBool)+" for Constant "+sVal);
				t.setType(tBool);
				return tBool;
			}
			try {
				int test = new Integer(sVal).intValue();
				Type tInt=Evaluator.getINTEGER(n);
				lResult.add("Inferring Type "+TermUtils.printType(tInt)+" for Integer value "+test);
				t.setType(tInt);
				return tInt;
			} catch (NumberFormatException nfe) {
				// obviously no int, try double
				try {
					double test = new Double(sVal).doubleValue();
					Type tDouble=Evaluator.getDOUBLE(n);
					lResult.add("Inferring Type "+TermUtils.printType(tDouble)+" for non-integer alue "+test);
					t.setType(tDouble);
					return tDouble;
				} catch (NumberFormatException nfe2) {
					// obviously no double, use String
					Type tString=Evaluator.getSTRING(n);
					lResult.add("Inferring Type "+TermUtils.printType(tString)+" for non-numeric value "+sVal);
					t.setType(tString);
					return tString;
				}
			}
		}
		if (t!=null) {
			lResult.add("Error cannot infer type of unknown "+t.getClass().getSimpleName());
		}
		System.err.println("impossible case in inferTypes");
		return null;
	}

	private static void setTypeWithParameter(Term t, Type type) {
		t.setType(type);
		if (t instanceof ParamRef && ((ParamRef)t).getParameter()!=null) {
			Parameter p=((ParamRef)t).getParameter();
			if (p.getType()==null) {
				p.setType(type);
			}
		}

	}

	private static Set<Parameter> getReferrencedParameters(Term t) {
		Set<Parameter> sRes = new HashSet<Parameter>();
		if (t instanceof ParamRef && ((ParamRef)t).getParameter()!=null) {
			sRes.add(((ParamRef)t).getParameter());
		}
		if (t instanceof ListTerm) {
			for (Term tSub:((ListTerm)t).getTerms()) {
				sRes.addAll(getReferrencedParameters(tSub));
			}
		}
		if (t instanceof BoolTerm) {
			for (Term tSub:((BoolTerm)t).getTerms()) {
				sRes.addAll(getReferrencedParameters(tSub));
			}
		}
		return sRes;
	}
	/**
	 * computes the direct recursive definitions
	 * @return
	 */
	public static boolean isRecursiveDefinition(Binding b) {
		return b.getParameter()!=null && b.getValue()!=null && getReferrencedParameters(b.getValue()).contains(b.getParameter()); 
	}
}
