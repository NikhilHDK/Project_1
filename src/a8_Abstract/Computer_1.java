package a8_Abstract;

public abstract class Computer_1 {

	public static void main(String[] arges)
	{
	// we can't create object of abstract class
	User_3();
	}
	// complete method from Part_1 class
	public void User_1()
	{
		System.out.println("sample_1 method from Part_1 class");
	}
	// incomplete/abstract method from test class
	public abstract void User_2();
	
	public static void User_3()
	{
		System.out.println("sample static method");
	}
	//public abstract void demo2(); static method never be abstract method	
	
}
