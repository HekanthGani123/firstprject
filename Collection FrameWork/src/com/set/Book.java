package com.set;

public class Book implements Comparable<Book> {
	
	private int slno;
	private String title;
	private int price;
	private String author;
	public Book(int slno, String title, int price, String author) {
		super();
		this.slno = slno;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [slno=" + slno + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	@Override
	public int compareTo(Book o) {
//		if(this.slno>o.slno) {
//			return 1;
//		}else if (this.slno<o.slno) {
//			return -1;
//		}else
//			return 0;
		
//	if(this.slno==o.slno) {
//		return 0;
//	}else if(this.slno>o.slno) {
//		return 1;
//	}else
//		return -1;
		
//		if(this.price==o.price) {
//			return 0;
//		}else if(this.price>o.price) {
//			return 1;
//		}else
//			return -1;
		
		return this.author.compareTo(o.author);
	}
}
