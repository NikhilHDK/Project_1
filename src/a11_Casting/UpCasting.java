package a11_Casting;

public class UpCasting {

	public static void main(String[]args)
	{
		Father f=new Father();
		f.bike();
		f.car();
		System.out.println("=====");
		Son s=new Son();
		s.bike();
		s.car();
		s.degree();
		System.out.println("=====");
		Father fs=new Son();
		fs.bike();
		fs.car();
		//fs.degree();// using upcasting we can call common-->overrided properties
	}
}
