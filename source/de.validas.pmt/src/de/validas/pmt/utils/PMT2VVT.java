package de.validas.pmt.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;

import de.validas.vvt.Check;
import de.validas.vvt.CheckStatus;
import de.validas.vvt.Described;
import de.validas.vvt.Person;
import de.validas.vvt.Project;
import de.validas.vvt.Repository;
import de.validas.vvt.VvtFactory;
import de.validas.vvt.impl.VvtFactoryImpl;
import de.validas.vvt.utils.CheckUtils;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.IVerified;
import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.Named;
import metaModel.terms.Parameter;

public class PMT2VVT {


	/** if this setting is set V&V checks will be exported that contribute to the claim (and all it's sub-requirements */
	public static boolean bUseOnlyClaimed = false;
	
	public static VvtFactory factory = new VvtFactoryImpl();

	public static Project getVVT(Named named,List<String> lMsgs) throws Exception  {

		// VariantModel vm = VVUtils.getVariantModelforNamedElement(named);

		int iAnzChecks = 0;
		Project prResult = factory.createProject();
		
		// compute top ProcessModule (is empty for complete projects)
		EObject eoHelp=named;
		while (!(eoHelp instanceof ProcessModule) && eoHelp!=null) {
			eoHelp=eoHelp.eContainer();
		}
		ProcessModule pmMain=(ProcessModule)eoHelp;
		if (pmMain==null && named instanceof Process && ((Process)named).getProcessModules().size()>0) {
			// take first top process (if available)
			pmMain=((Process)named).getProcessModules().get(0);
		}
		prResult.setName(named.getName());
		prResult.setProduct("Process "+HierarchyModel.getProzessSuper(pmMain).getName()+" - Module "+pmMain.getName());
		prResult.setVersion("Exported "+CheckUtils.getNow());
		prResult.setIssueTracker("https://teststatt.atlassian.net/projects/VP/issues/");

		lMsgs.add("Export "+named.getName()+" into V&V Project "+prResult.getName());
		if (named.getDescription()!=null){
			prResult.setDescription(named.getDescription());
		}
		if (named.getLongDescription()!=null) {
			prResult.setLongDescription(named.getLongDescription());;						
		}

		Repository repoDefault = factory.createRepository();
		repoDefault.setName("Default Repository");
		repoDefault.setDescription("The default repository of the project under V&V");
		repoDefault.setComment("Adapt the URL (and the issue tracker) to your repository for full VVT support");
		repoDefault.setURL("svn/repo/qkitabc");
		prResult.getRepository().add(repoDefault);
		Map<StakeHolder,Person> mPerson = new HashMap<StakeHolder, Person>();
		Map<Artifact,de.validas.vvt.Artifact> mArts = new HashMap<Artifact,de.validas.vvt.Artifact>();
		Map<Parameter,de.validas.vvt.Parameter> mParams = new HashMap<Parameter,de.validas.vvt.Parameter>();
		Set<VerificationModule> allVMs = VVUtils.getAllRelevantVerificationModules(pmMain,named,bUseOnlyClaimed);
		final Set<VerificationModule> sExplicitVMs = new HashSet<VerificationModule>();
		for (final VerificationModule v : allVMs) {
			if (!v.isImplicit() || v.getCriteria().size()>0) {
				sExplicitVMs.add(v);
			}
		}
		final Map<String, Map<Artifact, Set<VerificationModule>>> mChecks = VVUtils.getVerificationPathMap(sExplicitVMs);
		final List<String> lAs = new LinkedList<String>();
		lAs.addAll(mChecks.keySet());
		Collections.sort(lAs);
		for (final String sPath : lAs) {
			Map<Artifact, Set<VerificationModule>> mArt2Checks = mChecks.get(sPath);
//			if (!vm.isActiveOneArtifact(mArt2Checks.keySet())) {
//				continue;
//			}
			String sPlur=(mArt2Checks.size()>1?"s":"");
			String sHasHave=(mArt2Checks.size()>1?"have":"has");
			Check cPath=factory.createCheck();
			iAnzChecks++;
			cPath.setName("Check"+sPlur+" at "+sPath);
			cPath.setDescription("Checking "+mArt2Checks.size()+" Artifact"+sPlur+" in "+sPath);
			cPath.setLongDescription("Once all sub-checks are performed successfully, this implicit check can be set to PASS.");
			cPath.setImplicit(true);
			lMsgs.add(""+iAnzChecks+". Created implicit check for '"+cPath.getName()+"'");
			cPath.setComment("If "+sPath+" changes all "+mArt2Checks.size()+" check"+sPlur+" "+sHasHave+" to be repeated.");
			cPath.setVerdict(CheckStatus.CREATED);
			prResult.getChecks().add(cPath);
			List<Artifact> lArts=new LinkedList<Artifact>();
			lArts.addAll(mArt2Checks.keySet());
			Collections.sort(lArts, new NamedComparator(true));
			for (Artifact art:lArts) {
				Set<VerificationModule> sVMs=mArt2Checks.get(art);
				String sPlur2=(sVMs.size()>1?"s":"");
				String sHasHave2=(sVMs.size()>1?"have":"has");		
				Check cArt=factory.createCheck();
				iAnzChecks++;
				cArt.setLongDescription("Once all sub-checks are performed successfully, this implicit check can be set to PASS.");
				cArt.setImplicit(true);
				cArt.setName("Check"+sPlur2+" of "+art.getName());
				cArt.setDescription("Checking "+sVMs.size()+" check"+sPlur2+" for Artifact "+art.getName());
				lMsgs.add(""+iAnzChecks+". Created implicit check for '"+cArt.getName()+"'");
				cArt.setComment("If "+sPath+" changes all "+sVMs.size()+" check"+sPlur2+" "+sHasHave2+" to be repeated.");
				cPath.getSubChecks().add(cArt);
				// set checker
				StakeHolder sh = HierarchyModel.getStakeHolderSuper(art);
				setStakeHolder(prResult, mPerson, cArt, sh);

				if (!mArts.containsKey(art)) {
					de.validas.vvt.Artifact aNew = factory.createArtifact();					
					aNew.setRepository(repoDefault);
					copyDescriptiopn(art, aNew);
					cArt.setCheckedArtifact(aNew);
					String sPathSuper=HierarchyModel.getPathSuper(art);
					if (sPathSuper!=null) {
						aNew.setPath(sPathSuper);
					} 
					if (art.getStakeHolder()!=null) {
						if (!mPerson.containsKey(art.getStakeHolder())) {
							Person pAuth = factory.createPerson();
							copyDescriptiopn(art.getStakeHolder(), pAuth);
							if (art.getStakeHolder().getAssignedPerson()!=null) {pAuth.setFullName(art.getStakeHolder().getAssignedPerson()); }
							prResult.getPersons().add(pAuth);
							mPerson.put(art.getStakeHolder(),pAuth);
						}
						// System.out.println("adding developer "+mPerson.get(art.getStakeHolder()).getName()+" to "+art.getName());
						aNew.getDevleopers().add(mPerson.get(art.getStakeHolder()));
					}
					for (StakeHolder shArt:art.getInvolvedStakeHolders()) {
						if (!mPerson.containsKey(shArt)) {
							Person pAuth = factory.createPerson();
							copyDescriptiopn(shArt, pAuth);
							if (shArt.getAssignedPerson()!=null) {pAuth.setFullName(shArt.getAssignedPerson()); }
							prResult.getPersons().add(pAuth);
							// System.out.println("adding person "+pAuth.getName());
							mPerson.put(shArt,pAuth);
						}
						// System.out.println("adding developer "+mPerson.get(shArt).getName()+" to "+art.getName());								
						aNew.getDevleopers().add(mPerson.get(shArt));
					}
					prResult.getArtifacts().add(aNew);
					mArts.put(art, aNew);
				}
				cArt.setCheckedArtifact(mArts.get(art));
				// now go through all checks for the artifact
				List<VerificationModule> lVMs=new LinkedList<VerificationModule>();
				lVMs.addAll(sVMs);
				Collections.sort(lVMs, new NamedComparator(true));
				for (VerificationModule verm:lVMs) {
//					if (!vm.isActiveProcessModule(verm)) {
//						continue;
//					}
					Check cVM=factory.createCheck();
					iAnzChecks++;
					cArt.getSubChecks().add(cVM);
					copyDescriptiopn(verm, cVM);
					cVM.setImplicit(verm.isImplicit());
					if (verm.getVerifies().size()>1 || cVM.getName().equals(cArt.getName())) {
						// ensure uniqueness of names
						cVM.setName(cVM.getName()+" of "+art.getName());
					}
					lMsgs.add(""+iAnzChecks+". Created explicit check for '"+cVM.getName()+"'");
					// set checker
					StakeHolder shCk = HierarchyModel.getStakeHolderSuper(verm);
					setStakeHolder(prResult, mPerson, cVM, shCk);
					// add criteria as sub-checks
					for (Criterion cr:verm.getCriteria()) {
//						if (!vm.isActiveCriterion(cr)) {
//							continue;
//						}
						Check cCrit=factory.createCheck();
						iAnzChecks++;
						cVM.getSubChecks().add(cCrit);
						copyDescriptiopn(cr, cCrit);
						cCrit.setImplicit(false);					
						lMsgs.add(""+iAnzChecks+". Created check for Criterion'"+cCrit.getName()+"'");
						// same stakeholder
						setStakeHolder(prResult, mPerson, cCrit, shCk);
					}
					// atomic checks with criteria are implicit
					if (VariantModel.ProcessModule_getChildProcessModules(verm, named).size()==0
							&& verm.getCriteria().size()>0) {
						cVM.setImplicit(true);
					}
						// first check for parameters
					for (final Parameter param : VVUtils.getRelevantParameters(verm)) {
						// System.out.println(pm.getName()+": checking parameter "+p.getName()+":"+getShowParameter(p,pm)) ;			
						if (!mParams.containsKey(param)) {
							de.validas.vvt.Parameter pNew = factory.createParameter();
							copyDescriptiopn(param, pNew);
							if (param.getType()!=null) {
								pNew.setType(TermUtils.printType(param.getType()));
							}
							prResult.getParameter().add(pNew);
							mParams.put(param, pNew);
							// now add all bound values
							List<String> lVals=new LinkedList<String>();
							Set<String> instantiationValues = ParameterUtils.getInstantiationValues(param,pmMain);
							if (pmMain!=null && instantiationValues!=null) {
								lVals.addAll(instantiationValues);
							}
							Collections.sort(lVals);
							for (String sV:lVals) {
								de.validas.vvt.ParameterValue pv = factory.createParameterValue();
								pv.setValue(sV);
								pNew.getParameterValues().add(pv);
							}
						}
						cVM.getParameters().add(mParams.get(param));
						for (Check cCrit:cVM.getSubChecks()) {
							cCrit.getParameters().add(mParams.get(param));
						}
					}
					for (Artifact aIn:HierarchyModel.getAllInputs(verm)) {
						if (!mArts.containsKey(aIn)) {
							de.validas.vvt.Artifact aNew = factory.createArtifact();
							aNew.setRepository(repoDefault);
							copyDescriptiopn(aIn, aNew);
							mArts.put(aIn, aNew);
							String sPathSuper=HierarchyModel.getPathSuper((Artifact)aIn);
							if (sPathSuper!=null) {
								aNew.setPath(sPathSuper);
							} 
							prResult.getArtifacts().add(aNew);
						}
						de.validas.vvt.Artifact aNew=mArts.get(aIn);
						String sComment="";
						if (aNew.getComment()!=null) {
							sComment=aNew.getComment()+";";
						}
						aNew.setComment(sComment+" Input of "+verm.getName());
						cVM.getRequiredArtifacts().add(mArts.get(aIn));
					}
					if (HierarchyModel.getAllVerifiedInputs(verm).size()==0) {
						System.err.println("strange case: no verified inputs found for "+verm.getName());
					}
					for (IVerified aIn:HierarchyModel.getAllVerifiedInputs(verm)) {
						if (aIn instanceof Artifact) {
							if (!mArts.containsKey(aIn)) {
								de.validas.vvt.Artifact aNew = factory.createArtifact();
								aNew.setRepository(repoDefault);
								copyDescriptiopn((Artifact)aIn, aNew);
								prResult.getArtifacts().add(aNew);
								mArts.put((Artifact)aIn, aNew);
								String sPathSuper=HierarchyModel.getPathSuper((Artifact)aIn);
								if (sPathSuper!=null) {
									aNew.setPath(sPathSuper);
								} 
							}
							de.validas.vvt.Artifact aNew=mArts.get(aIn);
							String sComment="";
							if (aNew.getComment()!=null) {
								sComment=aNew.getComment()+";";
							}
							aNew.setComment(sComment+" Verified by "+verm.getName());
							// every check has only one verified input, so no problem to set them all;-)
							cVM.setCheckedArtifact(aNew);
							// set this also to the criteria
							for (Check cCrit:cVM.getSubChecks()) {
								cCrit.setCheckedArtifact(aNew);
							}
						}
					}
				}
			}
		}
		lMsgs.add("Created "+iAnzChecks+" Checks for "+prResult.getName());
		return prResult;
	}

	private static void setStakeHolder(Project prResult, Map<StakeHolder, Person> mPerson, Check cArt, StakeHolder sh) {
		if (sh!=null) { 
			if(!mPerson.containsKey(sh)) {
				Person person = factory.createPerson();
				copyDescriptiopn(sh, person);
				if (sh.getAssignedPerson()!=null) {
					person.setFullName(sh.getAssignedPerson()); 
				}
				prResult.getPersons().add(person);
				// System.out.println("adding person "+person.getName());
				mPerson.put(sh,person);
			}
			Person person=mPerson.get(sh);
			cArt.getAuthor().add(person);
			cArt.setVerdict(CheckStatus.ASSIGNED);
		} else {
			cArt.setVerdict(CheckStatus.CREATED);
		}
	}

	private static void copyDescriptiopn(Named nFrom,Described dTo) {
		if (nFrom.getName()!=null) {
			dTo.setName(nFrom.getName());
		}
		if (nFrom.getDescription()!=null) {
			dTo.setDescription(nFrom.getDescription());
		}
		if (nFrom.getID()!=null) {
			dTo.setId(nFrom.getID());
		}
		if (nFrom.getLongDescription()!=null) {
			dTo.setLongDescription(nFrom.getLongDescription());
		}
		if (nFrom.getComment()!=null) {
			dTo.setComment(nFrom.getComment());
		}
	}
}
