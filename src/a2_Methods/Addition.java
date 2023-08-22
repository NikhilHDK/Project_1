package a2_Methods;

public class Addition {

	public static void main(String[] args) {
		
		Addition a=new Addition();
		a.Add(3, 5);
	}
	
	public void Add(int a, int b)
	{
		int adding=a+b;
		System.out.println("Addition is "+adding);
	}

}
