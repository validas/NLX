/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import metaModel.modellDescr.Cardinality;
import metaModel.modellDescr.MetaModel;
import metaModel.modellDescr.MetaModelAssociation;
import metaModel.modellDescr.MetaModelAttribute;
import metaModel.modellDescr.MetaModelElement;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.Tool;

/**
 * @author slotosch
 * utilities for the meta model
 */
public class MMUtils {

	public static Set<MetaModelAttribute> getAllAttributes(MetaModelElement mme) {
		Set<MetaModelAttribute> sResult = new HashSet<MetaModelAttribute>();
		sResult.addAll(mme.getMetaModelAttributes());
		for (MetaModelElement mP:mme.getParents()) {
			if (!isCyclic(mP)) {
				sResult.addAll(getAllAttributes(mP));
			}
		}
		return sResult;
	}

	public static Set<MetaModelAssociation> getAllAssociations(MetaModelElement mme) {
		Set<MetaModelAssociation> sResult = new HashSet<MetaModelAssociation>();
		sResult.addAll(mme.getMetaModelAssociations());
		for (MetaModelElement mP:mme.getParents()) {
			if (!isCyclic(mP)) {
				sResult.addAll(getAllAssociations(mP));
			}
		}
		return sResult;
	}

	/** computes all mandatory elements of the model, including includes */
	public static Set<MetaModelElement> getAllMandatoryElements(Model m) {
		return getAllMandatoryElements(m,new HashSet<Model>());
	}
	
	private static Set<MetaModelElement> getAllMandatoryElements(Model m, Set<Model> sVisited) {
		Set<MetaModelElement> sResult = new HashSet<MetaModelElement>();
		if (sVisited.contains(m)) {
			return sResult;
		}
		sResult.addAll(m.getMandatoryElements());
		sVisited.add(m);
		for(Model mInc:m.getIncludes()) {
			sResult.addAll(getAllMandatoryElements(mInc, sVisited));
		}
		return sResult;
	}

	/** computes all optional elements of the model, including includes */
	public static Set<MetaModelElement> getAllOptionalElements(Model m) {
		return getAllOptionalElements(m,new HashSet<Model>());
	}
	
	private static Set<MetaModelElement> getAllOptionalElements(Model m, Set<Model> sVisited) {
		Set<MetaModelElement> sResult = new HashSet<MetaModelElement>();
		if (sVisited.contains(m)) {
			return sResult;
		}
		sResult.addAll(m.getOptionalElements());
		sVisited.add(m);
		for(Model mInc:m.getIncludes()) {
			sResult.addAll(getAllOptionalElements(mInc, sVisited));
		}
		return sResult;
	}
	/** computes all mandatory attributes of the model, including includes */
	public static Set<MetaModelAttribute> getAllMandatoryAttributes(Model m) {
		return getAllMandatoryAttributes(m,new HashSet<Model>());
	}
	
	private static Set<MetaModelAttribute> getAllMandatoryAttributes(Model m, Set<Model> sVisited) {
		Set<MetaModelAttribute> sResult = new HashSet<MetaModelAttribute>();
		if (sVisited.contains(m)) {
			return sResult;
		}
		sResult.addAll(m.getMandatoryAttributes());
		sVisited.add(m);
		for(Model mInc:m.getIncludes()) {
			sResult.addAll(getAllMandatoryAttributes(mInc, sVisited));
		}
		return sResult;
	}

	/** computes all optional attributes of the model, including includes */
	public static Set<MetaModelAttribute> getAllOptionalAttributes(Model m) {
		return getAllOptionalAttributes(m,new HashSet<Model>());
	}
	
	private static Set<MetaModelAttribute> getAllOptionalAttributes(Model m, Set<Model> sVisited) {
		Set<MetaModelAttribute> sResult = new HashSet<MetaModelAttribute>();
		if (sVisited.contains(m)) {
			return sResult;
		}
		sResult.addAll(m.getOptionalAttributes());
		sVisited.add(m);
		for(Model mInc:m.getIncludes()) {
			sResult.addAll(getAllOptionalAttributes(mInc, sVisited));
		}
		return sResult;
	}
	/** computes all mandatory associations of the model, including includes */
	public static Set<MetaModelAssociation> getAllMandatoryAssociations(Model m) {
		return getAllMandatoryAssociations(m,new HashSet<Model>());
	}
	
	private static Set<MetaModelAssociation> getAllMandatoryAssociations(Model m, Set<Model> sVisited) {
		Set<MetaModelAssociation> sResult = new HashSet<MetaModelAssociation>();
		if (sVisited.contains(m)) {
			return sResult;
		}
		sResult.addAll(m.getMandatoryAssociations());
		sVisited.add(m);
		for(Model mInc:m.getIncludes()) {
			sResult.addAll(getAllMandatoryAssociations(mInc, sVisited));
		}
		return sResult;
	}

	/** computes all optional associations of the model, including includes */
	public static Set<MetaModelAssociation> getAllOptionalAssociations(Model m) {
		return getAllOptionalAssociations(m,new HashSet<Model>());
	}
	
	private static Set<MetaModelAssociation> getAllOptionalAssociations(Model m, Set<Model> sVisited) {
		Set<MetaModelAssociation> sResult = new HashSet<MetaModelAssociation>();
		if (sVisited.contains(m)) {
			return sResult;
		}
		sResult.addAll(m.getOptionalAssociations());
		sVisited.add(m);
		for(Model mInc:m.getIncludes()) {
			sResult.addAll(getAllOptionalAssociations(mInc, sVisited));
		}
		return sResult;
	}

	/** computes (only included) included mandatory elements of the model */
	public static Map<MetaModelElement,Model> getIncludedMandatoryElements(Model m) {
		Map<MetaModelElement,Model> mResult = new HashMap<MetaModelElement, Model>();
		for (Model mIn:getAllIncludedModels(m)) {
			for (MetaModelElement mm:mIn.getMandatoryElements()) {
				mResult.put(mm, mIn); // might be overwritten if elements are included several times
			}
		}
		return mResult;
	}
	
	/** computes (only included) included mandatory attributes of the model */
	public static Map<MetaModelAttribute,Model> getIncludedMandatoryAttributes(Model m) {
		Map<MetaModelAttribute,Model> mResult = new HashMap<MetaModelAttribute, Model>();
		for (Model mIn:getAllIncludedModels(m)) {
			for (MetaModelAttribute mm:mIn.getMandatoryAttributes()) {
				mResult.put(mm, mIn); // might be overwritten if elements are included several times
			}
		}
		return mResult;
	}
	
	/** computes (only included) included mandatory associations of the model */
	public static Map<MetaModelAssociation,Model> getIncludedMandatoryAssociations(Model m) {
		Map<MetaModelAssociation,Model> mResult = new HashMap<MetaModelAssociation, Model>();
		for (Model mIn:getAllIncludedModels(m)) {
			for (MetaModelAssociation mm:mIn.getMandatoryAssociations()) {
				mResult.put(mm, mIn); // might be overwritten if elements are included several times
			}
		}
		return mResult;
	}
	
	/** computes (only included) included Optional elements of the model */
	public static Map<MetaModelElement,Model> getIncludedOptionalElements(Model m) {
		Map<MetaModelElement,Model> mResult = new HashMap<MetaModelElement, Model>();
		for (Model mIn:getAllIncludedModels(m)) {
			for (MetaModelElement mm:mIn.getOptionalElements()) {
				mResult.put(mm, mIn); // might be overwritten if elements are included several times
			}
		}
		return mResult;
	}
	
	/** computes (only included) included Optional attributes of the model */
	public static Map<MetaModelAttribute,Model> getIncludedOptionalAttributes(Model m) {
		Map<MetaModelAttribute,Model> mResult = new HashMap<MetaModelAttribute, Model>();
		for (Model mIn:getAllIncludedModels(m)) {
			for (MetaModelAttribute mm:mIn.getOptionalAttributes()) {
				mResult.put(mm, mIn); // might be overwritten if elements are included several times
			}
		}
		return mResult;
	}
	
	/** computes (only included) included Optional associations of the model */
	public static Map<MetaModelAssociation,Model> getIncludedOptionalAssociations(Model m) {
		Map<MetaModelAssociation,Model> mResult = new HashMap<MetaModelAssociation, Model>();
		for (Model mIn:getAllIncludedModels(m)) {
			for (MetaModelAssociation mm:mIn.getOptionalAssociations()) {
				mResult.put(mm, mIn); // might be overwritten if elements are included several times
			}
		}
		return mResult;
	}

	public static Set<Model> getAllIncludedModels(Model model) {
		Set<Model> sResult = new HashSet<Model>();
		sResult.addAll(model.getIncludes());
		for (Model mI:model.getIncludes()) {
			if (!isCyclic(mI)) {
				sResult.addAll(getAllIncludedModels(mI));
			}
		}
		for (Artifact mSub:model.getSubArtifacts()) {
			if (mSub instanceof Model && !isCyclic((Model)mSub)) {
				sResult.addAll(getAllIncludedModels((Model)mSub));
			}
		}
		for (Artifact mSub:model.getSubArtifactReferences()) {
			if (mSub instanceof Model && !isCyclic((Model)mSub)) {
				sResult.addAll(getAllIncludedModels((Model)mSub));
			}
		}

		return sResult;
	}

	public static Set<MetaModelElement> getAllParentElements(MetaModelElement mme) {
		Set<MetaModelElement> sResult = new HashSet<MetaModelElement>();
		sResult.addAll(mme.getParents());
		for (MetaModelElement mP:mme.getParents()) {
			if (!isCyclic(mP)) {
				sResult.addAll(getAllParentElements(mP));
			}
		}
		return sResult;
	}
	
	/* returns all elements that can contain mme */
	public static Set<MetaModelElement> getAllContainers(MetaModelElement mme) {
		Set<MetaModelElement> sResult = new HashSet<MetaModelElement>();
		MetaModel mm = (MetaModel) mme.eContainer();
		for (MetaModelElement mmeHelp:mm.getMetaModelElements()) {
			for (MetaModelAssociation mma:mmeHelp.getMetaModelAssociations()) {
				if (mme==mma.getToElement() && mma.isContainment()) {
					sResult.add(mmeHelp);
				}
			}
		}
		return sResult;
	}


	public static boolean isTyped(MetaModelAttribute mma) {
		return mma.getType()!=null && !mma.getType().trim().equals("");
	}

	public static boolean isTyped(MetaModelAssociation mma) {
		return mma.getCardinality()!=null && mma.getToElement()!=null;
	}


	public static Set<MetaModelElement> getAllRootElements(MetaModel mm) {
		Set<MetaModelElement> sRes = new HashSet<MetaModelElement>();
		for (MetaModelElement mme:mm.getMetaModelElements()) {
			if (mme.isIsRoot()) {
				sRes.add(mme);
			}
		}
		return sRes;
	}
	/**
	 * checks if the model has itself as a parent
	 * @param mme
	 * @return
	 */
	public static boolean isCyclic(MetaModelElement mme) {
		return isCyclicHelper(mme,new HashSet<MetaModelElement>());
	}

	private static boolean isCyclicHelper(MetaModelElement mme, Set<MetaModelElement> sVisited) {
		if (sVisited.contains(mme)) {
			return true;
		}
		if (mme.getParents().size()==0) {
			return false;
		}
		
		sVisited.add(mme);
		for (MetaModelElement mP:mme.getParents()) {
			HashSet<MetaModelElement> sCopyForMP = new HashSet<MetaModelElement>(sVisited);
			if (isCyclicHelper(mP, sCopyForMP)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * checks if the model has itself as a parent
	 * @param mme
	 * @return
	 */
	public static boolean isCyclic(Artifact mme) {
		return isCyclicHelper(mme,new HashSet<Artifact>());
	}

	private static boolean isCyclicHelper(Artifact mme, Set<Artifact> sVisited) {
		if (sVisited.contains(mme)) {
			return true;
		}
		sVisited.add(mme);
		if (mme instanceof Model) {
			for (Model mP:((Model)mme).getIncludes()) {
				if (isCyclicHelper(mP, sVisited)) {
					return true;
				}
			}
		}
		for (Artifact mP:mme.getReferedByArtifacts()) {
			if (isCyclicHelper(mP, sVisited)) {
				return true;
			}
		}
		return false;
	}
	
	/** checks if the element is contained in a root element */
	public static boolean isContainedInRoot(MetaModelElement mme) {
		return isContainedInRoot(mme, new HashSet<MetaModelElement>());
	}
	/** checks if the element is contained in a root element */
	private static boolean isContainedInRoot(MetaModelElement mme,Set<MetaModelElement> sVisited) {
		if (mme.isIsRoot()) {
			return true;
		}
		if (sVisited.contains(mme)) {
			return false;
		}
		sVisited.add(mme);
		for (MetaModelElement mmeContainer:getAllContainers(mme)) {
			Set<MetaModelElement> sCopy = new HashSet<MetaModelElement>(sVisited);
			if (isContainedInRoot(mmeContainer,sCopy)) {
				return true;
			}
		}
		for (MetaModelElement mmeParent:getAllParentElements(mme)) {
			Set<MetaModelElement> sCopy = new HashSet<MetaModelElement>(sVisited);
			if (isContainedInRoot(mmeParent,sCopy)) {
				return true;
			}
		}
		return false;
	}

	/** gets all sub-types of an element (by searching the complete model) */
	public static Set<MetaModelElement> getSubTypeElements(MetaModelElement mme) {
		Set<MetaModelElement> sResult = new HashSet<MetaModelElement>();
		for (MetaModelElement mCand:((MetaModel)mme.eContainer()).getMetaModelElements()) {
			if (mCand.getParents().contains(mme)) {
				sResult.add(mCand);
			}
		}
		return sResult;
	}

	public static Set<MetaModelElement> getAllElements(MetaModel mm) {
		Set<MetaModelElement> sRes=new HashSet<MetaModelElement>();
		TreeIterator<EObject> it=mm.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof MetaModelElement && !((MetaModelElement)eo).isDeactivated()) {
				sRes.add((MetaModelElement) eo);
			}
		}
		return sRes;
	}

	public static Set<MetaModelElement> getAllIncludedElements(Model model) {
		Set<MetaModelElement> sRes=new HashSet<MetaModelElement>();
		for (Model mIn:getAllIncludedModels(model)) {
			for (MetaModelElement mme:mIn.getMandatoryElements()) {
				sRes.add(mme);
				sRes.addAll(getAllParentElements(mme));
			}
		}
		return sRes;
	}

	public static Set<MetaModelAttribute> getAllIncludedAttributes(Model model) {
		Set<MetaModelAttribute> sRes=new HashSet<MetaModelAttribute>();
		for (Model mIn:getAllIncludedModels(model)) {
			sRes.addAll(mIn.getMandatoryAttributes());
		}
		return sRes;
	}

	public static Set<MetaModelAssociation> getAllIncludedAssocitions(Model model) {
		Set<MetaModelAssociation> sRes=new HashSet<MetaModelAssociation>();
		for (Model mIn:getAllIncludedModels(model)) {
			sRes.addAll(mIn.getMandatoryAssociations());
		}
		return sRes;
	}

	public static Set<MetaModelAttribute> getAllAttributes(MetaModel mm) {
		Set<MetaModelAttribute> sRes=new HashSet<MetaModelAttribute>();
		TreeIterator<EObject> it=mm.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof MetaModelAttribute && !((MetaModelAttribute)eo).isDeactivated()) {
				sRes.add((MetaModelAttribute) eo);
			}
		}
		return sRes;
	}	

	public static Set<MetaModelAssociation> getAllAssociations(MetaModel mm) {
		Set<MetaModelAssociation> sRes=new HashSet<MetaModelAssociation>();
		TreeIterator<EObject> it=mm.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof MetaModelAssociation && !((MetaModelAssociation)eo).isDeactivated()) {
				sRes.add((MetaModelAssociation) eo);
			}
		}
		return sRes;
	}

	public static String getCardinalityString(Cardinality cardinality) {
		switch (cardinality) {
		case CARDINALITY_0TO_1: return "?";
		case CARDINALITY_0TO_N: return "*";
		case CARDINALITY_1: return "1";
		case CARDINALITY_N: return "N";
		default:
			break;
		}
		return "";
	}

	public static Tool getToolSuper(Model model) {
		if (model.getMetaModel()!=null) {
			return model.getMetaModel().getTool();
		}
		if (model.eContainer() instanceof Model) {
			return getToolSuper((Model)model.eContainer());
		}
		return null;
	}

	/** removes the package prefix (if given), e.g. "metaModel.referenceProcess.Compliance" -> "Compliance" */
	public static String getTextWithoutPackage(String sText) {
		if (sText != null) {
			if (sText.lastIndexOf(".") > 0 && sText.lastIndexOf(".") < sText.length()) {
				return sText.substring(sText.lastIndexOf(".") + 1);
			}
			return sText;
		}
		return "";
	}
}
