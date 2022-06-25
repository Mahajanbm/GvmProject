package com.demo.collectiondemo;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> aList=new ArrayList<Employee>();
		Employee e1=new  Employee(101, "Mahi", "hyd");
		Employee e2=new  Employee(102, "Ajay", "Delhi");
		Employee e3=new  Employee(103, "john", "hyd");
		Employee e4=new  Employee(101, "Tim", "Pune");
		Employee e5=new  Employee(101, "Ram", "Delhi");
		//aList.add(new Employee(101, "Mahi", "hyd"));
		//aList.add(new Employee(102, "ketan", "pune"));
		//aList.add(new Employee(103, "Ajay", "Delhi"));
		//aList.add(new Employee(104, "vijay", "HR"));
		
		aList.add(e1);
		aList.add(e2);
		aList.add(e3);
		aList.add(e4);
		aList.add(e5);
		
		System.out.println(aList);

	}

}
