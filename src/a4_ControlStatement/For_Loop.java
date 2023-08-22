package a4_ControlStatement;



public class For_Loop {

	public static void main(String[] args) {
		// I need to print table of 5 in incremental order
		// start-->5 end-->50 update-->5
		
		for(int i=5; i<=50; i=i+5)
		{
			System.out.println(i);
		}
		System.out.println("==================");
		
		// I need to print table of 5 in decremental order
		// start-->50 end-->5 update-->5
		
		for(int j=50; j>=5; j=j-5)
		{
			System.out.println(j);
		}
	}

}
