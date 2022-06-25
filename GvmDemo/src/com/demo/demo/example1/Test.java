package com.demo.demo.example1;

public class Test implements I3,I4 {

	
	public void Demo() {
		System.out.println("Demo Method Implementation");		
	}
	
	
public static void main(String[] args) {
	//Test  t1=new Test();
	//t1.Demo();
	I3 i3=new Test();
	i3.Demo();
	I4 i4=new Test();
	i4.Demo();
	i3.Demo1();
}



public void Demo1() {
	System.out.println("Demo1 method ");	
}
}
