package JAVA_Basic_Programms;

import java.util.Scanner;

public class Prime_Number_Program_in_Java {

	public static void main(String[] args) {
		int i, m=0, flag=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numer to know is it prime number.");
		int n=sc.nextInt();
		
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+"is not prime number.");
		}
		else {
			for(i=2;i<=m;i++)
			{
				if(n%i==0) 
				{
					System.out.println(n+" is not prime number");
					flag=1;
					break;
				}
			}
			if (flag==0) {System.out.println(n+" is a prime number.");}
		}
	}
}
