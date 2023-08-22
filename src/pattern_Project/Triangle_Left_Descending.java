package pattern_Project;

public class Triangle_Left_Descending {

	public static void main(String[] args) {
		//*****
		//****
		//***
		//**
		//*
		
		// No of star present in first row
		int star=5;
		
		// Outer loop for rows
		for(int i=1;i<=5;i++)
			{
		// inner loop for	
			for(int j=1; j<=star;j++)
			{
				System.out.print("*");
			}
		// after printing star go on next line	
			System.out.println();
		
		// Decreasing stars
			star--;

		}
		}
		}
