package pattern_Project;

public class Equilateral_Downward {

	public static void main(String[] args) {
		
		//*******
		// *****
		// ***
		// *

		int space=0;
		int star=7;
		// Outer For Loop; Rows= 4
		for(int i=1;i<=4;i++)
		{
			// Inner for Loop
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			// Inner for Loop
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			// Increment of Space by 1
			space++;
			// Decrement of Star by 2
			star=star-2;
		}

	}

}
