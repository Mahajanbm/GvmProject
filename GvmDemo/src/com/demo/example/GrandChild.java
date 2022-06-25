package com.demo.example;

public class GrandChild  extends Child1{
	static
	{
		System.out.println("static block of GrandChild");
	}
	{
		System.out.println("Non static block of GrandChild");
	}
	public GrandChild() {
		System.out.println("This is  GrandChild");
	}

}
