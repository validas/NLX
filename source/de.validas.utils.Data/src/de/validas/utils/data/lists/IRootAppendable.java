/**
 * 
 */
package de.validas.utils.data.lists;

/**
 * @author Felix Schaller
 *
 */
public interface IRootAppendable extends IAppendable {
	
	@Override
	default IAppendable getPrecessor() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.validas.utilsData.lists.IAppendable#setSuccessor(de.validas.utilsData.lists.IAppendable)
	 */
	@Override
	default void setPrecessor(IAppendable next) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Successor for Root Node not possible");
	}

	

}
