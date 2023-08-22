package a3_Constructor;

public class MathOperations {

	int a;
	int b;
	int c;
	int sum;
	
	public MathOperations()
	{
		a=10;
		b=20;
	}
	
	public MathOperations(int x)
	{
		a=x;
	}
	
	public MathOperations(int m, int n)
	{
		a=m;
		b=n;
	}
	
	public MathOperations(int x,int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	public static void main(String[] args) {
	
		MathOperations mo=new MathOperations();
		mo.addition();
		
		MathOperations moP1=new MathOperations(3);
		moP1.addition();
		
		MathOperations moP2=new MathOperations(3,6);
		moP2.addition();
		
		MathOperations moP3=new MathOperations(3,6,9);
		moP3.addition();
		
	}
	
	public void addition()
	{
		sum=a+b+c;
		System.out.println("Addition is "+sum);
	}

}
