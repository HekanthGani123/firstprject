package com.list;

import java.util.ArrayList;
import java.util.Collections;

public class MyCollection {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Hekanth");
		names.add("varun");
		names.add("Manu");
		names.add("utsav");
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
	}

}
