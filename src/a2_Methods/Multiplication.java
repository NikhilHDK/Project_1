package a2_Methods;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiplication m=new Multiplication();
		m.mul();
		m.mul(3,4);
		
	}
	
	public void mul()
	{
		int a,b,mul;
		a=10;
		b=20;
		mul=a*b;
		System.out.println("Multiplication is "+mul);
	}
	public void mul(int a, int b)
	{
		int mul;
		mul=a*b;
		System.out.println("Multiplication is "+mul );
	}

}
