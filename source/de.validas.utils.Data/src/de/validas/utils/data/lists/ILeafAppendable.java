package de.validas.utils.data.lists;

public interface ILeafAppendable extends IAppendable {

	/* (non-Javadoc)
	 * @see de.validas.utilsData.lists.IAppendable#getSuccessor()
	 */
	@Override
	default IAppendable getSuccessor() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.validas.utilsData.lists.IAppendable#setSuccessor(de.validas.utilsData.lists.IAppendable)
	 */
	@Override
	default void setSuccessor(IAppendable next) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Successor for Leaf Node not possible");
	}

}
