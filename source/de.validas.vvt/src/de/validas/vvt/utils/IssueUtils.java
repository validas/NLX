package de.validas.vvt.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.validas.vvt.Artifact;
import de.validas.vvt.Check;
import de.validas.vvt.CheckResult;
import de.validas.vvt.CheckStatus;
import de.validas.vvt.Described;
import de.validas.vvt.Instance;
import de.validas.vvt.Issue;
import de.validas.vvt.Parameter;
import de.validas.vvt.ParameterValue;
import de.validas.vvt.Person;
import de.validas.vvt.Project;
import de.validas.vvt.VvtFactory;
import de.validas.vvt.impl.VvtFactoryImpl;

/**
 * Utilities for open issues
 * @author slotosch
 *
 */
public class IssueUtils {

	public static boolean isOpenIssue(Issue issue) {
		return  !(issue.getFixedInRevisionOrDate()!=null && !issue.getFixedInRevisionOrDate().trim().equals(""));
	}

	public static Set<Issue> getAllOpenIssues(Project project) {
		Set<Issue> sResult=new HashSet<Issue>();
		for (Issue i:project.getIssues()) {
			if (isOpenIssue(i)) {
				sResult.add(i);
			}
		}
		return sResult;		
	}

	public static Set<Issue> getAllFixedIssues(Project project) {
		Set<Issue> sResult=new HashSet<Issue>();
		for (Issue i:project.getIssues()) {
			if (!isOpenIssue(i)) {
				sResult.add(i);
			}
		}
		return sResult;		
	}

	public static Set<Issue> getAllIssues(Project project) {
		Set<Issue> sResult=new HashSet<Issue>();
		for (Issue i:project.getIssues()) {
				sResult.add(i);
		}
		return sResult;		
	}

	public static Set<CheckResult> getAllCheckResults(Issue issue) {
		Set<CheckResult> sResult=new HashSet<CheckResult>();
		Project project = (Project)issue.eContainer();
		TreeIterator<EObject> it=project.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof CheckResult) {
				CheckResult cr = (CheckResult)eo;
				if (cr.getIssues().contains(issue)) {
					sResult.add(cr);
				}
			}
		}
		return sResult;		
	}

	public static Set<Issue> getAllUsedIssues(List<Check> lChecks) {
		Set<Issue> sResult=new HashSet<Issue>();
		Check check = lChecks.get(0);
		Project project = HierarchyModel.getProjectSuper(check);
		for (Issue i:getAllIssues(project)) {
			for (CheckResult cr:getAllCheckResults(i)) {
				if (lChecks.contains(cr.eContainer())) {
					sResult.add(i);
				}
				
			}
		}
		return sResult;
	}

}
