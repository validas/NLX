/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import metaModel.suptertype.Named;
import metaModel.suptertype.Variantable;
import metaModel.terms.ANDTerm;
import metaModel.terms.Binding;
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
import metaModel.terms.impl.TermsFactoryImpl;

/**
 * @author slotosch
 * substitute a term with a Configuration
 */
//FIXME: AF: very complex concept from the EMF perspective, needs rework
//if we need some "lookup table" let's use "registry service with immutable descriptors" concept 
//instead of cloning and editing heavy EMF objects - the side effects are hard to predict
public class TermSubstitutor {

	public static TermsFactory factory = new TermsFactoryImpl();

	/** substitutes a term with all bindings available at v, stops at nScope searching for more */
	public static Term substTerm(Term t, Variantable v,Named nScope) throws Exception {	
		if (t==null) {
			return null;
		}
		if (t instanceof Constant) {
			Constant c=(Constant)t;
			Constant cRes = factory.createConstant();
			if (c.getValue()!=null) {cRes.setValue(c.getValue());}
			if (c.getType()!=null) {cRes.setType(c.getType());}
			return cRes;
		}
		if (t instanceof BoolTerm) {
			BoolTerm bRes=null;
			if (t instanceof EQTerm) {
				bRes=factory.createEQTerm();
			} else if (t instanceof ORTerm) {
				bRes=factory.createORTerm();
			} else if (t instanceof ANDTerm) {
				bRes=factory.createANDTerm();
			} else if (t instanceof NOTTerm) {
				bRes=factory.createNOTTerm();
			} else if (t instanceof InList) {
				bRes=factory.createInList();
			} else if (t instanceof BoolTerm) {
				bRes=factory.createBoolTerm();
			} else {
				throw new Exception("Error Unknown BoolTerm "+t.eClass().getName()+ ":"+TermUtils.printTerm(t));
			}
			for (Term tSub:((BoolTerm)t).getTerms()) {
				try {
					Term tSubSubst=substTerm(tSub, v,nScope);
					bRes.getTerms().add(tSubSubst);
				} catch (Exception ex) {
					ex.printStackTrace();
					throw new Exception("Error : in substTerms("+TermUtils.printTerm(t)+":"+ex.getMessage());
				}
			}
			return bRes;
		}
		if (t instanceof ListTerm) {
			ListTerm ltRes = factory.createListTerm();
			for (Term tSub:((ListTerm)t).getTerms()) {
				try {
					Term tSubSubst=substTerm(tSub, v,nScope);
					ltRes.getTerms().add(tSubSubst);
				} catch (Exception ex) {
					throw new Exception("Error : in substTerms("+TermUtils.printTerm(t)+":"+ex.getMessage());
				}
			}
			return ltRes;
		}
		if (t instanceof EnumValueRef) {
			EnumValueRef e=(EnumValueRef)t;
			EnumValueRef eRes = factory.createEnumValueRef();
			if (e.getEnumValue()!=null) {eRes.setEnumValue(e.getEnumValue());}
			if (e.getType()!=null) {eRes.setType(e.getType());}
			return eRes;
		}
		// main case: lookup param value in config
		if (t instanceof ParamRef) {
			ParamRef pr=(ParamRef)t;
			Parameter p=pr.getParameter();
			Map<Parameter,Binding> mValues = new HashMap<Parameter,Binding>();
				for (Binding b:HierarchyModel.getAllBindingsSuper(v, nScope)) {
					Parameter parameter = b.getParameter();
					if (parameter!=null) {
						if (b.getValue()==null) {
							System.err.println("Warning found binding for Parameter "+p.getName()+" for "+v.getName()+" with null value");
						}
						// should be only one binding for each parameter
						mValues.put(parameter, b);
					}
				}
			if (p==null || mValues.get(p)==null || mValues.get(p).getValue()==null) {
				// could not evaluate, create a copy
				ParamRef eRes = factory.createParamRef();
				if (p!=null) {eRes.setParameter(p);}
				if (pr.getType()!=null) {eRes.setType(pr.getType());}
				return eRes;
			}
			// make a copy of the value here in order not to remove it from it's containing binding, see (PMT-15)
			return EcoreUtil.copy(mValues.get(p).getValue());
		}
		System.err.println("strange case "+t.eClass().getName()+" in substTerm");
		return null;
	}
}
