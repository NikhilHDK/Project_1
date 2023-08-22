package a3_Constructor;

public class RunOne {

	int a=10;
	int b=20;
	int sum;
	
	public RunOne()
	{
	a=5;
	b=8;
	System.out.println("User defined constructor without parameter");
	}
	
	public RunOne(int m)
	{
		a=m;
		System.out.println("with one parameter");
	}
	
	public RunOne(int p,int q)
	{
		a=p;
		b=q;
		System.out.println("with two parameters");
	}
	
	public static void main(String[]args)
	{
		RunOne r=new RunOne();
		r.addtion();
	
	}
	
	public void addtion()
	{
		sum=a+b;
		System.out.println("additon is "+sum);
	}
	
	

	

}
