package a4_ControlStatement;

public class While_Loop {

	public static void main(String[] args) {
		// I need to print table of 5 in incremental order
		//start-->5 end--><=50 update-->i=i+5
		//1.initialization
		//2. while(condition)
		/*
		* {
		*3.body to be executed
		*updation
		* }
		*/
		
		int i=5;
		while(i<=50)
		{
			System.out.println(i);
			i=i+5;
		}

		System.out.println("=====================");
		
		// I need to print table of 5 in decremental order
		//start-->50 end --> >=5 updation -->i=i-5
		
		int j=50;
		while(j>=5)
		{
			System.out.println(j);
			j=j-5;
		}
	}

}
