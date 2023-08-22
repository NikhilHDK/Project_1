package a4_ControlStatement;

public class Nested_If_Else {

	public static void main(String[] args) {


	String ID="Nik";
	String PWD="New@123";
	
	if (ID=="Nik") 
		{
		System.out.println("Please Enter Password!");
	
		if(PWD=="New@123")
		{
			System.out.println("LogIn Successfull!!");
		}
		else 
		{
			System.out.println("Incorrect Password!!");
		}
		}
	else
		{
			System.out.println("Incorrect ID!!");
		}
		}
		}
