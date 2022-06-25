package com.demo.collectiondemo;

import java.util.Iterator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < a.length; i++) 
				{
		a[i]=sc.nextInt();
		}
		System.out.println(a[0]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array elements are "+a[i]);

		}
		
	}

}
