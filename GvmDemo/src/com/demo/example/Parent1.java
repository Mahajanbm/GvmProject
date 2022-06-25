package com.demo.example;

public class Parent1 {
	static
		{
			System.out.println("static block of Parent1");
		}
	
	{
		System.out.println("Non static block of Parent1");
	}
	public Parent1() {
		System.out.println("This is  Parent");
	}

}
