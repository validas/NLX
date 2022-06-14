package de.validas.pmt.utils;

import java.util.Comparator;

import metaModel.suptertype.Named;

public class NamedComparator implements Comparator<Named>{

	private boolean bUseIdsIfAvailable = false;
	
	public NamedComparator(boolean bUseIds) {
		bUseIdsIfAvailable = bUseIds;	
	}

	/** default: no IDs */
	public NamedComparator() {
		bUseIdsIfAvailable=false;
	}

	@Override
	public int compare(Named arg0, Named arg1) {
		String sName1="";
		if (bUseIdsIfAvailable && arg0.getID()!=null && !arg0.getID().equals("")) {
			sName1=arg0.getID();
		} else if (arg0.getName()!=null) {
			sName1=arg0.getName();
		}
		String sName2="";
		if (bUseIdsIfAvailable && arg1.getID()!=null && !arg1.getID().equals("")) {
			sName2=arg1.getID();
		} else if (arg1.getName()!=null) {
			sName2=arg1.getName();
		}
		return sName1.compareTo(sName2);
	}

}
