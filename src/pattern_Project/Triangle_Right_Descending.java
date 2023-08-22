package pattern_Project;

public class Triangle_Right_Descending {

	public static void main(String[] args) {
		//*****
		// ****
		// ***
		// **
		// *
		
		// On the First Row there is no space, space = 0;
		int space=0;
		// Outer Loop for the No of Rows = 5
		int star=5;
		for(int i=1;i<=5;i++)
		{
			//1st consider inner for loop for the Space
			for(int j=1;j<=space;j++)
			{
				// Use Single Space and on Print for Inner For Loop
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		space++;
		star--;
		}

	}

}
