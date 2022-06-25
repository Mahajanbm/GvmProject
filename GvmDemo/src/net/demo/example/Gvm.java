package net.demo.example;

public class Gvm {
static
{
	System.out.println("Static block");
}
static
{
	System.out.println("Static block1");
}
{

	System.out.println("no -Static block");
}
{
	System.out.println("no -Static block1");
}
public Gvm() {
	System.out.println("Constructor");
}
public  static void Demo1()
{
	System.out.println("Demo1 Method");
}


public void Demo()
{
	System.out.println("Demo Method");
}
public static void main(String[] args) {
	Gvm g1=new Gvm();
	g1.Demo();
	Gvm.Demo1();
	System.out.println("Main Method");
	Gvm g2=new Gvm();
	

	}

}
