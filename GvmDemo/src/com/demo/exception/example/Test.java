package com.demo.exception.example;

public class Test {

	public void Demo()
	{
		String s="Hello";
		try {
			System.out.println(s.charAt(0));
			throw new NullPointerException();
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointer Exception");
		}
		
	}
		public static void main(String[] args) {
		Test t1=new Test();
		try {
			t1.Demo();
			
		} catch (Exception e) {
			System.err.println("error in the code");
		}
		
	}

}
