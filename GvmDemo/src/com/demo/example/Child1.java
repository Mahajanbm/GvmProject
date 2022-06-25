package com.demo.example;

public class Child1 extends Parent1{
	static
	{
		System.out.println("static block of Child");
	}

	{
		System.out.println("Non static block of Child");
	}
	public Child1() {
		System.out.println("This is  child");
	}

}
