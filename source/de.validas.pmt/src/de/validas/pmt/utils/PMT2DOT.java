package de.validas.pmt.utils;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;

import de.validas.pmt.utils.VariantModel.ACTIVATION;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.Named;
import metaModel.suptertype.Variantable;
import metaModel.terms.BoolTerm;
import metaModel.terms.NOTTerm;
import metaModel.terms.ProcessVariable;
import metaModel.terms.Term;

public class PMT2DOT {


	/** inheritance levels for Artifacts & roles: 0 only local, N inherit N hierarchies , <0 : all hierarchies */

	public static int inheritanceLevelForArtifacts=0;
	public static int inheritanceLevelForStakeHolder=-1;
	public static boolean bShowInheritanceInProcess=false;
	public static String sFontName="Arial fontsize=14";
	/** is this is set to true artifacts will be only listed if not all siblings use/create the same artifact and the parent already does 
	 * i.e .if all children have the same input as the parent they will not be listed in diagram */
	public static boolean simplyfyArtifactFlow=true;

	public static List<String> getDOTContent(EObject eo,Named nScope)  {
		if (eo instanceof ProcessModule) {
			return getDOTContent((ProcessModule)eo,nScope);
		}
		if (eo instanceof Artifact) {
			return getDOTContent((Artifact)eo,nScope);
		}
		if (eo instanceof StakeHolder) {
			return getDOTContent((StakeHolder)eo,nScope);
		}
		if (eo instanceof Compliance) {
			return getDOTContent((Compliance)eo,nScope);
		}
		if (eo instanceof Requirement) {
			return getDOTContent((Requirement)eo,nScope);
		}
		return new LinkedList<String>();
	}

	/**
	 * checks the DOT image for
	 *  - invisible lines canceling real lines (see PMT-2)
	 *  - bidirectional lines (see PMT-4)
	 * @param lOrig
	 * @return
	 */
	private static List<String> checkDOT(List<String> lOrig) {
		List<String> lRes = new LinkedList<String>();
		Map<String,Map<String,String>> graph=new HashMap<String, Map<String,String>>();
		for (String sEdge:lOrig) {
			if (isEdge(sEdge)) {
				String sFrom=getFrom(sEdge);
				String sTo=getTo(sEdge);
				//				System.out.println("Edge '"+sEdge+"' from '"+sFrom+"' to '"+sTo+"'");
				Map<String,String> sDest;
				if (graph.containsKey(sFrom)) {
					sDest=graph.get(sFrom);
				} else {
					sDest=new HashMap<String, String>();
					graph.put(sFrom, sDest);
				}
				if (isInvisible(sEdge)) {
					if (sDest.containsKey(sTo)) {
						// do not cancel existing line
					} else {
						// add invisible lines (invisible lines are always after visible lines)
						lRes.add(sEdge);
					}
				} else {
					// check for back direction
					if (graph.containsKey(sTo) && graph.get(sTo).containsKey(sFrom)) {
						String sOldEdge= graph.get(sTo).get(sFrom);
						// System.out.println("found old edge "+sOldEdge);
						if (hasStyle(sEdge) && hasStyle(sOldEdge) && getStyle(sEdge).equals(getStyle(sOldEdge))) {
							String sEdgeNew=sEdge.substring(0,sEdge.indexOf("]"))+" dir=both]";
							lRes.remove(sOldEdge);
							lRes.add(sEdgeNew);
							sDest.put(sTo,sEdgeNew);
						} else if (!hasStyle(sEdge) && !hasStyle(sOldEdge)) {
							String sEdgeNew=sEdge+" [dir=both]";
							lRes.remove(sOldEdge);
							lRes.add(sEdgeNew);
							sDest.put(sTo,sEdgeNew);
						} else {
							System.out.println("ignoring non-matching lines "+sOldEdge+" <> "+sEdge);
							lRes.add(sEdge);
							sDest.put(sTo,sEdge);
						}
					} else {
						lRes.add(sEdge);
						sDest.put(sTo,sEdge);
					}
				}
			} else {
				lRes.add(sEdge);
			}
		}
		return lRes;
	}
	private static boolean isEdge(String s) {
		return s.indexOf("->")>0;
	}
	private static boolean hasStyle(String s) {
		return s.indexOf("[")>0 && s.indexOf("]")>s.indexOf("[");
	}
	private static String removeStyle(String s) {
		if (hasStyle(s)) {
			return s.substring(0, s.indexOf("[")).trim();
		}
		return s;
	}
	private static String getStyle(String s) {
		return s.substring(s.indexOf("["), s.indexOf("]")).trim();
	}
	private static boolean isInvisible(String s) {
		return s.indexOf("style=invis")>0;
	}
	private static String getFrom(String s) {
		return s.substring(0, s.indexOf("->")).trim();
	}
	private static String getTo(String s) {
		return removeStyle(s.substring(s.indexOf("->")+2).trim());
	}

	@SuppressWarnings("unchecked")
	public static List<String> getDOTContent(ProcessModule pmMain,Named nScope)  {
		List<String> lRes=new LinkedList<String>();
		lRes.add("strict digraph {");
		switch (pmMain.getLayout()) {
		case BOTTOM_TOP:
			lRes.add("rankdir=BT"); 
			break;
		case LEFT_RIGTH:
			lRes.add("rankdir=LR"); 
			break;
		case RIGHT_LEFT:
			lRes.add("rankdir=RL"); 
			break;
		case TOP_BOTTOM:
			lRes.add("rankdir=TB"); 
			break;
		default:
			break;
		}
		// lRes.add("fontname=Verdana");
		String sIdent="   ";
		List<ProcessModule> processes = (List<ProcessModule>) sortByLayoutPriority(VariantModel.ProcessModule_getChildProcessModules(pmMain, nScope));
		processes.remove(pmMain);
		if (processes.size()==0) {
			lRes.addAll(createAtomicProcessView(pmMain,sIdent,nScope));
			lRes.add("}");
			return checkDOT(lRes);
		}
		Set<Variantable> sAllObjectsInDiagram=new HashSet<Variantable>();
		sAllObjectsInDiagram.addAll(processes);
		lRes.add(sIdent+"subgraph cluster_Frame {");
		sIdent+="   ";
		String colorForPM = getColorForProcessModule(pmMain,pmMain);
		String fillcolorForPM = getFillColorForProcessModule(pmMain,pmMain);
		lRes.add(sIdent+"label=\""+pmMain.getName()+"\" fontname="+sFontName+" fontsize=25 shape=box style=\"rounded,filled\" color="+colorForPM+" penwidth=4 fillcolor="+fillcolorForPM);
		Set<ProcessModule> sRequireStart=new HashSet<ProcessModule>();
		Set<ProcessModule> sRequireEnd=new HashSet<ProcessModule>();
		Map<Variantable,Set<String>> lGlobalArtifacts=new HashMap<Variantable, Set<String>>();
		Map<Variantable,Set<String>> lGlobalPMs=new HashMap<Variantable, Set<String>>();
		Map<Variantable,Set<String>> lLocalArtifacts=new HashMap<Variantable, Set<String>>();
		List<String> lLinks=new LinkedList<String>();
		// first compute the sub-clusters
		Map<StakeHolder,Map<Variantable,Set<String>>> mProcessClusters = new HashMap<StakeHolder, Map<Variantable,Set<String>>>();
		Map<StakeHolder,Map<Variantable,Set<String>>> mOtherClusters = new HashMap<StakeHolder, Map<Variantable,Set<String>>>();
		Set<StakeHolder> stakeHoldersForProcesses = VariantModel.filterActiveStakeHolders(HierarchyModel.getStakeHoldersForProcesses(pmMain,inheritanceLevelForStakeHolder),nScope);
		for (StakeHolder sh:(List<StakeHolder>)sortByLayoutPriority(stakeHoldersForProcesses)) {
			Map<Variantable,Set<String>> lResSH = addNewStakeHolderBox(mProcessClusters,sh,sIdent);
			sAllObjectsInDiagram.add(sh);
			for (ProcessModule pm:processes) {
				if (HierarchyModel.getStakeHolderSuper(pm,inheritanceLevelForStakeHolder)==sh) {
					// default for (atomic) PMs
					addToMap(lResSH,pm,getShapeForProcessModule(sIdent, pm,nScope));
					for (BoolTerm bt:pm.getVariants()) {
						// check condition
						if (TermUtils.hasProcessVariable(bt)) {
							ProcessModule pmFound=null;
							if (bt instanceof NOTTerm) {
								// search for original term
								Term tOrig=((NOTTerm)bt).getTerms().get(0);
								for (ProcessModule pmHelp:processes) {
									for (BoolTerm btHelp:pmHelp.getVariants()) {
										if (TermUtils.printTerm(btHelp).equals(TermUtils.printTerm(tOrig))) {
											pmFound=pmHelp;
										}
									}
								}
							}
							if (pmFound==null) {
								addToMap(lResSH,pm,getShapeForVariant(sIdent, pm,bt,nScope));
								lLinks.add(sIdent+getVariantID(pm,bt)+" -> "+getID(pm)+" [label=YES fontname="+sFontName+"]");
								for (ProcessVariable pv:TermUtils.getProcessVariables(bt)) {
									for (ProcessModule pmDet:pv.getDeterminedByProcessModules()) {
										if (processes.contains(pmDet)) {
											lLinks.add(sIdent+getID(pmDet)+" -> "+getVariantID(pm,bt));
										}
									}
								}
							} else {
								BoolTerm tOrig=bt;
								if (bt instanceof NOTTerm) {
									tOrig = (BoolTerm) ((NOTTerm)bt).getTerms().get(0);
								}
								lLinks.add(sIdent+getVariantID(pmFound,tOrig)+" -> "+getID(pm)+" [label=NO fontname="+sFontName+"]");
							}
						}
					}
					Set<Artifact> allSuperInputs = VariantModel.filterActiveArtifacts(HierarchyModel.getAllSuperInputs(pm,inheritanceLevelForArtifacts),nScope);
					sAllObjectsInDiagram.addAll(allSuperInputs);
					List<Artifact> sIns = (List<Artifact>) sortByLayoutPriority(allSuperInputs);
					if (sIns.size()>0) {
						for (Artifact a:sIns) {
							// System.out.println("processing input artifact "+a.getName()+" of PM "+pm.getName());
							StakeHolder shArt=HierarchyModel.getStakeHolderSuper(a,inheritanceLevelForStakeHolder);
							String sArt=getShapeForArtifact(sIdent, a);
							String sLink = sIdent+"   "+getID(a)+" -> "+getID(pm)+" [style=dashed]";
							if (shArt==sh) {
								addToMap(lResSH, a, sArt);
								lLinks.add(sLink);
							} else  {
								if (shArt==null) {
									addToMap(lGlobalArtifacts, a, sArt);
									lLinks.add(sLink);
								} else {
									Map<Variantable,Set<String>> lPM = addNewStakeHolderBox(mProcessClusters, shArt, sIdent);
									addToMap(lPM,a,sArt);
									lLinks.add(sLink);
								}
							}						
						}
					} 
					List<ProcessModule> afterProcessModules = (List<ProcessModule>) sortByLayoutPriority(VariantModel.filterActiveProcessModules(pm.getAfterProcessModules(),nScope));
					sAllObjectsInDiagram.addAll(afterProcessModules);
					if (afterProcessModules.size()>0) {
						for (ProcessModule pmAfter:afterProcessModules) {
							if (processes.contains(pmAfter)) {
								lLinks.add(sIdent+"   "+getID(pmAfter)+" -> "+getID(pm));
							} else {
								// add external process
								StakeHolder shAfter = HierarchyModel.getStakeHolderSuper(pmAfter,inheritanceLevelForStakeHolder);
								if (shAfter!=null) {
									Map<Variantable,Set<String>> lPM = addNewStakeHolderBox(mOtherClusters, shAfter, sIdent);
									addToMap(lPM, pmAfter,getShapeForProcessModule(sIdent, pmAfter,nScope));
								} else {
									addToMap(lGlobalPMs,pmAfter,getShapeForProcessModule(sIdent, pmAfter,nScope));
								}
								lLinks.add(sIdent+"   "+getID(pmAfter)+" -> "+getID(pm));
							}
						}
					} 
					if (sIns.size()==0 && afterProcessModules.size()==0 && pm.getVariants().size()==0) {
						sRequireStart.add(pm);
					}
					Set<Artifact> allSuperOutputs =  VariantModel.filterActiveArtifacts(HierarchyModel.getAllSuperOutputs(pm,inheritanceLevelForArtifacts),nScope);
					sAllObjectsInDiagram.addAll(allSuperOutputs);
					List<Artifact> sOuts = (List<Artifact>) sortByLayoutPriority(allSuperOutputs);
					if (sOuts.size()>0) {
						for (Artifact a:sOuts) {
							StakeHolder shArt=HierarchyModel.getStakeHolderSuper(a,inheritanceLevelForStakeHolder);
							String sArt=getShapeForArtifact(sIdent, a);
							String sLink = sIdent+"   "+getID(pm)+" -> "+getID(a)+" [style=dashed]";
							if (shArt==sh) {
								addToMap(lResSH, a, sArt);
								lLinks.add(sLink);
							} else  {
								// fiter here as well?
								if (HierarchyModel.getAllSuperInputs(pmMain).contains(a) || HierarchyModel.getAllSuperOutputs(pmMain).contains(a)|| shArt==null) {
									addToMap(lGlobalArtifacts, a, sArt);
									lLinks.add(sLink);
								} else {
									Map<Variantable, Set<String>> lPM = addNewStakeHolderBox(mProcessClusters, shArt, sIdent);
									addToMap(lPM,a,sArt);
									lLinks.add(sLink);
								}
							}	
						}
					} 
					List<ProcessModule> beforeProcessModules = (List<ProcessModule>) sortByLayoutPriority(VariantModel.filterActiveProcessModules(pm.getBeforeProcessModules(),nScope));
					sAllObjectsInDiagram.addAll(beforeProcessModules);
					if (beforeProcessModules.size()>0) {
						for (ProcessModule pmBefore:beforeProcessModules) {
							if (processes.contains(pmBefore)) {
								lLinks.add(sIdent+"   "+getID(pm)+" -> "+getID(pmBefore));
							} else {
								// add external process
								StakeHolder shBefore = HierarchyModel.getStakeHolderSuper(pmBefore,inheritanceLevelForStakeHolder);
								if (shBefore!=null) {
									Map<Variantable, Set<String>> lPM = addNewStakeHolderBox(mOtherClusters, shBefore, sIdent);
									addToMap(lPM, pmBefore, getShapeForProcessModule(sIdent, pmBefore,nScope));
								} else {
									addToMap(lGlobalPMs, pmBefore,getShapeForProcessModule(sIdent, pmBefore,nScope));
								}
								lLinks.add(sIdent+"   "+getID(pm)+" -> "+getID(pmBefore));
							}
						}
					} 
					if (sOuts.size()==0 && beforeProcessModules.size()==0 && pm.getDeterminedVariables().size()==0){
						sRequireEnd.add(pm);
					}
				}
			}
		}
		// then add them
		if (sRequireStart.size()>1) {
			lRes.add(getShapeForStart(sIdent));
			for (ProcessModule p:sRequireStart) {
				lLinks.add(sIdent+"Start -> "+getID(p));
			}
		}
		if (sRequireEnd.size()>1) {
			lRes.add(getShapeForEnd(sIdent));
			for (ProcessModule p:sRequireEnd) {
				lLinks.add(sIdent+getID(p)+"-> End");
			}
		}
		int iRoles=0;
		// check also for other processes
		stakeHoldersForProcesses.addAll(mProcessClusters.keySet());
		// first add the PM
		for (StakeHolder sh:(List<StakeHolder>)sortByLayoutPriority(stakeHoldersForProcesses)) {
			iRoles++;
			lRes.add(sIdent+"subgraph cluster"+iRoles+" {");
			lRes.addAll(getSortedListFromMap(mProcessClusters.get(sh)));
			if (sRequireStart.size()==1 && HierarchyModel.getStakeHolderSuper(sRequireStart.iterator().next(),inheritanceLevelForStakeHolder)==sh) {
				lRes.add(getShapeForStart(sIdent));
				lLinks.add(sIdent+"Start -> "+getID(sRequireStart.iterator().next()));
			}
			if (sRequireEnd.size()==1 && HierarchyModel.getStakeHolderSuper(sRequireEnd.iterator().next(),inheritanceLevelForStakeHolder)==sh) {
				lRes.add(getShapeForEnd(sIdent));
				lLinks.add(sIdent+getID(sRequireEnd.iterator().next())+" -> End");
			}
			lRes.add(sIdent+"}");
		}
		lRes.addAll(getSortedListFromMap(lLocalArtifacts));
		lRes.add("   }"); // close globalframe
		// then add global stuff
		for (StakeHolder sh:mOtherClusters.keySet()) {
			iRoles++;
			lRes.add(sIdent+"subgraph cluster"+iRoles+" {");
			lRes.addAll(getSortedListFromMap(mOtherClusters.get(sh)));
			lRes.add(sIdent+"}");
		}
		lRes.addAll(getSortedListFromMap(lGlobalArtifacts));
		lRes.addAll(getSortedListFromMap(lGlobalPMs));
		lRes.addAll(lLinks);
		addPriortiesandInheritances(lRes, sIdent, sAllObjectsInDiagram,nScope,false);
		lRes.add("}");
		return checkDOT(lRes);
	};

	/* since GSN images can get huge (depending on the number of nested requirements & compliances it is required to limit the levels displayed in the graphics */
	// number of nestings (-1 for inifinte)
	private static int GSN_MAX_LEVEL=3;
	public static List<String> getDOTContent(Requirement req,Named nScope)  {
		List<String> lRes=new LinkedList<String>();
		String sIdent="   ";
		lRes.add("strict digraph {");
		lRes.addAll(getDOTRequirements(req,nScope,sIdent,true,GSN_MAX_LEVEL));
		lRes.add("}");
		return lRes;
	}
	public static List<String> getDOTContent(Compliance comp,Named nScope)  {
		List<String> lRes=new LinkedList<String>();
		String sIdent="   ";
		lRes.add("strict digraph {");
		lRes.addAll(getDOTCompliances(comp, nScope, sIdent,true,GSN_MAX_LEVEL-1));
		lRes.add("}");
		return lRes;
	}

	public static List<String> getDOTRequirements(Requirement req,Named nScope,String sIdent,boolean big,int iRemain) {
		List<String> lRes=new LinkedList<String>();
		lRes.add(sIdent+getShapeForRequirement(req,big));
		if (iRemain==0) {
			return lRes;
		}
		for (Compliance c:VariantModel.Requirement_getCompliances(req, nScope)) {
			String dependency = sIdent+getID(req)+" -> "+getID(c);
			// System.out.println("adding Requirement Dependency:"+dependency);
			lRes.add(dependency);
			lRes.addAll(getDOTCompliances(c,nScope,sIdent+"  ",false,iRemain-1));
		}
		return lRes;
	}
	public static List<String> getDOTCompliances(Compliance comp,Named nScope,String sIdent,boolean big,int iRemain) {
		List<String> lRes=new LinkedList<String>();
		if (iRemain==0) {
			if (VariantModel.Compliance_getSubCompliances(comp, nScope).size()==0) {
				lRes.add(sIdent+getShapeForCompliance(comp, false));
			} else {
				// cut image here by adding a module for references
				lRes.add(sIdent+getFinalShapeForCompliance(comp));
			}
			return lRes;
		} 
		lRes.add(sIdent+getShapeForCompliance(comp, false));
		for (Compliance c:VariantModel.Compliance_getSubCompliances(comp, nScope)) {
			if (c.eContainer() instanceof Requirement) {
				String dependency = sIdent+getID(comp)+" -> "+getID((Requirement)c.eContainer());
				// System.out.println("Adding Compliance Requirement Dependency "+dependency);
				lRes.add(dependency);
				lRes.addAll(getDOTRequirements((Requirement)c.eContainer(),nScope,sIdent+"  ",false,iRemain-1));
			} else {
				String dependency = sIdent+getID(comp)+" -> "+getID(c);
				// System.out.println("Adding Compliance Dependency "+dependency);
				lRes.add(dependency);
				lRes.addAll(getDOTCompliances(c,nScope,sIdent+"  ",false,iRemain-1));
			}
		}
		for (VerificationModule vm:VariantModel.Compliance_getVerificationModules(comp, nScope)) {
			lRes.add(getShapeForProcessModule(sIdent, vm, nScope));
			lRes.add(sIdent+getID(comp)+" -> "+getID(vm));
			for (Criterion c:VariantModel.VerificationModule_getAllCritera(vm, nScope)) {
				lRes.add(sIdent+getShapeForCriterion(c));
				String sLabel="";
				if (c.getID()!=null && !c.getID().trim().equals("")) {
					sLabel=" [label=\""+c.getID()+"\"]";
				}
				lRes.add(sIdent+getID(vm)+" -> "+getID(c)+sLabel);
			}
		}
		return lRes;
	}
	private static String getShapeForCriterion(Criterion c) {
		String name = c.getDescription();
		if (name==null || name.equals("")) {
			name=c.getName();
			name=(name==null)?"":name;
		}
		int iFontSize=getFontSize(name);
		int iBoxSize=getBoxWidth(name);
		String sRes = getID(c)+" [ label=\""+getFormatText(name,iBoxSize)+ "\" shape=circle, margin=0, fontsize="+iFontSize+" color=black]";
		return sRes;
	}

	private static String getShapeForRequirement(Named r,boolean bBig) {	
		String sBig="";
		if (bBig) {
			sBig=" penwidth=2";
		}
		String description = r.getDescription();
		if (description==null || description.trim().equals("")) {
			description=r.getName();
		}
		if (r.getID()!=null && !r.getID().trim().equals("")) {
			description=r.getID()+": "+description;
		}
		int iFontSize=getFontSize(description);
		int iBoxSize=getBoxWidth(description);
		if (bBig) {
			iBoxSize*=1.5;
			iFontSize*=1.8;
		}
		String sRes = getID(r)+" [ label=\""+getFormatText(description,iBoxSize)+ "\" shape=box, fontsize="+iFontSize+" color=black"+sBig+"]";
		return sRes;
	}

	private static int getFontSize(String s) {
		int iFontSize=14;
		if (s==null) {
			return iFontSize;
		}
		if (s.length()>500) {
			iFontSize=7;
		} else if (s.length()>250) {
			iFontSize=8;
		} else if (s.length()>200) {
			iFontSize=9;
		} else if (s.length()>100) {
			iFontSize=10;
		} else if (s.length()>50) {
			iFontSize=12;
		} 
		return iFontSize;
	}
	private static int getBoxWidth(String s) {
		int iBoxSize=20;
		if (s==null) {
			return iBoxSize;
		}
		if (s.length()>500) {
			iBoxSize=45;
		} else if (s.length()>250) {
			iBoxSize=40;
		} else if (s.length()>200) {
			iBoxSize=35;
		} else if (s.length()>100) {
			iBoxSize=30;
		} else if (s.length()>50) {
			iBoxSize=25;
		} 
		return iBoxSize;
	}

	private static String getShapeForCompliance(Compliance c,boolean bBig) {	
		String sBig="";
		if (bBig) {
			sBig=" penwidth=2";
		}
		int iFontSize=getFontSize(c.getDescription());
		int iBoxSize=getBoxWidth(c.getDescription());
		if (bBig) {
			iBoxSize*=1.5;
			iFontSize*=1.8;
		}
		String sRes = getID(c)+" [ label=\""+getFormatText(c.getDescription(),iBoxSize)+ "\" shape=parallelogram, margin=0, fontsize="+iFontSize+" color=black"+sBig+"]";
		return sRes;
	}

	private static String getFinalShapeForCompliance(Compliance c) {	
		int iFontSize=getFontSize(c.getDescription());
		int iBoxSize=getBoxWidth(c.getDescription());
		String sRes = getID(c)+" [ label=\""+getFormatText(c.getDescription(),iBoxSize)+ "\" shape=tab, margin=0, fontsize="+iFontSize+" color=black]";
		return sRes;
	}

	private static String getFormatText(String s,int max) {
		if (s==null) {
			s="";
		}
		String sRes="";
		StringTokenizer st = new StringTokenizer(s, " \n\t",true);
		String sLine="";
		while (st.hasMoreTokens()) {
			if (!sRes.equals("")) {
				sRes+="\n";
			}
			String sNext=st.nextToken();	
			while (sLine.length()+sNext.length()<max && st.hasMoreTokens()) {
				sLine+=sNext;
				sNext=st.nextToken();
			}
			if (sLine.length()==0) {
				// token too long for line, just add it
				sRes+=sNext;
			} if (!st.hasMoreTokens()) {
				sRes+=sLine;
				if (sLine.length()+sNext.length()>max) {
					sRes+="\n";
				} 
				sRes+=sNext;
			} else {
				sRes+=sLine;
				sLine=sNext;
			}
		}
		sRes = sRes.replaceAll("\"","\\\\\"");
		return sRes;
	}
	private static void addToMap(Map<Variantable, Set<String>> m, Variantable v, String shape) {
		Set<String> sForV;
		if (m.containsKey(v)) {
			sForV=m.get(v);
		} else {
			sForV=new HashSet<String>();
			m.put(v, sForV);
		}
		sForV.add(shape);
	}

	/** gets the index of this term from the list of terms */
	private static int getIndexOfVariantTerm(Variantable v,BoolTerm bt) {
		int iIndex=0;
		for (BoolTerm t:v.getVariants()) {
			iIndex++;
			if (TermUtils.printTerm(t).equals(TermUtils.printTerm(bt))) {
				return iIndex;
			}
		}
		System.err.println("not found "+TermUtils.printTerm(bt)+" in variants of "+v.getName());
		return 0-iIndex;
	}
	private static String getShapeForVariant(String sIdent, Variantable v,BoolTerm bt,Named nScope) {
		String sColor="";
		if (v instanceof ProcessModule) {
			sColor=getColorForProcessModule((ProcessModule)v,nScope);
		} else if (v instanceof Artifact) {
			sColor=getFillColorForArtifact((Artifact)v);
		} else {
			sColor="black";
		}
		return sIdent+getVariantID(v,bt)+" [label=\""+removeBracket(TermUtils.printTerm(bt))+"\" fontname="+sFontName+" shape=hexagon style=rounded color="+
		sColor+" style=filled fillcolor="+getVariantColor(bt,v,nScope)+"]";
	}
	@SuppressWarnings("unchecked")
	public static List<String> getDOTContent(Artifact aMain,Named nScope)  {
		List<String> lRes=new LinkedList<String>();
		lRes.add("strict digraph {");
		switch (aMain.getLayout()) {
		case BOTTOM_TOP:
			lRes.add("rankdir=BT"); 
			break;
		case LEFT_RIGTH:
			lRes.add("rankdir=LR"); 
			break;
		case RIGHT_LEFT:
			lRes.add("rankdir=RL"); 
			break;
		case TOP_BOTTOM:
			lRes.add("rankdir=TB"); 
			break;
		default:
			break;
		}
		String sIdent="   ";
		Set<Variantable> sAllObjectsInDiagram = new HashSet<Variantable>();
		StakeHolder shMain=HierarchyModel.getStakeHolderSuper(aMain, inheritanceLevelForStakeHolder);
		sAllObjectsInDiagram.add(aMain);
		Map<StakeHolder, Map<Variantable, Set<String>>> mProcessClusters = new HashMap<StakeHolder, Map<Variantable,Set<String>>>();
		List<String> lHierarchyLinks = new LinkedList<String>();
		Map<Variantable, Set<String>> lResSH = addNewStakeHolderBox(mProcessClusters,shMain,sIdent);
		addToMap(lResSH, aMain, getShapeForArtifact(sIdent, aMain,true));
		for (BoolTerm bt:aMain.getVariants()) {
			addToMap(lResSH, aMain, getShapeForVariant(sIdent, aMain,bt,nScope));
			lHierarchyLinks.add(sIdent+getVariantID(aMain,bt)+" -> "+getID(aMain)+ "[label=YES fontname="+sFontName+"]");
		}
		Artifact aHelp=aMain;
		while (aHelp.eContainer() instanceof Artifact) {
			Artifact aLast=aHelp;
			aHelp = (Artifact)aHelp.eContainer();
			StakeHolder shA=HierarchyModel.getStakeHolderSuper(aHelp, inheritanceLevelForStakeHolder);
			Map<Variantable, Set<String>> lResHier=addNewStakeHolderBox(mProcessClusters, shA, sIdent);
			addToMap(lResHier, aHelp, getShapeForArtifact(sIdent, aHelp));
			sAllObjectsInDiagram.add(aHelp);
			lHierarchyLinks.add(sIdent+getID(aLast)+" -> "+getID(aHelp)+" [style=dotted arrowhead=empty]");
		}
		if (aMain instanceof Model) {
			Model model=(Model)aMain;
			for (Model m:model.getIncludes()) {
				StakeHolder shM=HierarchyModel.getStakeHolderSuper(m, inheritanceLevelForStakeHolder);
				Map<Variantable, Set<String>> lResInc=addNewStakeHolderBox(mProcessClusters, shM, sIdent);
				addToMap(lResInc, m, getShapeForArtifact(sIdent, m));
				sAllObjectsInDiagram.add(m);
				lHierarchyLinks.add(sIdent+getID(model)+" -> "+getID(m)+" [label =\"<<includes>>\" fontname="+sFontName+" style=dashed shape=normal arrowhead=open]");
			}
			for (Model m:model.getIsIncludedIn()) {
				StakeHolder shM=HierarchyModel.getStakeHolderSuper(m, inheritanceLevelForStakeHolder);
				Map<Variantable, Set<String>> lResInc=addNewStakeHolderBox(mProcessClusters, shM, sIdent);
				addToMap(lResInc, m, getShapeForArtifact(sIdent, m));
				sAllObjectsInDiagram.add(m);
				lHierarchyLinks.add(sIdent+getID(m)+" -> "+getID(model)+" [label =\"<<includes>>\" fontname="+sFontName+" style=dashed shape=normal arrowhead=open]");
			}
		}
		Set<Artifact> aSubs=new HashSet<Artifact>();
		aSubs.addAll(DeactivationModel.Artifact_getSubArtifacts(aMain,nScope));
		List<Artifact> lSubs = (List<Artifact>)sortByLayoutPriority(DeactivationModel.Artifact_getSubArtifacts(aMain,nScope));
		sAllObjectsInDiagram.addAll(lSubs);
		for (Artifact aS:lSubs) {
			StakeHolder shA=HierarchyModel.getStakeHolderSuper(aS, inheritanceLevelForStakeHolder);
			Map<Variantable, Set<String>> lResHier=addNewStakeHolderBox(mProcessClusters, shA, sIdent);
			addToMap(lResHier, aS, getShapeForArtifact(sIdent, aS));
			lHierarchyLinks.add(sIdent+getID(aS)+" -> "+getID(aMain)+" [style=dotted arrowhead=empty]");
		}
		List<ProcessModule> artifact_getCreatedByProcessModules = DeactivationModel.Artifact_getCreatedByProcessModules(aMain,nScope);
		sAllObjectsInDiagram.addAll(artifact_getCreatedByProcessModules);
		if (simplyfyArtifactFlow) {
			Set<ProcessModule> sPMToRemove=new HashSet<ProcessModule>();
			for (ProcessModule pm:artifact_getCreatedByProcessModules) {
				boolean bFoundInAllChildren=pm.getSubProcessModules().size()+pm.getSubProcessModuleReferences().size()>0;
				for (ProcessModule pmChild:pm.getSubProcessModules()) {
					if (!artifact_getCreatedByProcessModules.contains(pmChild)) {
						bFoundInAllChildren=false;
					}
				}
				for (ProcessModule pmChild:pm.getSubProcessModuleReferences()) {
					if (!artifact_getCreatedByProcessModules.contains(pmChild)) {
						bFoundInAllChildren=false;
					}
				}
				if (bFoundInAllChildren) {
					sPMToRemove.addAll(pm.getSubProcessModules());
					sPMToRemove.addAll(pm.getSubProcessModuleReferences());
				}
			}
			artifact_getCreatedByProcessModules.removeAll(sPMToRemove);
			sAllObjectsInDiagram.retainAll(sPMToRemove);
		}
		List<ProcessModule> lIn=(List<ProcessModule>) sortByLayoutPriority(artifact_getCreatedByProcessModules);
		for (ProcessModule pmIn:lIn) {
			StakeHolder shPM=HierarchyModel.getStakeHolderSuper(pmIn, inheritanceLevelForStakeHolder);
			Map<Variantable, Set<String>> lResPM=addNewStakeHolderBox(mProcessClusters, shPM, sIdent);
			addToMap(lResPM, pmIn, getShapeForProcessModule(sIdent, pmIn,nScope));
			lHierarchyLinks.add(sIdent+getID(pmIn)+" -> "+getID(aMain)+" [style=dashed arrowhead=empty]");
		}
		List<ProcessModule> artifact_getReadByProcessModules = DeactivationModel.Artifact_getReadByProcessModules(aMain,nScope);
		sAllObjectsInDiagram.addAll(artifact_getReadByProcessModules);
		if (simplyfyArtifactFlow) {
			Set<ProcessModule> sPMToRemove=new HashSet<ProcessModule>();
			for (ProcessModule pm:artifact_getReadByProcessModules) {
				boolean bFoundInAllChildren=pm.getSubProcessModules().size()+pm.getSubProcessModuleReferences().size()>0;
				for (ProcessModule pmChild:pm.getSubProcessModules()) {
					if (!artifact_getReadByProcessModules.contains(pmChild)) {
						bFoundInAllChildren=false;
					}
				}
				for (ProcessModule pmChild:pm.getSubProcessModuleReferences()) {
					if (!artifact_getReadByProcessModules.contains(pmChild)) {
						bFoundInAllChildren=false;
					}
				}
				if (bFoundInAllChildren) {
					sPMToRemove.addAll(pm.getSubProcessModules());
					sPMToRemove.addAll(pm.getSubProcessModuleReferences());
				}
			}
			artifact_getReadByProcessModules.removeAll(sPMToRemove);
			sAllObjectsInDiagram.removeAll(sPMToRemove);
		}
		List<ProcessModule> lOut=(List<ProcessModule>) sortByLayoutPriority(artifact_getReadByProcessModules);
		for (ProcessModule pmOut:lOut) {
			StakeHolder shPM=HierarchyModel.getStakeHolderSuper(pmOut, inheritanceLevelForStakeHolder);
			Map<Variantable, Set<String>> lResPM=addNewStakeHolderBox(mProcessClusters, shPM, sIdent);
			addToMap(lResPM, pmOut, getShapeForProcessModule(sIdent, pmOut,nScope));
			lHierarchyLinks.add(sIdent+getID(aMain)+" -> "+getID(pmOut)+" [style=dashed arrowhead=empty]");
		}
		int iRoles=0;
		for (Variantable sh:sortByLayoutPriority(mProcessClusters.keySet())) {
			iRoles++;
			lRes.add(sIdent+"subgraph cluster"+iRoles+" {");
			lRes.addAll(getSortedListFromMap(mProcessClusters.get(sh)));
			lRes.add(sIdent+"}");
		}
		lRes.addAll(lHierarchyLinks);
		addPriortiesandInheritances(lRes, sIdent, sAllObjectsInDiagram,nScope,true);
		lRes.add("}");
		return checkDOT(lRes);
	}

	@SuppressWarnings("unchecked")
	public static List<String> getDOTContent(StakeHolder shMain,Named nScope)  {
		List<String> lRes=new LinkedList<String>();
		lRes.add("strict digraph {");
		switch (shMain.getLayout()) {
		case BOTTOM_TOP:
			lRes.add("rankdir=BT"); 
			break;
		case LEFT_RIGTH:
			lRes.add("rankdir=LR"); 
			break;
		case RIGHT_LEFT:
			lRes.add("rankdir=RL"); 
			break;
		case TOP_BOTTOM:
			lRes.add("rankdir=TB"); 
			break;
		default:
			break;
		}
		String sIdent="   ";
		Set<Variantable> sAllObjectsInDiagram = new HashSet<Variantable>();
		lRes.add(sIdent+"subgraph cluster0 {");
		Map<StakeHolder, Map<Variantable, Set<String>>> map = new HashMap<StakeHolder, Map<Variantable,Set<String>>>();
		Map<Variantable, Set<String>> box = addNewStakeHolderBox(map, shMain, sIdent,true);
		lRes.addAll(getSortedListFromMap(box));
		List<Artifact> ownedArtifacts = shMain.getOwnedArtifacts();
		ownedArtifacts = (List<Artifact>) sortByLayoutPriority(ownedArtifacts);
		sAllObjectsInDiagram.addAll(ownedArtifacts);
		for (Artifact a:ownedArtifacts) {
			lRes.add(getShapeForArtifact(sIdent+"   ", a));
		}
		List<ProcessModule> ownedModules = shMain.getOwnedModules();
		sAllObjectsInDiagram.addAll(ownedModules);
		ownedModules = (List<ProcessModule>) sortByLayoutPriority(ownedModules);
		for (ProcessModule pm:ownedModules) {
			lRes.add(getShapeForProcessModule(sIdent+"   ", pm,nScope));
		}
		// now add the links for IO and after/before as far as present
		for (ProcessModule pm:ownedModules) {
			for (ProcessModule pmAfter:VariantModel.filterActiveProcessModules(pm.getAfterProcessModules(),nScope)) {
				if (ownedModules.contains(pmAfter)) {
					lRes.add(sIdent+getID(pmAfter)+" -> "+getID(pm));					
				}
			}
			for (ProcessModule pmBefore:VariantModel.filterActiveProcessModules(pm.getBeforeProcessModules(),nScope)) {
				if (ownedModules.contains(pmBefore)) {
					lRes.add(sIdent+getID(pm)+" -> "+getID(pmBefore));					
				}
			}
			Set<Artifact> allSuperInputs =  VariantModel.filterActiveArtifacts(HierarchyModel.getAllSuperInputs(pm,inheritanceLevelForArtifacts),nScope);
			for (Artifact a:allSuperInputs) {
				if (ownedArtifacts.contains(a)) {
					lRes.add(sIdent+getID(a)+" -> "+getID(pm)+" [style=dashed]" );					
				}
			}
			Set<Artifact> allSuperOutputs =  VariantModel.filterActiveArtifacts(HierarchyModel.getAllSuperOutputs(pm,inheritanceLevelForArtifacts),nScope);
			for (Artifact a:allSuperOutputs) {
				if (ownedArtifacts.contains(a)) {
					lRes.add(sIdent+getID(pm)+" -> "+getID(a)+" [style=dashed]" );					
				}
			}
		}
		if (sAllObjectsInDiagram.size()==0) {
			lRes.add(sIdent+"\"\"");
		}
		lRes.add("    }");
		addPriortiesandInheritances(lRes, sIdent, sAllObjectsInDiagram,nScope,false);
		lRes.add("}");
		return checkDOT(lRes);
	}

	private static void addPriortiesandInheritances(List<String> lRes, String sIdent, Set<Variantable> sAllObjectsInDiagram,Named nScope,boolean bInArtifacts) {
		// now add the inivisble links and the "is-a" associations arrowhead="empty"
		for (Variantable v:sAllObjectsInDiagram) {
			if (bInArtifacts || bShowInheritanceInProcess) {
				if (v instanceof Artifact) {
					Artifact a=(Artifact)v;
					for (Artifact aSuper:VariantModel.filterActiveArtifacts(HierarchyModel.getSuperArtifacts(a),nScope)) {
						if (sAllObjectsInDiagram.contains(aSuper)) {
							lRes.add(sIdent+getID(a)+" -> "+getID(aSuper)+" [style=dotted arrowhead=empty]");
						}
					}
				}
			}
			if (v!=null) {
				for (Variantable vBefore:v.getLayoutBefore()) {
					// stake-holders are just ordered, but not explicitly refer-able
					if (!(vBefore instanceof StakeHolder) && !(v instanceof StakeHolder) && sAllObjectsInDiagram.contains(vBefore)) {
						lRes.add(sIdent+getID(v)+" -> "+getID(vBefore)+" [style=invis]");
					}
				}
			}
		}
	}

	private static String getShapeForEnd(String sIdent) {
		return sIdent+"End [shape=circle style=filled fontname="+sFontName+" color=orangered margin=0]";
	}

	private static String getShapeForStart(String sIdent) {
		return sIdent+"Start [shape=circle style=filled fontname="+sFontName+" color=green margin=0]";
	}

	private static boolean showCompletePathOfArtifacts=false;
	private static String getShapeForArtifact(String sIdent, Artifact a) {
		return getShapeForArtifact(sIdent, a, false);
	}
	private static String getShapeForArtifact(String sIdent, Artifact a,boolean big) {
		String sArtColor = getFillColorForArtifact(a);
		// System.out.println("getShapeForArtifact("+a.getName()+")");
		String sIn="";
		Artifact aHelp=a;
		while (aHelp.eContainer() instanceof Artifact) {
			String sContainer = "\n("+((Artifact)aHelp.eContainer()).getName()+")";
			if (showCompletePathOfArtifacts) {
				sIn+=sContainer;
			} else {
				sIn=sContainer;
			}
			aHelp=(Artifact)aHelp.eContainer();
		}
		String sBig="";
		if (big) {
			sBig=" fontsize=25 penwidth=2";
		}
		return sIdent+"   "+getID(a)+" [label=\""+a.getName()+sIn+"\" shape=note fontname="+sFontName+sBig+" style=filled fillcolor="+sArtColor+" height=0]";
	}

	private static String getFillColorForArtifact(Artifact a) {
		String sArtColor="gray";
		if (a instanceof Model) {
			sArtColor="orange";
		}
		return sArtColor;
	}

	private static String removeBracket(String s) {
		if (s.startsWith("(") && s.endsWith(")")) {
			return s.substring(1, s.length()-1);
		}
		return s;
	}

	private static Map<Variantable,Set<String>> addNewStakeHolderBox(Map<StakeHolder, Map<Variantable,Set<String>>> mProcessClusters, StakeHolder sh, String sIdent) {
		return addNewStakeHolderBox(mProcessClusters, sh, sIdent, false);
	}
	private static Map<Variantable,Set<String>> addNewStakeHolderBox(Map<StakeHolder, Map<Variantable,Set<String>>> mProcessClusters, StakeHolder sh, String sIdent,boolean big) {
		if (mProcessClusters.containsKey(sh)) {
			return mProcessClusters.get(sh);
		}
		String sBig="";
		if (big) {
			sBig=" fontsize=25 penwidth=2";
		}
		Map<Variantable,Set<String>> lRes = new HashMap<Variantable, Set<String>>();
		mProcessClusters.put(sh, lRes);
		String sName="Undefined";
		if (sh!=null) {
			sName=sh.getName();
		}
		addToMap(lRes, sh, sIdent+"   label=\""+sName+"\" fontname="+sFontName+sBig+" shape=box style=solid color=black penwidth=1");
		return lRes;
	}

	private static String getShapeForProcessModule(String sIdent, ProcessModule pm,Named nScope) {
		return getShapeForProcessModule(sIdent, pm, false,nScope);
	}
	private static String getShapeForProcessModule(String sIdent, ProcessModule pm,boolean big,Named nScope) {
		// System.out.println("getShapeForProcessModule("+pm.getName()+") in "+nScope.getName());
		String sShape="box";
		String sStyle="rounded,filled";
		String sPen=""; // default
		String sColor=getColorForProcessModule(pm,nScope);
		String sFillcolor=getFillColorForProcessModule(pm,nScope);
		String sBig="";
		if (big) {
			sBig=" fontsize=25 penwidth=2";
		} else {
			sBig=" height=0";
		}
		if (VariantModel.filterActiveProcessModules(HierarchyModel.getProcesses(pm),nScope).size()>0) {
			// OS: default (PBMN is just bold, e.g. width=4)
			sShape="box3d";
			sStyle="filled";
			sPen="penwidth=3";
			sBig=""; // overwrite " height=0";
		}
		String sPM=sIdent+"   "+getID(pm)+" [label=\""+pm.getName()+"\" fontname="+sFontName+sBig+" shape="+sShape+" style=\""+sStyle+"\" color="+sColor+" "+sPen+" fillcolor="+sFillcolor+"]";
		return sPM;
	}

	private static String getColorForProcessModule(ProcessModule pm,Named nScope) {
		if (VariantModel.isActive(pm,nScope)==ACTIVATION.ACTIVE_NEVER) {
			return "darkgrey";
		}
		String sColor="blue";
		if (pm instanceof VerificationModule) {
			sColor="darkgreen";
		}
		return sColor;
	}
	private static String getFillColorForProcessModule(ProcessModule pm,Named nScope) {
		if (VariantModel.isActive(pm,nScope)==ACTIVATION.ACTIVE_NEVER) {
			return "lightgrey";
		}
		String sFillcolor="lightblue";
		if (pm instanceof VerificationModule) {
			sFillcolor="darkolivegreen1";
		}
		return sFillcolor;
	}
	@SuppressWarnings("unchecked")
	private static List<String> createAtomicProcessView(ProcessModule pmMain,String sIdent,Named nScope) {
		List<String> lRes=new LinkedList<String>();
		StakeHolder sh = HierarchyModel.getStakeHolderSuper(pmMain,inheritanceLevelForStakeHolder);
		if (sh!=null) {
			lRes.add(sIdent+"subgraph cluster0 {");
			sIdent+="   ";
			lRes.add(sIdent+"label=\""+sh.getName()+"\" fontname="+sFontName);
		}
		Set<Variantable> sAllObjectsInDiagram=new HashSet<Variantable>();
		sAllObjectsInDiagram.add(pmMain);
		lRes.add(getShapeForProcessModule(sIdent, pmMain,true,nScope));
		// check conditions
		for (BoolTerm bt:pmMain.getVariants()) {
			lRes.add(getShapeForVariant(sIdent, pmMain,bt,nScope));
			lRes.add(sIdent+getVariantID(pmMain,bt)+" -> "+getID(pmMain)+" [label=YES fontname="+sFontName+"]");
		}
		// now add the input artifacts
		Set<Artifact> rawSuperInputs = VariantModel.filterActiveArtifacts(HierarchyModel.getAllSuperInputs(pmMain,inheritanceLevelForArtifacts),nScope);
		List<Artifact> allSuperInputs = new LinkedList<Artifact>();
		allSuperInputs.addAll((Collection<? extends Artifact>) sortByLayoutPriority(rawSuperInputs));

		for (Artifact a:allSuperInputs) {
			if (HierarchyModel.getStakeHolderSuper(a,inheritanceLevelForStakeHolder)==sh) {
				sAllObjectsInDiagram.add(a);
				String sArt=getShapeForArtifact(sIdent, a);
				lRes.add(sArt);
				// add a link (dashed line) from the artifact
				lRes.add(sIdent+"   "+getID(a)+" -> "+getID(pmMain)+" [style=dashed]");
			}
		}
		// now add the output artifacts
		Set<Artifact> rawSuperOutputs = VariantModel.filterActiveArtifacts(HierarchyModel.getAllSuperOutputs(pmMain,inheritanceLevelForArtifacts),nScope);
		List<Artifact> allSuperOutputs = new LinkedList<Artifact>();
		allSuperOutputs.addAll((Collection<? extends Artifact>) sortByLayoutPriority(rawSuperOutputs));
		for (Artifact a:allSuperOutputs) {
			if (HierarchyModel.getStakeHolderSuper(a,inheritanceLevelForStakeHolder)==sh) {
				sAllObjectsInDiagram.add(a);
				String sArt=getShapeForArtifact(sIdent, a);
				lRes.add(sArt);
				// add a link (dashed line) to the artifact
				lRes.add(sIdent+"   "+getID(pmMain)+" -> "+getID(a)+" [style=dashed]");
			}
		}
		// before & after
		List<ProcessModule> afterProcessModules = (List<ProcessModule>) sortByLayoutPriority(VariantModel.filterActiveProcessModules(pmMain.getAfterProcessModules(),nScope));
		for (ProcessModule pmPred:afterProcessModules) {
			if (HierarchyModel.getStakeHolderSuper(pmPred,inheritanceLevelForStakeHolder)==sh) {
				sAllObjectsInDiagram.add(pmPred);
				// TODO?: do not add after/before redundantly specified wrt data flow?
				lRes.add(getShapeForProcessModule(sIdent, pmPred,nScope));
				lRes.add(sIdent+"   "+getID(pmPred)+" -> "+getID(pmMain));
			}
		}
		List<ProcessModule> beforeProcessModules = (List<ProcessModule>) sortByLayoutPriority(VariantModel.filterActiveProcessModules(pmMain.getBeforeProcessModules(),nScope));
		for (ProcessModule pmSucc:beforeProcessModules) {
			if (HierarchyModel.getStakeHolderSuper(pmSucc,inheritanceLevelForStakeHolder)==sh) {
				sAllObjectsInDiagram.add(pmSucc);
				// TODO?: do not add after/before redundantly specified wrt data flow?
				lRes.add(getShapeForProcessModule(sIdent, pmSucc,nScope));
				lRes.add(sIdent+"   "+getID(pmMain)+" -> "+getID(pmSucc));
			}
		}
		if (allSuperInputs.size()==0 && afterProcessModules.size()==0 && pmMain.getVariants().size()==0) {
			lRes.add(getShapeForStart(sIdent));
			lRes.add(sIdent+"Start -> "+getID(pmMain));
		}
		if (allSuperOutputs.size()==0 && beforeProcessModules.size()==0 && pmMain.getDeterminedVariables().size()==0) {
			lRes.add(getShapeForEnd(sIdent));
			lRes.add(sIdent+getID(pmMain)+"-> End");
		}
		if (sh!=null) {
			sIdent=sIdent.substring(0, sIdent.length()-3);
			lRes.add(sIdent+"}");
		}
		for (Artifact a:allSuperInputs) {
			if (HierarchyModel.getStakeHolderSuper(a,inheritanceLevelForStakeHolder)!=sh) {
				sAllObjectsInDiagram.add(a);
				lRes.add(getShapeForArtifact(sIdent, a));
				// add a link (dashed line) from the artifact
				lRes.add(sIdent+getID(a)+" -> "+getID(pmMain)+" [style=dashed]");
			}
		}
		for (Artifact a:allSuperOutputs) {
			if (HierarchyModel.getStakeHolderSuper(a,inheritanceLevelForStakeHolder)!=sh) {
				sAllObjectsInDiagram.add(a);
				lRes.add(getShapeForArtifact(sIdent, a));
				// add a link (dashed line) to the artifact
				lRes.add(sIdent+getID(pmMain)+" -> "+getID(a)+" [style=dashed]");
			}
		}
		// now check all before actions
		// before & after
		for (ProcessModule pmPred:afterProcessModules) {
			if (HierarchyModel.getStakeHolderSuper(pmPred,inheritanceLevelForStakeHolder)!=sh) {
				// TODO?: do not add after/before redundantly specified wrt data flow?
				sAllObjectsInDiagram.add(pmPred);
				lRes.add(getShapeForProcessModule(sIdent, pmPred,nScope));
				lRes.add(sIdent+"   "+getID(pmPred)+" -> "+getID(pmMain));
			}
		}
		for (ProcessModule pmSucc:beforeProcessModules) {
			if (HierarchyModel.getStakeHolderSuper(pmSucc,inheritanceLevelForStakeHolder)!=sh) {
				sAllObjectsInDiagram.add(pmSucc);
				// TODO?: do not add after/before redundantly specified wrt data flow?
				lRes.add(getShapeForProcessModule(sIdent, pmSucc,nScope));
				lRes.add(sIdent+"   "+getID(pmMain)+" -> "+getID(pmSucc));
			}
		}
		addPriortiesandInheritances(lRes, sIdent, sAllObjectsInDiagram,nScope,false);
		return lRes;
	}

	/** returns the color of the variant yellow if no Variables occur, otherwise gold */
	private static String getVariantColor(BoolTerm variant,Variantable v,Named nScope) {
		Term tEval;
		try {
			tEval = Evaluator.evalTerm(variant,v,nScope);
			if (TermComparator.equalTerms(tEval, Evaluator.getTRUE())) {
				return "green";
			}
			if (TermComparator.equalTerms(tEval, Evaluator.getFALSE())) {
				return "red";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		if (TermUtils.hasProcessVariable(variant)) {
			return "yellow";
		}
		return "gold";
	}



	/** computes the ID of the PM in dot file */
	private static String getID(Named pm) {
		String sID="";
		if (pm.getID()!=null && !pm.getID().equals("")) {
			sID=pm.getID();
		} else if (pm.getName()!=null && !pm.getName().equals("")) {
			sID=pm.getName();
		} else {
			sID="unnamed";
			System.err.println("Warning "+pm.eClass().getName()+" has neither Name nor ID, using '"+sID+"'");
		}
		// if (sID.indexOf(" ")>=0) {
		sID="\""+sID+"\"";
		// }
		return sID;
	}
	/** computes the ID of the variant of PM in dot file (just ID+"_Variant" */
	private static String getVariantID(Variantable v,BoolTerm bt) {
		String sID="";
		if (v.getID()!=null && !v.getID().equals("")) {
			sID=v.getID();
		} else if (v.getName()!=null && !v.getName().equals("")) {
			sID=v.getName();
		} else {
			sID="unnamed";
			System.err.println("Warning "+v.eClass().getName()+" has neither Name nor ID, using '"+sID+"'");
		}
		sID+="_Variant"+getIndexOfVariantTerm(v, bt);
		// if (sID.indexOf(" ")>=0) {
		sID="\""+sID+"\"";
		// }
		return sID;
	}
	private static List<String> getSortedListFromMap(Map<Variantable,Set<String>> m) {
		List<String> lRes=new LinkedList<String>();
		for (Variantable v:sortByLayoutPriority(m.keySet())) {
			lRes.addAll(m.get(v));
		}
		return lRes;
	}
	private static List<? extends Variantable> sortByLayoutPriority(Set<? extends Variantable> s) {
		List<Variantable> l= new LinkedList<Variantable>();
		l.addAll(s);
		return sortByLayoutPriority(l);
	}
	private static List<? extends Variantable> sortByLayoutPriority(List<? extends Variantable> list) {
		// eliminate duplicates
		Set<Variantable> s = new HashSet<Variantable>();
		for (Variantable v:list) {
			if (s.contains(v)) {
				System.out.println("found duplicate "+v.getName()+" in list");
			} else {
				s.add(v);
			}
		}
		List<Variantable> l = new LinkedList<Variantable>();
		for (Variantable v:s) {
			if (v!=null) {
				l.add(v);
			}
		}
		Collections.sort(l, new Comparator<Variantable>() {
			@Override
			public int compare(Variantable arg0, Variantable arg1) {
				if (arg0.getLayoutAfter().contains(arg1)) {
					return 1;
				}
				if (arg0.getLayoutBefore().contains(arg1)) {
					return -1;
				}
				int i0=arg0.getLayoutPriority();
				int i1=arg1.getLayoutPriority();
				if (i0<i1) return -1;
				if (i0>i1) return 1;
				return 0;
			}
		});
		return l;
	}



	// dot-cmd (assuming dot.exe is in path)
	public static String DOT_CMD = "dot";

	public static String getPMTReportTempDir() {
		String sRes= System.getProperty("java.io.tmpdir") + File.separator + "PMTReportPR"; //$NON-NLS-1$ //$NON-NLS-2$
		File fTemp=new File(sRes);
		if (!fTemp.exists()) {
			System.out.println("creating temporary directory for images in "+sRes);
			fTemp.mkdirs();
		}
		return sRes;
	}
	/**
	 * returns a path to the image (png) of the process (prvided it has been created before)
	 * ensures also uniqueness of the images of processes have same names
	 */
	private static Map<Named,String> mPaths= new HashMap<Named, String>();
	public static String getPathToImageForNamedElement(Named n) throws Exception {
		return mPaths.get(n);
	}
	public static String createImageForNamedElement(Named named,Named nScope) throws Exception {
		return createImageForNamedElement(named,false,nScope);
	}
	public static String createImageForNamedElement(Named named,boolean forceRegeneration,Named nScope) throws Exception {
		if (!forceRegeneration && mPaths.containsKey(named)) {
			return mPaths.get(named);
		}
		final String path = getPMTReportTempDir();
		File tempDir = new File(path);
		if (!(tempDir.exists()&& tempDir.isDirectory())) {
			tempDir.mkdirs();
		}
		String sName=getFileName(named.getName());
		File fTmpGV=new File(tempDir,sName+".gv");
		File fTmpPNG=new File(tempDir,sName+".png");
		int iCnt=0;
		while (fTmpGV.exists() || fTmpPNG.exists()) {
			iCnt++;
			fTmpGV=new File(tempDir,sName+iCnt+".gv");
			fTmpPNG=new File(tempDir,sName+iCnt+".png");
		}
		List<String> lDotImg = PMT2DOT.getDOTContent(named,nScope);
		PersistencyUtils.writeTOfFile(fTmpGV, lDotImg);
		// Call dot to generate the image
		final ProcessBuilder pb = new ProcessBuilder(DOT_CMD, fTmpGV.toString(), "-Tpng", "-o", fTmpPNG.toString()); //$NON-NLS-1$ //$NON-NLS-2$
		final Process proc = pb.start();
		proc.waitFor();
		if (proc.exitValue() != 0) {
			System.err.println("Conversion of '" + fTmpPNG + "' with "+DOT_CMD+" "+fTmpGV.toString()+"-Tpng -o "+fTmpPNG.toString()+" failed."); //$NON-NLS-1$ //$NON-NLS-2$
			return null;
		}
		String sResult=fTmpPNG.toString();
		// System.out.println("createImageForProcessModule: created "+sResult);
		mPaths.put(named,sResult);
		return sResult;	
	}
	
	/** make file names: removes blanks, /, \,  */
	public static String getFileName(String sName) {
		while (sName.indexOf("->")>=0) {
			sName=sName.replace("->", "__");
		}
		while (sName.indexOf("/")>=0) {
			sName=sName.replace("/", "_");
		}
		while (sName.indexOf("&")>=0) {
			sName=sName.replace("&", "_");
		}
		while (sName.indexOf("*")>=0) {
			sName=sName.replace("*", "_");
		}
		while (sName.indexOf(" ")>=0) {
			sName=sName.replace(" ", "_");
		}
		return sName;
	}
}
