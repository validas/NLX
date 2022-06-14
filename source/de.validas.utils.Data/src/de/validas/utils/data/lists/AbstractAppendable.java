/**
 * 
 */
package de.validas.utils.data.lists;

/**
 * this class is a Prototype for Classes that are intended to subclass from it to be used as tokens in a linked list
 * it preconfigures all neccessary functionalities to operate in a linked list. 
 * You can see it as kind of mixin when your class has only the default anchestor java.class.Object. Alternative you can use the interfaces
 * and then implement the function on that subclass level if the used class has already other anchestors and/or extending from this class 
 * is not an option.
 *   
 * @author schaller
 *
 */
public abstract class AbstractAppendable implements IAppendable {

	private IAppendable successor;  // fields can be private because class offers a comprehensive interface 
	private IAppendable precessor;	// that allow full access also for its class descendants 
	
	/**
	 * Default Constructor
	 */
	public AbstractAppendable() {
		// TODO could already link successor and precessor
	}

	/* (non-Javadoc)
	 * @see de.validas.utils.data.lists.IAppendable#getSuccessor()
	 */
	@Override
	public IAppendable getSuccessor() {
		return successor;
	}

	/* (non-Javadoc)
	 * @see de.validas.utils.data.lists.IAppendable#setSuccessor(de.validas.utils.data.lists.IAppendable)
	 */
	@Override
	public void setSuccessor(IAppendable next) {
		successor = next;
	}

	/* (non-Javadoc)
	 * @see de.validas.utils.data.lists.IAppendable#getPrecessor()
	 */
	@Override
	public IAppendable getPrecessor() {
		return precessor;
	}

	/* (non-Javadoc)
	 * @see de.validas.utils.data.lists.IAppendable#setPrecessor(de.validas.utils.data.lists.IAppendable)
	 */
	@Override
	public void setPrecessor(IAppendable previous) {
		precessor = previous;
	}

}
