package pattern_Project;

public class ButterFly {

	public static void main(String[] args) {
		//*         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         * ( Remember : Star Space Space Star)
				
		int star1	=1;	// Star on the first Row Left
		int space1	=5;	// Space on the first Row Left
		int star2	=1;	// Star on the first Row Right
		int space2	=4;	// Space on the first Row Right

		//Outer for loop used for No. of Rows = 9
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=space2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++)
			{
				System.out.print("*");
			}
			
			if(i<5)
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
			
			System.out.println();
			
		}
	}

}
