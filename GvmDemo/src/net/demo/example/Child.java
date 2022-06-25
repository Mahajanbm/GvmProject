package net.demo.example;

public class Child extends Parent{

	public Child() {
		System.out.println("child Class Default constructor");
	}
	public Child(int a) {
		super(10);
		//super();
		//super.x=15;
		System.out.println("child Class Parameterized constructor");
	}

}
