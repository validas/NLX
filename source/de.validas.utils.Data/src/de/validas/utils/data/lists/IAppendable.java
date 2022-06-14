package de.validas.utils.data.lists;

public interface IAppendable {
	 
	public IAppendable getSuccessor();
	
	public void setSuccessor(IAppendable next);
	
	public IAppendable getPrecessor();
	
	public void setPrecessor(IAppendable previous);
	
}
