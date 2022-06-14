package de.validas.vvt.utils;

import java.util.Comparator;

import de.validas.vvt.Described;

public class DescribedComparator implements Comparator<Described>{

	private boolean bUseIdsIfAvailable = false;
	
	public DescribedComparator(boolean bUseIds) {
		bUseIdsIfAvailable = bUseIds;	
	}

	/** default: no IDs */
	public DescribedComparator() {
		bUseIdsIfAvailable=false;
	}

	@Override
	public int compare(Described arg0,Described arg1) {
		String sName1="";
		if (bUseIdsIfAvailable && arg0.getId()!=null && !arg0.getId().equals("")) {
			sName1=arg0.getId();
		} else if (arg0.getName()!=null) {
			sName1=arg0.getName();
		}
		String sName2="";
		if (bUseIdsIfAvailable && arg1.getId()!=null && !arg1.getId().equals("")) {
			sName2=arg1.getId();
		} else if (arg1.getName()!=null) {
			sName2=arg1.getName();
		}
		return sName1.compareTo(sName2);
	}

}
