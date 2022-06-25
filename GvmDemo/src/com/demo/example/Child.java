package com.demo.example;

public class Child {
	{
		System.out.println("This is non-satic block 0 of Child");
	}
	{
		System.out.println("This is non-satic block 1 of Child");	
	}
	static
	{
		System.out.println("This is satic block 0 of Child");
	}
	static
	{
		System.out.println("This is satic block 1 of Child");
	}
	public Child()
	{System.out.println("This is  Child Constructor");
		
	}
}
