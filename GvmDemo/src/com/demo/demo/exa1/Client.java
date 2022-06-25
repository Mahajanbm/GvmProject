package com.demo.demo.exa1;

import com.demo.demo.exa.ProtectedDemo;

public class Client  extends ProtectedDemo{

	public static void main(String[] args) {
		Client c1=new Client();
		System.out.println(c1.id);
		c1.Demo();
	}

}
