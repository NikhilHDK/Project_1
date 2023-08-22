package a11_Casting;

public class ID_1_Casting {

	public static void main(String[]args)
	{
		//implicit casting--> lower-->higher, memory--> increases, No data loss
		int a=10; // a is of type int
		System.out.println(a);
	
	//lets convert into to double
	double b=a;
	System.out.println(b);
	
	//explicit casting higher-->lower, memory-->decreases, data loss is possible
	
	double p=123.321;
	System.out.println(p);
	int q=(int)p;
	System.out.println(q);
}}
