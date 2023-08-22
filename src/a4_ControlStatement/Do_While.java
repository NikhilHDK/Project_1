package a4_ControlStatement;

public class Do_While {

	public static void main(String[] args) {

		// 1.initialization
		/*
		* 2.do
		* {
		* body of the loop
		* updation part
		* }
		* 3.while(condition)
		*/
		// I need to print table of 5 in incremental order
		//start-->5 end--><=50 update-->i=i+5
		
		int i=5;
		do
		{
			System.out.println(i);
			i=i+5;
		}
		while (i<=50);
	}

}
