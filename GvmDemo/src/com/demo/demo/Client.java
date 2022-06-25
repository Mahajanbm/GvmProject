package com.demo.demo;

public class Client  extends Demo{

	public  void Display()
	{
		System.out.println("Display methd Implemenetation");
	}
	public  void Display1()
	{
		System.out.println("Display methd Implemenetation");
	}
	public static void main(String[] args) {
		//Client c1=new Client();
		//c1.Display();
		//c1.Demo1();
		//Demo d1=new Demo();//error
		Demo d1;
		d1=new Client();
		d1.Demo1();//
		
		d1.Display();

	}

	

}
