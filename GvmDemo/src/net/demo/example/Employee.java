package net.demo.example;

public class Employee {
	int a;
	int b;
public Employee() {
		System.out.println("Default");
	}
public Employee(int a) {
	System.out.println("Int");
	}
public Employee(float a) {
	System.out.println("Float");
}
public Employee(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("Int Int");
}
public Employee(int a, float b) {
	System.out.println("Int Float");
}
public Employee(Employee e1)
{
this.a=e1.a;
this.b=e1.b;
System.out.println(a +" "+ b);
}
	public static void main(String[] args) {
		//Employee e1=new Employee();
		//e1.Employee();
		Employee e1=new Employee(10,20);//10 20
		Employee e2=new Employee(e1);
		
		
		
		
		
		
		
		//Employee e2=new Employee(e1);
		
	}

}
