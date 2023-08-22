package a13_String;

public class String_Methods {

	public static void main (String[] args)

	{
		//1. length() method
		String a="NewParty";
		System.out.println(a.length());

		//OR
		int lengthOfString=a.length();
		System.out.println(lengthOfString);
		String b="New";
		System.out.println(b.length());
		int lengthOfString2=b.length();
		System.out.println(lengthOfString2);
		
		//2. toUppercase()
		String c="HelloWorld!";
		System.out.println(c.toUpperCase());
		String StringToUpper=c.toUpperCase();
		System.out.println(StringToUpper);

		//3. toLowerCase()
		String strLowerCase=c.toLowerCase();
		System.out.println(strLowerCase);
		
		//4. equals()
		String d1="mumbai";
		String d2="mumbai";
		String d3=new String ("MUMMBAI");
		String d4=new String ("mumbai");
		String d5=new String ("mumbai");
		String d6=new String ("Mumbai");
		
		//what is == --> will check for address(memory location)
		// and return true if both address are same, else returns false
		System.out.println(d1==d2);
		System.out.println(d1==d6);
		System.out.println(d3==d4);
		System.out.println(d4==d5);
		System.out.println("=======");
		//equals() method will check for char sequence and case
		System.out.println(d1.equals(d6));
		boolean dr=d4.equals(d1);
		System.out.println(dr);
		
		//5.equalsIgnoreCase()
		System.out.println(d5.equalsIgnoreCase(d2));
		
		//6. contains()
		String E="India";
		System.out.println(E.contains("I"));
		
		
		
		
		
		
	}
}
