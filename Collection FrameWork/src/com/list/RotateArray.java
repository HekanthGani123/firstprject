package com.list;

import java.util.Arrays;

public class RotateArray {
	public static void rotate(int[] a) {
		
//		for(int j=1;j<=2;j++) {
//			int last=a[0];
//		for(int i=0;i<a.length-1;i++) {
//			a[i]=a[i+1];
//		}
//		a[4]=last;
//		}
		
		for(int j=1;j<=2;j++) {
		int first=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=first;
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		rotate(arr);
	}

}
