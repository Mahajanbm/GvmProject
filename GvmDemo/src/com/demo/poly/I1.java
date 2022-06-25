package com.demo.poly;

public interface I1 {
	//public void Add();
	default void Change()
	{
		System.out.println("I1 Interface Meethod Change");
		
	}

}
