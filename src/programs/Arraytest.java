package programs;

import java.util.ArrayList;

public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList();
		a.add("1 2 3");
		a.add("4 5 6");
		a.add("7 8 9");
		for(String b:a) {
			System.out.print(" ["+b+"] ");
		}
	}

}
