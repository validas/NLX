/**
 * 
 */
package de.validas.pmt.utils;

import java.util.Objects;

import metaModel.referenceProcess.ProcessModule;
import metaModel.suptertype.Named;
import metaModel.suptertype.Variantable;
import metaModel.terms.ANDTerm;
import metaModel.terms.BoolTerm;
import metaModel.terms.Constant;
import metaModel.terms.EQTerm;
import metaModel.terms.EnumValueRef;
import metaModel.terms.InList;
import metaModel.terms.ListTerm;
import metaModel.terms.NOTTerm;
import metaModel.terms.ORTerm;
import metaModel.terms.ParamRef;
import metaModel.terms.Parameter;
import metaModel.terms.Term;
import metaModel.terms.TermsFactory;
import metaModel.terms.Type;
import metaModel.terms.impl.TermsFactoryImpl;

/**
 * @author slotosch
 * evaluator for terms
 */
public class Evaluator {

	public static TermsFactory factory = new TermsFactoryImpl();

	private static Constant TRUE;
	private static Constant FALSE;
	private static Type BOOLEAN;
	private static Type INTEGER;
	private static Type DOUBLE;
	private static Type STRING;
	private static boolean bInitializedTerms = false;
	private static boolean bInitializedTypes = false;

	public static Constant getTRUE() {
		// Problem a constant can only be contained in one term, hence making them unique is a bad idea, see PMT-15
		if (!bInitializedTerms) {
			initialize(null);
		}
		Constant cRes=factory.createConstant();
		cRes.setValue(""+Boolean.TRUE.toString());
		cRes.setType(BOOLEAN);
//		return TRUE;
		return cRes;
	}

	public static Constant getFALSE() {
		// Problem a constant can only be contained in one term, hence making them unique is a bad idea
		if (!bInitializedTerms) {
			initialize(null);
		}
		Constant cRes=factory.createConstant();
		cRes.setValue(""+Boolean.FALSE.toString());
		cRes.setType(BOOLEAN);
//		return TRUE;
		return cRes;
	}

	public static Type getBOOLEAN(Named n) {
		if (!bInitializedTypes) {
			initialize(n);
		}
		return BOOLEAN;
	}
	public static Type getINTEGER(Named n) {
		if (!bInitializedTypes) {
			initialize(n);
		}
		return INTEGER;
	}
	public static Type getDOUBLE(Named n) {
		if (!bInitializedTypes) {
			initialize(n);
		}
		return DOUBLE;
	}
	public static Type getSTRING(Named n) {
		if (!bInitializedTypes) {
			initialize(n);
		}
		return STRING;
	}
	private static void initialize(Named n) {
		TRUE=factory.createConstant();
		TRUE.setValue(""+Boolean.TRUE.toString());
		FALSE=factory.createConstant();
		FALSE.setValue(""+Boolean.FALSE.toString());
		bInitializedTerms=true;
		if (n!=null) {
			metaModel.referenceProcess.Process pRoot=HierarchyModel.getProzessSuper(n);
			boolean bFoundBOOLEAN=false;
			for (Type typ:pRoot.getTypes()) {
				if (typ.getName()!=null && typ.getName().toLowerCase().equals("bool")
				 || typ.getName()!=null && typ.getName().toLowerCase().equals("boolean")) {
					BOOLEAN=typ;
					bFoundBOOLEAN=true;
				}
			}
			if (!bFoundBOOLEAN) {
				BOOLEAN=factory.createType();
				BOOLEAN.setName("Boolean");
				pRoot.getTypes().add(BOOLEAN);
			}
			boolean bFoundINTEGER=false;
			for (Type typ:pRoot.getTypes()) {
				if (typ.getName()!=null && typ.getName().toLowerCase().equals("int")
				 || typ.getName()!=null && typ.getName().toLowerCase().equals("integer")) {
					INTEGER=typ;
					bFoundINTEGER=true;
				}
			}
			if (!bFoundINTEGER) {
				INTEGER=factory.createType();
				INTEGER.setName("Integer");
				pRoot.getTypes().add(INTEGER);
			}
			boolean bFoundDOUBLE=false;
			for (Type typ:pRoot.getTypes()) {
				if (typ.getName()!=null && typ.getName().toLowerCase().equals("double")) {
					DOUBLE=typ;
					bFoundDOUBLE=true;
				}
			}
			if (!bFoundDOUBLE) {
				DOUBLE=factory.createType();
				DOUBLE.setName("Double");
				pRoot.getTypes().add(DOUBLE);
			}
			boolean bFoundSTRING=false;
			for (Type typ:pRoot.getTypes()) {
				if (typ.getName()!=null && typ.getName().toLowerCase().equals("string")) {
					STRING=typ;
					bFoundSTRING=true;
				}
			}
			if (!bFoundSTRING) {
				STRING=factory.createType();
				STRING.setName("String");
				pRoot.getTypes().add(STRING);
			}
			TRUE.setType(BOOLEAN);
			FALSE.setType(BOOLEAN);
			bInitializedTypes=true;
		}
	}

	/** evaluates the term in the context of an element up to the given scope 
	 * OS: TODO: harmonize with isActive in VariantModel */
	//FIXME: AF: the signature is not friendly for clients and needs rework
	//should be split for several use cases: 
	//boolean is<Something> with no throws: exception should be treated as "false"
	//Diagnostic validate<Something> with no throws: exception message goes to Diagnostic
	public static Term evalTerm(Term t,Variantable vContext,Named nMaxScope) throws Exception {
		Term tSubst = TermSubstitutor.substTerm(t, vContext,nMaxScope);
		Term tEval = evalTerm(tSubst);
		if (TermComparator.equalTerms(tEval, getTRUE())) {
			return tEval;
		}
		// now try to evaluate in Super-Contexts:
		if (vContext!=nMaxScope) {
			if (vContext.eContainer() instanceof Variantable) {
				Variantable vSuper=(Variantable) vContext.eContainer();
				if (HierarchyModel.isIncluded(vSuper, nMaxScope)) {
					Term tEvalSuper = evalTerm(tSubst,vSuper,nMaxScope);
					if (TermComparator.equalTerms(tEvalSuper, getTRUE())) {
						return tEvalSuper;
					}
				}
			}
			// check for references
			if (vContext instanceof ProcessModule) {
				ProcessModule pmContext = (ProcessModule)vContext;
				//OS: currently getSubProcessModuleReferences has no opposite to search, hence use HM
				for (ProcessModule pmRefering:HierarchyModel.getSubProcessModuleReferencesInverse(pmContext)) {
					if (HierarchyModel.isIncluded(pmRefering, nMaxScope)) {
						Term tEvalRefering = evalTerm(tSubst,pmRefering,nMaxScope);
						if (TermComparator.equalTerms(tEvalRefering, getTRUE())) {
							return tEvalRefering;
						}
					}
				}
			}
		}
		return getFALSE();
	}
	
	public static Term evalTerm(Term t) throws Exception {
		if (t instanceof Constant) {
			Constant c=(Constant)t;
			Constant cRes = factory.createConstant();
			if (c.getValue()!=null) {cRes.setValue(c.getValue());}
			if (c.getType()!=null) {cRes.setType(c.getType());}
			return cRes;
		}
		if (t instanceof EQTerm) {
			Term t1=evalTerm(((EQTerm)t).getTerms().get(0));
			Term t2=evalTerm(((EQTerm)t).getTerms().get(1));
			if (TermComparator.equalTerms(t1, t2)) {
				return getTRUE();
			} else {
				return getFALSE();
			}
		}
		if (t instanceof ANDTerm) {
			ANDTerm at = (ANDTerm)t;
			for (Term tSub:at.getTerms()) {
				if (!TermComparator.equalTerms(evalTerm(tSub),TRUE)) {
					return getFALSE();
				}
			}
			return getTRUE();
		}
		if (t instanceof ORTerm) {
			ORTerm at = (ORTerm)t;
			for (Term tSub:at.getTerms()) {
				if (TermComparator.equalTerms(evalTerm(tSub),TRUE)) {
					return getTRUE();
				}
			}
			return getFALSE();
		}
		if (t instanceof NOTTerm) {
			NOTTerm at = (NOTTerm)t;
			for (Term tSub:at.getTerms()) {
				if (TermComparator.equalTerms(evalTerm(tSub),FALSE)) {
					return getTRUE();
				}
			}
			return getFALSE();
		}
		if (t instanceof InList) {
			InList il=(InList)t;
			if (il.getTerms().size()!=2) {
				throw new Exception("Error in evalTerm("+TermUtils.printTerm(t)+"): wrong number of argments:"+il.getTerms().size());
			}
			Term t1=evalTerm(il.getTerms().get(0));
			Term t2=evalTerm(il.getTerms().get(1));
			if (!(t2 instanceof ListTerm)) {
				throw new Exception("Error in evalTerm("+TermUtils.printTerm(t)+"): inList not applied to ListTerm:"+TermUtils.printTerm(t2)+" ("+t2.eClass().getName()+")");
			}
			for (Term tInList:((ListTerm)t2).getTerms()) {
				if (TermComparator.equalTerms(t1, tInList)) {
					return getTRUE();
				}
			}
			return getFALSE();
		}
		if (t instanceof ParamRef) {
			// evaluation cannot return a value, hence throw an exception
			// if not evaluated before it is returned
			ParamRef pr=(ParamRef)t;
			Parameter p=pr.getParameter();
			if (p==null) {
				throw new Exception("Error cannot evaluate undefiend Parameter reference");
			} 
			throw new Exception("Error cannot evaluate term with reference to unbound Parameter "+p.getName());
		}
		if (t instanceof ListTerm) {
			ListTerm ltRes = factory.createListTerm();
			for (Term tSub:((ListTerm)t).getTerms()) {
				ltRes.getTerms().add(evalTerm(tSub));
			}
			//FIXME OS: set the type (if available/known)
			return ltRes;
		}
		if (t instanceof EnumValueRef) {
			EnumValueRef e=(EnumValueRef)t;
			EnumValueRef eRes = factory.createEnumValueRef();
			if (e.getEnumValue()!=null) {eRes.setEnumValue(e.getEnumValue());}
			if (e.getType()!=null) {eRes.setType(e.getType());}
			return eRes;
		}
		System.err.println("strange case "+t.getClass().getSimpleName()+" in evalTerm");
		return null;
	}

}
