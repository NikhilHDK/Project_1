package pattern_Project;

public class Triangle_Right_Acending {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		//*****
		// Space in first row, space = 4
		int space=4;
		// star on first row, star = 1
		int star=1;
		for(int i=1;i<=5;i++)
		{
			// Outer loop for No of Rows = 5
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}

	}

}
