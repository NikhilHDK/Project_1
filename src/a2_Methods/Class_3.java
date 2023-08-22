package a2_Methods;

public class Class_3 {

	public static void main(String[] args) {
		//to call non-static method we need to create object at-least once
		//how to create object
		// className objectName= new ClassName();
		
		Class_3 c=new Class_3();
		
		//how to call non-Static methods
		//objectName.methodName
		c.Monitor();
		c.Display();
	}
	
	public void Monitor()
	{
		System.out.println("Non Static regular method 1");
	}
	
	public void Display()
	{
		System.out.println("Non Static regular method 2");
	}

}
