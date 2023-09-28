package programs;

public class StringVowels {

	public static void main(String[] args) {

		String str = new String("Hi Welcome");
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
			}
		}		
		String str1=new String("Hey how are you");
		for(int i=0;i<str1.length();i++) {
			if (str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
				System.out.println("Given String Contains "+str1.charAt(i)+" at the index "+i);
			}
		}
	}
}
