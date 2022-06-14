/**
 * 
 */
package de.validas.pmt.utils;

import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.StakeHolder;

/**
 * @author slotosch
 * performs some checks of the model, e.g. a component has an re
 */
public class ModelChecker {

	public static StakeHolder getResponsibleRole(ProcessModule pm) {
		if (pm.getStakeHolder()!=null) {
			return pm.getStakeHolder();
		}
		return null;
	}
}
