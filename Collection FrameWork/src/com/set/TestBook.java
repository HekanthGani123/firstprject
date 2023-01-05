package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestBook {
	public static void main(String[] args) {
		
		Book b1=new Book(1, "j++", 550, "willia");
		Book b2=new Book(4, "rubhy", 200, "kine");
		Book b3=new Book(3, "Angular", 500, "abra");
		
		List<Book> books=new ArrayList<>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		Collections.sort(books);
		
		
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("..........");
		
		for(Book b:books) {
			System.out.println(b);
		}
	}

}
