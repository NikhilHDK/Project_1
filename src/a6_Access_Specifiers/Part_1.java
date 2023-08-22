package a6_Access_Specifiers;

public class Part_1 {

	public static void main(String[] args) {
		Part_1 p=new Part_1();
		p.Object_1();
		p.Object_2();
		p.Object_3();
		p.Object_4();
	}
	
	public void Object_1()
	{
		System.out.println("public scope of that member remains through the project.");
	}
	protected void Object_2()
	{
		System.out.println("protected scope of that member remains within package, using inheritance can be accessed outside the package.");
	}
	void Object_3()
	{
		System.out.println("default scope of that member remains within package, cant be accessed outside of package.");
	}
	private void Object_4()
	{
		System.out.println("private scope of that member remains within class, cant be accessed outside of class.");
	}

}
