package pattern_Project;

public class EquilateralTriangle_Downward_WithSpacing {

	public static void main(String[] args) {
		// Equilateral Triangle Downward With Space
		//* * * * *
		// * * * *
		// * * *
		// * *
		// *
		
		// No of Space in First Row
		int space=0;
		// No of Starts in First Row
		int star=5;
		
		// Outer For Loop
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}
	}

}
