package com.demo.exception.example;
import java.util.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a, b,c;
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=40;
		String string=null;
		Scanner sc=new Scanner(System.in);
		try
		{	System.out.println("outer try block");
		 System.out.println("Enter 1st Number");
	     a=sc.nextInt();
	
	     System.out.println("Enter 2nd Number");
	      b=sc.nextInt();
						c=a/b;
						System.out.println(c);
									
						try {
							System.out.println("1st inner try block");
							System.out.println(arr[6]);
						} catch (Exception e) {
							
							try {	System.out.println("2nd inner try block");
								System.out.println(string.charAt(1));
							
							} catch (Exception e2) {
								System.out.println("inner try catch block");
							}
							System.out.println("Inner catch block");
						}
		}
		catch (ArithmeticException e) {
			System.out.println("divide by zero exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array IndexOutOf BoundsException");
		}
		catch (Exception e) {
			System.out.println("Error");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("After Catch Block");	

	}

}
