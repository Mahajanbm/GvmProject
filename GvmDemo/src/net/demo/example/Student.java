package net.demo.example;

public class Student {
	static {
		System.out.println("this is Static block");
	}
	static
	{
		System.out.println("this is  another Static block");
	}
	static {
		System.out.println("Static block2");
	}
	static
	{
		System.out.println("another Static block2");
	}
	public Student() {
		System.out.println("Constructor");	
	}
	public Student(int a) {
		System.out.println(" parameterized Constructor");	
	}
	{
		   System.out.println("Another non-static block");
	   }
   {
		
		System.out.println("This is non- static block");
	}

   public void Demo()
   {
	   System.out.print("This is Non-static method");
   }
   
   
	public static void main(String[] args) {
	System.out.println("Hello Java");
	//Student s1=new Student(10);
		//Student s2=new Student();
	}

}
