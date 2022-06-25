package com.demo.demo.example1;

public  interface I1 {
	 int a=10;
	 static int b=30;
	public  void Demo();
	default void Demo1()
	{
		System.out.println("Demo1 method");
	}
	
}
