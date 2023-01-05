package com.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class MyList {
	
	public static int addAllNumbers(List<Integer> num) {
		int result=0;
		for(Integer i:num) {
			result+=i;
		}
		return result;
	}
	public static void main(String[] args) {
		
		List<Integer> numbers=new LinkedList<>();
		for(int i=11;i<=20;i++) {
			numbers.add(i);
		}
		
		System.out.println(numbers);
		
		Spliterator<Integer> s = numbers.spliterator();
		while(s.tryAdvance(n->System.out.print(n)));
		
		int values=addAllNumbers(numbers);
		System.out.println(values);
		
		
	}

}
