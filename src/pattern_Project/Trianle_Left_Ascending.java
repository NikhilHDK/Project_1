package pattern_Project;

public class Trianle_Left_Ascending {

	public static void main(String[] args) {
		
		// Write No of star in first Row
		int star=1;	

		// Outer for loop used for Rows
		for(int i=1;i<=5;i++)
	
		{
		// Inner Loop for Columns
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
		// after printing star go on next line	
				System.out.println();

		// Increment in stars
				star++;
		}
		}
		}
