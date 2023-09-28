package programs;

public class Equals_Class {

	public static void main(String[] args) {


		String st1=new String("Hello");
		String st2=new String("Hello");
		if(st1.equals(st2)) {
			System.out.println("true");
		}
		if(st1==st2) {
			System.out.println("Not equals");
		}
		else
		{
			System.out.println("False");
		}

	}

}
