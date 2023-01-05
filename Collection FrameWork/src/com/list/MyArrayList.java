package com.list;

public class MyArrayList {

	private Object[] a = new Object[5];
	private int p = 0;

	public void add(Object e) {

		if (p >= a.length)
			increaseCapacity();

		a[p++] = e;

	}

	public void add(int index, Object e) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		if (p >= a.length)
			increaseCapacity();// 2>=5

		for (int i = size() - 1; i >= index; i--) {
			a[i + 1] = a[i];
			a[index] = e;
			p++;
		}
	}

	private void increaseCapacity() {
		Object[] t = new Object[a.length + 3];
		for (int i = 0; i < a.length; i++) {
			t[i] = a[i];
			a = t;
		}
	}

	public int size() {
		return p;
	}

	@Override
	public String toString() {
		if (size() == 0)
			return "[]";

		String s = "[" + a[0] + "," + a[1];
		for (int i = 2; i < size(); i++) {
			s = s + "," + a[i];
		}
		s = s + "]";
		return s;
	}

	public Object get(int index) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}

	public static void main(String[] args) {

		MyArrayList ar = new MyArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		System.out.println(ar);
	}

}