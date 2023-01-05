package com.set;

import java.util.HashSet;
import java.util.Set;

public class ConvertSetToArray {

	public static Set<Character> convert(char[] array) {
		Set<Character> set = new HashSet<>();
		for (Character c : array) {
			set.add(c);
		}
		return set;
	}
	
	public static void main(String[] args) {
		char[] ch= {'a','b','c','d','a','b'};
		Set<Character> set = convert(ch);
		System.out.println(set);
	}

}
