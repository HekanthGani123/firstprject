package com.list;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		
		List<Integer> n =new ArrayList<>();
		
		for(int i=500;i<=510;i++) {
			n.add(i);
		}
		
		Integer[] a=new Integer[5];
		System.out.println(a.length);
		
		Integer[] b=n.toArray(a);
		System.out.println(b.length);
		for(Integer i:b) {
		System.out.println(i);
	}
	}

}
