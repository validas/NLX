package de.validas.nlx.view.fxviews.cache

import de.validas.nlx.view.fxviews.cache.ICacheObj

interface ICacheLink extends ICacheObj {
	//TODO: make ICacheLink unrelative to ICacheObj
	def ICacheObj  getOutLink()
	
	def ICacheObj  getInLink()
	
	def String getAttrs()
}