/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.validas.pmt.utils.VariantModel.ACTIVATION;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.IVerified;
import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ProcessStatus;
import metaModel.referenceProcess.ReferenceProcessFactory;
import metaModel.referenceProcess.VerificationModule;
import metaModel.referenceProcess.impl.ReferenceProcessFactoryImpl;
import metaModel.suptertype.Named;
import metaModel.terms.Binding;
import metaModel.terms.Parameter;
import metaModel.terms.TermsFactory;
import metaModel.terms.impl.TermsFactoryImpl;

/**
 * @author slotosch
 * creates the instances for processes
 */
public class Instantiator {

	public static TermsFactory factory = new TermsFactoryImpl();
	public static ReferenceProcessFactory factoryProcess =new ReferenceProcessFactoryImpl();

	private static boolean checkForParametersSpecified(ProcessModule pm, Set<Parameter> sRelevantParams) {
		boolean bInstantiate=false;
		for (Parameter p:pm.getParameters()) {
			if (sRelevantParams.contains(p)) {
				bInstantiate=true;
			}
		}
		for (Parameter p:pm.getParameterReferences()) {
			if (sRelevantParams.contains(p)) {
				bInstantiate=true;
			}
		}
		return bInstantiate;
	}
	/** instantiates process module: all processes / sub-processes that have a parameter (or reference) are instantiated */
	public static List<String>  instantiateProcessModules(ProcessModule pm, Set<Parameter> sRelevantParams) throws Exception {
		List<String> lRes= new LinkedList<String>();
		lRes.add("instantiateProcessModules in '"+pm.getName()+"'");
		// Named nScope=pm; // use this as scope?
		
		// first create copies
		// then add them and link them

		Map<Artifact,Set<Artifact>> mAllArts=new HashMap<Artifact, Set<Artifact>>();
		Map<ProcessModule,Set<ProcessModule>> mAllPMs=new HashMap<ProcessModule, Set<ProcessModule>>();
		lRes.addAll(createInstances(pm,mAllArts,mAllPMs, sRelevantParams));
		lRes.addAll(linkInstances(pm,mAllArts,mAllPMs, sRelevantParams));
		return lRes;
	}

	private static List<String> createInstances(ProcessModule pm, Map<Artifact, Set<Artifact>> mAllArts, Map<ProcessModule, Set<ProcessModule>> mAllPMs, Set<Parameter> sRelevantParams) {
		List<String> lRes= new LinkedList<String>();
		List<ProcessModule> processModule_getChildProcessModules = VariantModel.ProcessModule_getChildProcessModules(pm, pm);
		for (ProcessModule pmSub:processModule_getChildProcessModules) {
			lRes.addAll(createInstances(pmSub, mAllArts, mAllPMs, sRelevantParams));
		}
		// first check if instances are required
		boolean bInstantiate = checkForParametersSpecified(pm, sRelevantParams);
		if (!bInstantiate) {
			lRes.add("do not instantiate ProcessModule '"+pm.getName()+"'");
			return lRes;
		}
		lRes.add("instantiate ProcessModules in '"+pm.getName()+"'");
		try {
			List<Map<Parameter, String>> lVals = getValueTable(pm, sRelevantParams, lRes);
			for (Map<Parameter, String> m:lVals) {
				ProcessModule pmInst = instantiateProcessModule(pm, pm, mAllPMs, m, mAllArts, sRelevantParams);
				lRes.add("instantiated '"+pm.getName()+"' to '"+pmInst.getName()+"'");
				// do not add this here, but later (linking)
			}
		} catch (Exception e) {
			lRes.add("Cannot create Instances for '"+pm.getName()+"'. Value problem:"+e.getMessage());
			e.printStackTrace();
		}
		return lRes;
	}

	private static List<String> linkInstances(ProcessModule pm, Map<Artifact, Set<Artifact>> mAllArts, Map<ProcessModule, Set<ProcessModule>> mAllPMs, Set<Parameter> sRelevantParams) {
		List<String> lRes= new LinkedList<String>();
		List<ProcessModule> processModule_getChildProcessModules = VariantModel.ProcessModule_getChildProcessModules(pm, pm);
		for (ProcessModule pmSub:processModule_getChildProcessModules) {
			lRes.addAll(linkInstances(pmSub, mAllArts, mAllPMs, sRelevantParams));
		}
		// first check if instances are required
		boolean bInstantiate = checkForParametersSpecified(pm, sRelevantParams);
		if (!bInstantiate) {
			lRes.add("do not link ProcessModules '"+pm.getName()+"'");
			return lRes;
		}
		lRes.add("link ProcessModules in '"+pm.getName()+"'");
		try {
			List<Map<Parameter, String>> lVals = getValueTable(pm, sRelevantParams, lRes);
			for (Map<Parameter, String> m:lVals) {
				// search the element-instances and then (if found) link them
				ProcessModule pmInst = null;
				if (mAllPMs.containsKey(pm)) {
					for (ProcessModule x:mAllPMs.get(pm)){
						if (x.getName().equals(getNameForInstance(pm, m))) {
							pmInst=x;
						}
					}
					if (pmInst!=null) {
						pm.getSubProcessModules().add(pmInst);
						lRes.add("linked ProcessModule '"+pm.getName()+"' to '"+pmInst.getName()+"'");
					}
				}
				// now check for artifacts
				for (Artifact a:pm.getInputArtifacts()) {
					if (mAllArts.containsKey(a)) {
						Artifact aInst = null;
						for (Artifact x:mAllArts.get(a)){
							if (x.getName().equals(getNameForInstance(a, m))) {
								aInst=x;
							}
						}
						if (aInst!=null) {
							a.getSubArtifacts().add(aInst);
							lRes.add("linked Input Artifact '"+a.getName()+"' to '"+aInst.getName()+"'");
							if (pmInst!=null) {
								pmInst.getInputArtifacts().add(aInst);
								lRes.add("conected '"+aInst.getName()+"' -> '"+pmInst.getName()+"'");
							}
						}
					}
				}
				for (Artifact a:pm.getOutputArtifacts()) {
					if (mAllArts.containsKey(a)) {
						Artifact aInst = null;
						for (Artifact x:mAllArts.get(a)){
							if (x.getName().equals(getNameForInstance(a, m))) {
								aInst=x;
							}
						}
						if (aInst!=null) {
							a.getSubArtifacts().add(aInst);
							lRes.add("linked Output Artifact '"+a.getName()+"' to '"+aInst.getName()+"'");
							if (pmInst!=null) {
								pmInst.getOutputArtifacts().add(aInst);
								lRes.add("conected '"+pmInst.getName()+"' -> '"+aInst.getName()+"'");
							}
						}
					}
				}
				if (pmInst instanceof VerificationModule) {
					for (IVerified v:((VerificationModule)pm).getVerifies()) {
						IVerified vInst=v;
						// check if there is an input which matches better
						for (Artifact a:pm.getInputArtifacts()) {
							if (mAllArts.containsKey(a)) {
								for (Artifact x:mAllArts.get(a)){
									if (x.getName().equals(getNameForVerified(v, m))) {
										vInst=x;
									}
								}
							}
						}
						pmInst.getVerifies().add(vInst);
					}
					for (Criterion c:((VerificationModule)pmInst).getCriteria()) {
						if (c.getID()!=null) {
							c.setID(c.getID()+"-"+printShortMap(m));
						}
						if (!c.getName().equals("")) {
							c.setName(c.getName()+"-"+printSimpleMap(m));
						}
						if (!c.getDescription().equals("")) {
							c.setDescription(c.getDescription()+" for "+printSimpleMap(m));
						}
					}
				}
			}
		} catch (Exception e) {
			lRes.add("Cannot create Instances for '"+pm.getName()+"'. Value problem:"+e.getMessage());
			e.printStackTrace();
		}
		return lRes;
	}


	/**
	 * some routines to "smartly clone" the  PM
	 * works in two phases: 1) clone the structure (this routine) 2) link (next routine)
	 * - evaluates variants 
	 * - clone only active elements
	 * - do not clone variables
	 * - inserts the new element also into the map 
	 * @param m 
	 * @param sRelevantParams 
	 * @param map: is extended by the new maps
	 * @return the clones elements
	 */
	private static ProcessModule instantiateProcessModule(ProcessModule pm,Named nScope,Map<ProcessModule,Set<ProcessModule>> mPMs, Map<Parameter, String> m, Map<Artifact, Set<Artifact>> mArts, Set<Parameter> sRelevantParams) {
		ProcessModule pmRes = null;
		if (pm instanceof VerificationModule) {
			pmRes = factoryProcess.createVerificationModule();
			for (Criterion c:((VerificationModule)pm).getCriteria()) {
				Criterion cNew=factoryProcess.createCriterion();
				copyDescriptiopn(c, cNew);
				((VerificationModule)pmRes).getCriteria().add(cNew);
			}
			for (Compliance c:((VerificationModule)pm).getVerifiedCompliances()) {
				((VerificationModule)pmRes).getVerifiedCompliances().add(c);
			}
		} else {
			pmRes = factoryProcess.createProcessModule();
		}
		if (!mPMs.containsKey(pm)) {
			mPMs.put(pm, new HashSet<ProcessModule>());
		}
		mPMs.get(pm).add(pmRes);
		copyDescriptiopn(pm, pmRes);
		pmRes.setInstanceOfProcessModule(pm);
		if (pm.getName()!=null) {
			pmRes.setName(getNameForInstance(pm, m));
		} else {
			pmRes.setName("Instance for "+printSimpleMap(m));
		}
		if (pm.getDescription()!=null) {
			pmRes.setDescription(pm.getDescription()+" for "+printSimpleMap(m));
		} else {
			pmRes.setDescription("Instance of "+pm.getName()+" for "+printSimpleMap(m));
		}
		if (pm.getURI()!=null) {pmRes.setURI(pm.getURI());}
		pmRes.setNumberOfInstances(1); // no more instances;
		pmRes.setStatus(ProcessStatus.DEFINED); // new process is defined
		pmRes.setEffort(pm.getEffort());
		pmRes.setProgress(pm.getProgress());
		pmRes.setEffort(pm.getEffort());
		if (pm.getPlannedStartDate()!=null) {pmRes.setPlannedStartDate(pm.getPlannedStartDate());}
		if (pm.getPlannedEndDate()!=null) { pmRes.setPlannedEndDate(pm.getPlannedEndDate());}
		if (pm instanceof VerificationModule) {
			((VerificationModule)pmRes).setImplicit(((VerificationModule)pm).isImplicit());
		}
		for (Binding b:pm.getBindings()) {
			pmRes.getBindings().add(copyBinding(b,nScope));
		}
		// create artifacts
		for (Artifact a:pm.getInputArtifacts()) {
			if (VariantModel.isActive(a, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				copyArtifact(a,nScope,m,mArts);
			}
		}
		for (Artifact a:pm.getOutputArtifacts()) {
			if (VariantModel.isActive(a, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				copyArtifact(a,nScope,m,mArts);
			}
		}
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			if (checkForParametersSpecified(pmSub, sRelevantParams)) {
				if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					pmRes.getSubProcessModules().add(instantiateProcessModule(pmSub, nScope, mPMs, m, mArts, sRelevantParams));
				}
			} else {
				// add just a reference to it
				pmRes.getSubProcessModuleReferences().add(pmSub);
			}
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			if (checkForParametersSpecified(pmSub, sRelevantParams)) {
				if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					pmRes.getSubProcessModules().add(instantiateProcessModule(pmSub, nScope, mPMs, m, mArts, sRelevantParams));
				} 
			}else {
				// add just a reference to it
				pmRes.getSubProcessModuleReferences().add(pmSub);
			}
		}
		return pmRes;
	}
	/** computes the name for the instance (of processes and artifacts */
	private static String getNameForInstance(Named named, Map<Parameter, String> m) {
		return named.getName()+" for "+printSimpleMap(m);
	}
	private static String getNameForVerified(IVerified iv, Map<Parameter, String> m) {
		if (iv instanceof Named) {
			return getNameForInstance((Named)iv,m);
		}
		System.err.println("getNameForVerified could not find name for "+iv.eClass().getName());
		return "?? for "+printSimpleMap(m);
	}

	public static String printMap(Map<Parameter,Set<String>> m) {
		String sRes="";
		for (Parameter p:m.keySet()) {
			if (!sRes.equals("")) {
				sRes+="; ";
			}
			sRes+=p.getName()+"->";
			String sVals="";
			for (String s:m.get(p) ) {
				if (!sVals.equals("")) {
					sVals+=",";
				}
				sVals+=s;
			}
			sRes+=sVals;
		}
		return sRes;
	}

	/** prints a map with parameter name -> */
	public static String printSimpleMap(Map<Parameter,String> m) {
		String sRes="";
		for (Parameter p:m.keySet()) {
			if (!sRes.equals("")) {
				sRes+="; ";
			}
			sRes+=p.getName()+"->"+m.get(p);
		}
		return sRes;
	}
	/** prints a map without parameter name -> */
	public static String printShortMap(Map<Parameter,String> m) {
		String sRes="";
		for (Parameter p:m.keySet()) {
			if (!sRes.equals("")) {
				sRes+="/";
			}
			sRes+=m.get(p);
		}
		return sRes;
	}
	/** computes the values that can be instantiated in the PM, checks also for sup-processes */
	public static  List<Map<Parameter,String>> getValueTable(ProcessModule pm, Set<Parameter> sRelevantParams,List<String> lMsg) throws Exception {
		Map<Parameter,Set<String>> mVals=new HashMap<Parameter, Set<String>>();
		for (Parameter p:HierarchyModel.getAllParameters(pm)) {
			Set<String> sValues = ParameterUtils.getInstantiationValues(p, pm);
			if (sValues!=null) {
				mVals.put(p, sValues);
			}
		}
		for (ProcessModule pmSub:HierarchyModel.getAllProcessModulesWithRecursionCheck(pm)) {
			for (Parameter p:HierarchyModel.getAllParameters(pmSub)) {
				if (!mVals.containsKey(p)) {
					Set<String> sValues = ParameterUtils.getInstantiationValues(p, pmSub);
					if (sValues!=null) {
						mVals.put(p, sValues);
					}
				}
			}
		}
		return getValueTable(mVals);
	}
	/**
	 * compute the table of values
	 * 1: P1=p1v1, P2=p1v1
	 * 2: P1=p1v1, P2=p2v2
	 * 3: P1=p1v2, P2=p2v1
	 * 4: P1=p1v2, P2=p2v2
	 */
	public static List<Map<Parameter,String>> getValueTable(Map<Parameter,Set<String>> mParams) {
		if (mParams.size()==0) {
			return new LinkedList<Map<Parameter,String>>();
		}
		List<Map<Parameter,String>> lRes = new LinkedList<Map<Parameter,String>>();
		Parameter pFirst = mParams.keySet().iterator().next();
		Set<String> sValues = mParams.get(pFirst);
		if (mParams.size()==1) {
			for (String sVal:sValues) {
				Map<Parameter,String> m=new HashMap<Parameter, String>();
				m.put(pFirst, sVal);
				lRes.add(m);
			}
			return lRes;
		}
		Map<Parameter,Set<String>> mRest = new HashMap<Parameter, Set<String>>();
		mRest.putAll(mParams);
		mRest.remove(pFirst);
		List<Map<Parameter, String>> lRestTable=getValueTable(mRest);
		for (Map<Parameter, String> m:lRestTable) {
			for (String sVal:sValues) {
				Map<Parameter,String> mNew=new HashMap<Parameter, String>();
				mNew.putAll(m);
				mNew.put(pFirst, sVal);
				lRes.add(mNew);
			}	
		}
		return lRes;
	}

	private static void copyArtifact(Artifact a, Named nScope, Map<Parameter, String> m,Map<Artifact,Set<Artifact>> mArts) {
		// search for Artifact and do not insert it again
		Artifact aNew=null;
		if (a instanceof Model) {
			aNew=factoryProcess.createModel();
		} else {
			aNew=factoryProcess.createArtifact();
		}
		if (!mArts.containsKey(a)) {
			mArts.put(a, new HashSet<Artifact>());
		}
		mArts.get(a).add(aNew);
		copyDescriptiopn(a, aNew);
		String sName="";
		if (a.getName()!=null) {
			sName=getNameForInstance(a, m);
		} else {
			sName="Instance for "+printSimpleMap(m);
		}
		aNew.setName(sName);
		if (a.getDescription()!=null) {
			aNew.setDescription(a.getDescription()+" for "+printSimpleMap(m));
		} else {
			aNew.setDescription("Instance of "+a.getName()+" for "+printSimpleMap(m));
		}
		if (a.getDocumentStatus()!=null) {
			aNew.setDocumentStatus(a.getDocumentStatus()+" for "+printSimpleMap(m));
		} else {
			aNew.setDocumentStatus("Document Status  of "+a.getName()+" for "+printSimpleMap(m));
		}
		aNew.setStatus(ProcessStatus.DEFINED);
		aNew.setPartOfProduct(a.isPartOfProduct());
		aNew.setProjectInput(a.isProjectInput());
		if (a.getVersion()!=null) {aNew.setVersion(a.getVersion());}
		if (a.getPath()!=null) {aNew.setPath(a.getVersion());} // set other path here (_FUNCTION?)
		for (Artifact aSub:a.getSubArtifacts()) {
			if (VariantModel.isActive(aSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				copyArtifact(aNew, nScope, m, mArts);
			}
		}
		for (Artifact aSub:a.getSubArtifactReferences()) {
			if (VariantModel.isActive(aSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				copyArtifact(aSub, nScope, m,mArts);
			}
		}
		if (a instanceof Model) {
			for (Model aSub:((Model)a).getIncludes()) {
				if (VariantModel.isActive(aSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					copyArtifact(aSub, nScope, m,mArts);
				}
			}
		}
	}

	private static Binding copyBinding(Binding b,Named nScope) {
		Binding bRes = factory.createBinding();
		if (b.getParameter()!=null) {bRes.setParameter(b.getParameter());}
		if (b.getValue()!=null) { try {
			// eval does a term-copy
			bRes.setValue(Evaluator.evalTerm(b.getValue()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
		return bRes;
	}

	private static void copyDescriptiopn(Named nFrom,Named dTo) {
		if (nFrom.getName()!=null) {
			dTo.setName(nFrom.getName());
		}
		if (nFrom.getDescription()!=null) {
			dTo.setDescription(nFrom.getDescription());
		}
		if (nFrom.getID()!=null) {
			dTo.setID(nFrom.getID());
		}
		if (nFrom.getLongDescription()!=null) {
			dTo.setLongDescription(nFrom.getLongDescription());
		}
		if (nFrom.getComment()!=null) {
			dTo.setComment(nFrom.getComment());
		}
	}


}
