package com.demo.demo.exa;

public class ProtectedDemo {
	public int id;
	
	public ProtectedDemo()
	{
		System.out.println("Constructor of Protected Demo class");
	}
	public void Demo()
	{
		System.out.println("Demo Meyhod");
	}
public static void main(String[] args) {
	ProtectedDemo p1=new ProtectedDemo();
System.out.println(p1.id);
p1.Demo();
}
}
