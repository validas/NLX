/**
 * 
 */
package de.validas.spedit.generator;

import de.validas.utils.data.lists.IAppendable;

/**
 * @author Felix Schaller
 *
 */
public class ChapterNumber implements IAppendable {

	/**
	 * 
	 */
	public ChapterNumber(String number) {
		this.number = number;
	}

	protected String number;

	protected IAppendable precessor = null;
	protected IAppendable successor = null;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public IAppendable getSuccessor() {
		return successor;
	}

	@Override
	public void setSuccessor(IAppendable next) {
		successor = next;
	}

	@Override
	public IAppendable getPrecessor() {
		return precessor;
	}

	@Override
	public void setPrecessor(IAppendable previous) {
		precessor = previous;
	}

}
