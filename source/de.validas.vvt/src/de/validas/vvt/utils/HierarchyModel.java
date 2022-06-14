/**
 * 
 */
package de.validas.vvt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.validas.vvt.Artifact;
import de.validas.vvt.Check;
import de.validas.vvt.CheckResult;
import de.validas.vvt.CheckStatus;
import de.validas.vvt.Described;
import de.validas.vvt.Parameter;
import de.validas.vvt.Person;
import de.validas.vvt.Project;

/**
 * @author slotosch
 * hierarchy routines
 */
public class HierarchyModel {
	public static Project getProjectSuper(Described d) {
		if (d instanceof Project) {
			return (Project)d;
		}
		if (d.eContainer() instanceof Described) {
			return getProjectSuper((Described)d.eContainer());
		}
		return null;
	}
	
	public static Set<Person> getAllPersons(Described project) {
		Set<Person> sRes = new HashSet<Person>();
		TreeIterator<EObject> it = project.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof Person) {
				sRes.add((Person)eo);
			}
		}
		return sRes;
	}

	public static Set<Person> getAllResponsiblePersons(List<Check> lCheck) {
		Set<Person> sRes = new HashSet<Person>();
		for (Check c:lCheck) {
			if (c.getAuthor()!=null) {
				sRes.addAll(c.getAuthor());
			}
		}
		return sRes;
	}


	public static Set<Parameter> getAllRelevantParameters(List<Check> lCheck) {
		Set<Parameter> sRes = new HashSet<Parameter>();
		for (Check c:lCheck) {
			sRes.addAll(c.getParameters());
		}
		return sRes;
	}


	public static Set<Artifact> getAllArtifacts(Described project) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		TreeIterator<EObject> it = project.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof Artifact) {
				sRes.add((Artifact)eo);
			}
		}
		return sRes;
	}

	public static Set<Check> getAllChecks(Described project) {
		Set<Check> sRes = new HashSet<Check>();
		TreeIterator<EObject> it = project.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof Check) {
				sRes.add((Check)eo);
			}
		}
		return sRes;
	}

	public static Set<CheckResult> getAllCheckResults(Described project) {
		Set<CheckResult> sRes = new HashSet<CheckResult>();
		TreeIterator<EObject> it = project.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof CheckResult) {
				sRes.add((CheckResult)eo);
			}
		}
		return sRes;
	}

	public static Set<CheckResult> getAllPositiveCheckResults(Described project) {
		Set<CheckResult> sRes = new HashSet<CheckResult>();
		for (CheckResult cr:getAllCheckResults(project)) {
			if (cr.getVerdict()==CheckStatus.PASSED) {
				sRes.add(cr);
			}
		}
		return sRes;
	}
	public static Set<CheckResult> getAllNegativeCheckResults(Described project) {
		Set<CheckResult> sRes = new HashSet<CheckResult>();
		for (CheckResult cr:getAllCheckResults(project)) {
			if (cr.getVerdict()!=CheckStatus.PASSED) {
				sRes.add(cr);
			}
		}
		return sRes;
	}

	public static Set<Artifact> getAllCheckedArtifacts(List<Check> lChecks) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		for (Check c:lChecks) {
			// System.out.println("getAllCheckedArtifact ("+c.getName()+"):"+c.getCheckedArtifact());
			if (c.getCheckedArtifact()!=null) {
				sRes.add(c.getCheckedArtifact());
			}
		}
		return sRes;
	}

	public static Artifact getCheckedArtifactSuper(Check c) {
		if (c.getCheckedArtifact()!=null) {
			return c.getCheckedArtifact();
		}
		if (c.eContainer() instanceof Check) {
			return getCheckedArtifactSuper((Check)c.eContainer());
		}
		return null;
	}
	public static Set<Artifact> getAllRequiredArtifacts(List<Check> lChecks) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		for (Check c:lChecks) {
			sRes.addAll(c.getRequiredArtifacts());
		}
		return sRes;
	}

	public static Map<String,Map<EClass,Set<Described>>> getAllDescribedMap(Described described) {
		Map<String,Map<EClass,Set<Described>>> mRes= new HashMap<String, Map<EClass,Set<Described>>>();
		TreeIterator<EObject> it=described.eAllContents();
		while (it.hasNext()) {
			EObject eo = it.next();
			if (eo instanceof Described) {
				if (!mRes.containsKey(((Described)eo).getName())) {
					mRes.put(((Described)eo).getName(), new HashMap<EClass, Set<Described>>());
				}
				Map<EClass, Set<Described>> m=mRes.get(((Described)eo).getName());
				EClass ec=eo.eClass();
				if (!m.containsKey(ec)) {
					m.put(ec, new HashSet<Described>());
				}
				m.get(ec).add((Described)eo);
			}
		}
		return mRes;
	}

}
