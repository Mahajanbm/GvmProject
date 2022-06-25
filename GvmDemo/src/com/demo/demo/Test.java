package com.demo.demo;
public class Test extends AbstarctDemo {
 int a;
	
	public Test(int a) {
	super(20);
	System.out.println("Test class  parameterized Constructor");
}
	public Test() {
	
		System.out.println("Test class Constructor");
	}
	public static void main(String[] args) {
		
		AbstarctDemo d2=new Test();
     AbstarctDemo a1=new Test(10);		
	}

}
