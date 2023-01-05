package com.comparator;

import java.util.Comparator;

public class DriveComparator implements Comparator<Memory>{

	@Override
	public int compare(Memory o1, Memory o2) {
		return o1.getDrive().compareTo(o2.getDrive());
		System.out.println("hi");
				   
	}

}
