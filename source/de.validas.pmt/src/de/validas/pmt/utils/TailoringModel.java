/**
 * 
 */
package de.validas.pmt.utils;

import java.util.List;

import metaModel.referenceProcess.ProcessModule;
import metaModel.suptertype.Variantable;
import metaModel.terms.BoolTerm;

/**
 * @author slotosch
 * get the current model taking into account the tailoring 
 */
public class TailoringModel {

	public static boolean isActive(Variantable v) {
		if (v.getVariants().size()==0) {
			if (v.eContainer() instanceof Variantable) {
				return isActive((Variantable)v.eContainer());
			}
			return true;
		}
		for (BoolTerm var:v.getVariants()) {
//			if (evalTerm(var,v)) {
//				return true;
//			}
		}
		// no variant term true;
		return false;
	}
	
	public static List<ProcessModule> ProcessModule_getSubProcessModules(ProcessModule pm) {
		return pm.getSubProcessModules();
	}
}
