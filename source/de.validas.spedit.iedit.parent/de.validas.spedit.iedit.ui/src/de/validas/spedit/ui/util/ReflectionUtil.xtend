package de.validas.spedit.ui.util

class ReflectionUtil {
	
	static def getPrivateFromSuper(Object obj, String name){
		var fields = obj.class.superclass.declaredFields
		for (field: fields){
			if (field.name.equals(name)){
				
				field.accessible = true
				return field.get(obj) 
			}
		}
	}
	
}
