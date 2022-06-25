package com.demo.collectiondemo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		List l1=new ArrayList ();
		AbstractList al=new ArrayList();
		ArrayList aList=new ArrayList();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add("hello");
		System.out.println(l1);
		al.add("GVM");
		al.add("Sonepat");
		al.add("HR");
		al.add("Sector 14");
		System.out.println(al);
	aList.add("HR");
	aList.add(101);
	aList.add("Mahi");
System.out.println(aList);
aList.add(15);
System.out.println(aList);


System.out.println(aList.contains(107));

		System.out.println(aList.size());
		aList.remove(3);

System.out.println(aList);
System.out.println(aList.get(0));

	}

}
