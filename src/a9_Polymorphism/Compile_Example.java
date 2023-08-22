package a9_Polymorphism;

public class Compile_Example {

	public static void main(String[]args)
	{
		Compile_Example ce=new Compile_Example();// created object of a class
		ce.addition();
		ce.addition(6, 9);
		ce.addition(8, 8, 8);
	}
	
	public void addition()//method without parameter
	{
		int a=10;
		int b=10;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	
	public void addition(int x, int y)// method with two parameters
	{
		int sum=x+y;
		System.out.println("addition is "+sum);
	}
	
	public void addition(int p, int q, int r)// method with three parameters
	{
		int sum=p+q+r;
		System.out.println("addition is "+sum);
	}
}
