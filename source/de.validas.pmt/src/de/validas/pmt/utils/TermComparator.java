/**
 * 
 */
package de.validas.pmt.utils;

import java.util.Objects;

import metaModel.terms.BoolTerm;
import metaModel.terms.Constant;
import metaModel.terms.EQTerm;
import metaModel.terms.EnumValueRef;
import metaModel.terms.ListTerm;
import metaModel.terms.ParamRef;
import metaModel.terms.Term;

/**
 * @author slotosch
 * compare two terms for equality
 */
public class TermComparator {
	
	//FIXME: AF: needs rework, the right Java way is to override equals() and hashcode() methods
	public static boolean equalTerms(Term t1, Term t2) {	
		if (t1==null && t2==null) {
			return true;
		}
		if (t1==null || t2==null) {
			return false;
		}
		if (t1.eClass()!=t2.eClass()) {
			return false;
		}
		if (t1 instanceof Constant && t2 instanceof Constant) {
			String s1=((Constant)t1).getValue();
			String s2=((Constant)t2).getValue();
			return Objects.equals(s1, s2);
		}
		if (t1 instanceof BoolTerm && t2 instanceof BoolTerm) {
			if (((BoolTerm)t1).getTerms().size()!=((BoolTerm)t2).getTerms().size()) {
				return false;
			}
			for (int i=0;i<((BoolTerm)t1).getTerms().size();i++) {
				Term tSub1=((EQTerm)t1).getTerms().get(i);
				Term tSub2=((EQTerm)t2).getTerms().get(i);
				if (!equalTerms(tSub1, tSub2)) {
					return false;
				}
			}
			return true;
		}
		if (t1 instanceof ListTerm && t2 instanceof ListTerm) {
			if (((ListTerm)t1).getTerms().size()!=((ListTerm)t2).getTerms().size()) {
				return false;
			}
			for (int i=0;i<((ListTerm)t1).getTerms().size();i++) {
				Term tSub1=((ListTerm)t1).getTerms().get(i);
				Term tSub2=((ListTerm)t2).getTerms().get(i);
				if (!equalTerms(tSub1, tSub2)) {
					return false;
				}
			}
			return true;
		}
		if (t1 instanceof EnumValueRef && t2 instanceof EnumValueRef) {
			EnumValueRef p1=(EnumValueRef)t1;
			EnumValueRef p2=(EnumValueRef)t2;
			if (p1.getEnumValue()==null && p2.getEnumValue()==null) {
				return true;
			}
			if (p1.getEnumValue()==null || p2.getEnumValue()==null) {
				return false;
			}
			return p1.getEnumValue()==p2.getEnumValue();
		}
		if (t1 instanceof ParamRef && t2 instanceof ParamRef) {
			ParamRef p1=(ParamRef)t1;
			ParamRef p2=(ParamRef)t2;
			if (p1.getParameter()==null && p2.getParameter()==null) {
				return true;
			}
			if (p1.getParameter()==null || p2.getParameter()==null) {
				return false;
			}
			return p1.getParameter()==p2.getParameter();
		}
		System.err.println("strange case "+t1.eClass().getName()+"+"+t2.eClass().getName()+" in equalTerm");
		return false;
	}

}
