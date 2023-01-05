package com.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Myset {
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Set<String> set = new HashSet<>();
		set.add("Kumar");
		set.add("Shiva");
		set.add("Anil");
		set.add("Surya");
		set.add(null);
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
