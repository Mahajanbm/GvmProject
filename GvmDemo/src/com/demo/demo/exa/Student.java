package com.demo.demo.exa;

public class Student {
	 int id;

	 
	 public  Student() {
	System.out.println("constructor calling");	
	}
 void Demo()
	 {
		System.out.println("Demo method of Student class "); 
	 }
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.id);
		s1.Demo();

	}

}
