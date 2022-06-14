package de.validas.utils.data.lists;

public class ListWrapper extends AbstractAppendable implements IAppendable {
	
	private Object content;

	public ListWrapper(Object content){
		this.content = content;
	}
	
	public Object get() {
		return content;
	}

	public void insertAfter(IAppendable after) {
		// TODO Auto-generated method stub
		
	}

	public void insertBefore(IAppendable before) {
		// TODO Auto-generated method stub
		
	}

}
