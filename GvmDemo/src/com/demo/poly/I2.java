package com.demo.poly;

public interface I2 extends I1 {
	//public void Add();
	default void Change()
	{
		System.out.println("I2 Interface Meethod Change");
		
	}

}
