package a7_This__Super_Keyword;

public class Super_Keyword extends ThisKeyword{

	// subclass global variable
	int a=100;
	public static void main (String[] args)
	{
		Super_Keyword sf=new Super_Keyword();
		sf.Multy();
	}
	
	public void Multy()
	{
		int a=5;
		
		System.out.println("local value of subclass "+a);
		System.out.println("local value from subclass "+this.a);
		System.out.println("global vlue from super class "+super.a);
		
	}
	
}
