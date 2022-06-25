package com.demo.poly;

public class Test  extends Demo{
	public void Display()
	{
		System.out.println("Display method of Test class");
	}

	public static void main(String[] args) {
	//Test t1=new Test();
	//t1.Display();
//Demo d1=new Demo();
//d1.Display();
	
	Demo d1=new Test();
	d1.Display();
	}

}
