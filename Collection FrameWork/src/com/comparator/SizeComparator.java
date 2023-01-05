package com.comparator;

import java.util.Comparator;

public class SizeComparator implements Comparator<Memory>{

	@Override
	public int compare(Memory m1, Memory m2) {
		if(m1.getSize()==m2.getSize()) {
			return 0;
		}else if (m1.getSize()>m2.getSize()) {
			return 1;
		}else
			return -1;
	}

}
