package a4_ControlStatement;

public class Switch_Case {

	public static void main(String[] args) {
		//summer--> its too hot
		//winter--> its cold
		//rainy --> its Raining
		//key--> variable-->season
		
		String season="mansoon	";
		
		switch(season) 
		{
		case "summer":
		{
			System.out.println("It's Too HOT!!!");
		break;
		}
		case "winter":
		{
			System.out.println("It's Very COLD!!");
		break;
		}
		case "mansoon":
		{
			System.out.println("It's Raining!!");
		break;
		}
		default:
		{
			System.out.println("Please enter valid season");
		}
		}
		

	}

}
