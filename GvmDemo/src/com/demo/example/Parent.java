package com.demo.example;

public class Parent {
	
	
	{
		System.out.println("This is non-satic block 0 of Parent");
	}
	{
	System.out.println("This is non-satic block 1 of Parent");	
	}
	static
	{
		System.out.println("This is satic block 0 of Parent");
	}
	static
	{
		System.out.println("This is satic block 1 of Parent");
	}
public  Parent()
{
	System.out.println("Parent class Constructor");
}
/*public  Parent(int a)
{
	System.out.println("Parent class Parameterized Constructor");
}*/
public void Demo()
{	
		System.out.println("Demo Method of Parent");
	

}
public static void Demo1()
{System.out.println("Demo1 Method of Parent");
	
}
}
