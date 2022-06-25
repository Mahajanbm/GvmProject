package com.demo.exception.example;import java.security.KeyStore.TrustedCertificateEntry;

public class Demo {

	public static void main(String[] args) {
		
		int [] a=new int[2];
		a[0]=10;
		a[1]=20;
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("finally block");
			try {
				System.out.println("try block" );
				System.out.println(a[0]);
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("error");
			}
			finally {
				
			}
			
		}
		

	}

}
