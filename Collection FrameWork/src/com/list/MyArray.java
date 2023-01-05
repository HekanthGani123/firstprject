package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyArray {
	public static void main(String[] args) {
		
		List<Integer> add = new ArrayList<>();
		add.add(20);
		add.add(25);
		add.add(10);
		
//		List<Integer> subList = add.subList(1, 2);
//		System.out.println(subList);
//		
//		Collections.sort(add);
//		System.out.println(add);
		
		
		
		
//		int length=add.size();
//		for(int i=0; i<length; i++) {
//			System.out.println(add);
//		}
		
		String name="Vijay";
		String address="Tamil";
		
		System.out.println(name+" "+address);
		
		StringBuilder sb=new StringBuilder();
		sb.append(name);
		sb.append(" ");
		sb.append(address);
		System.out.println(sb.toString());
		
		
		
	}

}
