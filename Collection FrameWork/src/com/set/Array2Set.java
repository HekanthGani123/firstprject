package com.set;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Array2Set {
	public static<T> Set<T> convetToArray(T array[]){
		return Arrays.stream(array).collect(Collectors.toSet());
	}
	
	public static void main(String[] args) {
		String[] s= {"dell","hp","lenovo"};
		Set<String> collect=convetToArray(s);
		System.out.println(collect);
	}

}
