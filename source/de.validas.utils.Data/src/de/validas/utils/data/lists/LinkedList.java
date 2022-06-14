/**
 * 
 */
package de.validas.utils.data.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * LinkedList is an extension of lists which allow it's members to see it's neighbors on member level without calling/addressing 
 * the class who holds the list.
 * The list automatically links all members to its neighbors
 *  
 * @author felix schaller
 * @param <IAppendable>
 *
 */
public class LinkedList<E extends IAppendable> extends ArrayList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2235474566893945511L;

	public LinkedList() {
		super();
	}

	public LinkedList(Collection<E> coll) {
		super(coll);
	}

	@Override
	public boolean add(E element) {
		int size = this.size();
		if (size > 0) {
			IAppendable precessor = this.get(this.size()-1);
			if (precessor instanceof ILeafAppendable)
				return false;
			// do not allow adding Elements behind Leaf Nodes
	
			precessor.setSuccessor(element);
			element.setPrecessor(precessor);
		}
		super.add(element);

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.ArrayList#add(int, java.lang.Object)
	 */
	@Override
	public void add(int index, E element) {

		if (index > this.size() || index < 0)
			throw new IndexOutOfBoundsException("Index exceeds size of LinkedList");
		if (index == this.size()) { // if index is appending elements on last element just call std. add
			add(element);
			return;
		}

		IAppendable accessor = this.get(index); // index can't never be out of bounds here

		if (accessor instanceof ILeafAppendable || accessor instanceof IRootAppendable)
			return;
		// do not allow adding Elements behind Leaf Nodes or before Root Nodes
		// TODO: maybe implement a Control weather to throw an error or be tolerant
		IAppendable precessor = accessor.getPrecessor(); // store old precessor of Accessor
		accessor.setPrecessor(element);
		element.setSuccessor(accessor);
		if (precessor != null) { // beginning of List j/n?
			precessor.setSuccessor(element);
			element.setPrecessor(precessor);
		}
		super.add(index, element);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.ArrayList#addAll(java.util.Collection)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(Collection<? extends E> c) {

		IAppendable precessor = this.get(this.size()); // index can't never be out of bounds here

		if (precessor instanceof ILeafAppendable)
			return false;

		precessor.setSuccessor(((ArrayList<IAppendable>) c).get(0));
		((ArrayList<IAppendable>) c).get(0).setPrecessor(precessor);

		((ArrayList<IAppendable>) c).get(c.size() - 1).setSuccessor(null); // ensure last element points nowhere
		return super.addAll(c);
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#remove(int)
	 */
	@Override
	public E remove(int index) {
		IAppendable successor = null;
		IAppendable precessor = null;
		
		if (index > 0 && index < this.size())
			precessor = this.get(index-1);
		if (index >= 0 && index < (this.size() -1))
			successor = this.get(index+1);
		
		precessor.setSuccessor(successor);
		successor.setPrecessor(precessor);
		
		return super.remove(index);
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(Object o) {
		int index = this.indexOf(o);
		if (index <0) // not found
			return false;
		
	    if (super.remove(index) != null)
	    	return true;
	    else
	    	return false; // unlikely, but otherwise eclipse complains 
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#removeAll(java.util.Collection)
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException("Operation currently not supported");
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#removeIf(java.util.function.Predicate)
	 */
	@Override
	public boolean removeIf(Predicate<? super E> filter) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Operation currently not supported");
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#replaceAll(java.util.function.UnaryOperator)
	 */
	@Override
	public void replaceAll(UnaryOperator<E> operator) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Operation currently not supported");
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#retainAll(java.util.Collection)
	 */
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Operation currently not supported");
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#set(int, java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		IAppendable el = this.get(index);
		element.setPrecessor(el.getPrecessor());
		element.setSuccessor(el.getSuccessor());
		return super.set(index, element);
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#sort(java.util.Comparator)
	 */
	@Override
	public void sort(Comparator<? super E> c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Operation currently not supported");
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#subList(int, int)
	 */
	@Override
	public LinkedList<E> subList(int fromIndex, int toIndex) {

		java.util.List<E> tempList = super.subList(fromIndex, toIndex);
		// set first precessor and last successor null to avoid wrong associations
		tempList.get(0).setPrecessor(null);
		tempList.get(tempList.size()-1).setSuccessor(null);
		
		LinkedList<E> list = new LinkedList<E>(tempList);
		
		return list;
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#trimToSize()
	 */
	@Override
	public void trimToSize() {
		// TODO Auto-generated method stub
		super.trimToSize();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.ArrayList#addAll(int, java.util.Collection)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {

		if (index > this.size() || index < 0)
			throw new IndexOutOfBoundsException("Index exceeds size of LinkedList");
		if (index == this.size()) { // if index is appending elements on last element just call std. add
			addAll(c);
			return true;
		}

		IAppendable accessor = this.get(index); // index can't never be out of bounds here

		if (accessor instanceof ILeafAppendable || accessor instanceof IRootAppendable)
			return false;

		IAppendable precessor = accessor.getPrecessor(); // store old precessor of Accessor
		accessor.setPrecessor(((ArrayList<E>) c).get(c.size() - 1));
		((ArrayList<IAppendable>) c).get(c.size() - 1).setSuccessor(accessor);
		if (precessor != null) { // beginning of List j/n?
			precessor.setSuccessor(((ArrayList<E>) c).get(0));
			((ArrayList<E>) c).get(0).setPrecessor(precessor);
		}

		return super.addAll(index, c);
	}

	/* (non-Javadoc)
	 * @see java.util.ArrayList#toArray(java.lang.Object[])
	 */
	@Override
	public <E> E[] toArray(E[] arg0) {
		return super.toArray(arg0);
	}
	
	

}
