package pattern_Project;

public class EquilateralTriangle_Upward_WithSpacing {

	public static void main(String[] args) {
		// Equilateral Triangle Upward With Space
		// *
		// * *
		// * * *
		//* * * *
		
		int space=3;
		int star=1;
		// Outer for loop for the no of Rows
		for(int i=1;i<=4;i++)
		{
			// Inner For Loop for Space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			// Inner For Loop for star
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
	}
}
