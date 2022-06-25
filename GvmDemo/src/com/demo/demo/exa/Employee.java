package com.demo.demo.exa;
public class Employee {
 private int id;
 private String name;
 private String city;
  public Employee()
 {
	 System.out.println("Private Constructor");
 }
  public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

private void Display()
 {
	 System.out.print("Employee class Display Method");
 }
 public static void main(String[] args) {

	Employee e1=new Employee();
	System.out.println(e1.id);
	e1.Display();
}
}
