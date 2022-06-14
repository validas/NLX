package de.validas.spedit.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class NlxDeclarativeQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	@Override
	protected QualifiedName qualifiedName(Object ele) {
//		return super.qualifiedName(ele);
		if (ele instanceof EObject) {
			return QualifiedName.create(((EObject) ele).eClass().getName());
		} else 
			return null;
	}

}
