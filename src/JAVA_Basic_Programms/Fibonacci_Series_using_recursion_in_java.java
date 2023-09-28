package JAVA_Basic_Programms;

public class Fibonacci_Series_using_recursion_in_java {

	static int n1=0,n2=1,n3=0;
	static void printfibonacci(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printfibonacci(count-1);
		}
	}
	
	public static void main(String args[])
			{
			int count=10;
			System.out.print(n1+" "+n2);
			printfibonacci(count-2);
		
		
			}
	
}
