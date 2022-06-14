package de.validas.spedit.generator

class Context {
	int leading
	int trailing
	
	new (int leading, int trailing){
		this.leading = leading
		this.trailing = trailing
	}
	
	new() {
		this.leading = 0
		this.trailing = 0
	}
	
	def setLeading(int leading){
		this.leading = leading 
		this.trailing = 0
	}
	
	def getLeading() {
		leading
	}
	
	def setTrailing(int trailing){
		this.trailing = trailing
	}
	
	def getTrailing(){
		trailing
	}
	
	def incLeading(){
		leading++
	}
	
	def incTrailing(){
		trailing++
	}
	
	def generate() {
		'''«IF leading > 0»«leading»«ENDIF»«IF leading > 0 && trailing > 0».«ENDIF»«IF trailing > 0»«trailing»«ENDIF»'''.toString
	}
	
}