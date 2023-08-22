package a7_This__Super_Keyword;

public class ThisKeyword {

	//Global variable
	int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword tk=new ThisKeyword();
		tk.add();
	}
	
	public void add()
	{
		int c=8;
		//Local Variable
		int a=5;
		int b=15;
		int sum=a+b+c;
		int sum1=this.a+ThisKeyword.b;
		
		System.out.println("Local values of a, b, and c "+a+", " +b+", "+c+".");
		System.out.println("global values of a and b "+this.a+" and "+ThisKeyword.b+".");
		System.out.println("addition using local values "+sum);
		System.out.println("addition using global values is "+sum1);
		
	}
	

}
