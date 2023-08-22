package a2_Methods;

public class StudentsList {

	public static void main(String[] args) {
		// calling static method from same class
		studentInfo();
		studentInfo("Astha","F",5678,2.8);
		studentInfo("Nik","M",9871,2.8);
		studentInfo("jim","M",2981,3.4);
	}
	
	public static void studentInfo()
	{
		//name, gender, rollNo, %marks
		
		String StudentName="Jay";
		char gender ='M';
		int rollNo=9898;
		float marks=99.9f;
		
		System.out.println("===============================");
		System.out.println("Students Name is "+StudentName);
		System.out.println("Students gender is "+gender);
		System.out.println("Students rollNo is "+rollNo);
		System.out.println("Students marks are "+marks);
		System.out.println("===============================");
	}
	//name, gender, rollNo, %marks
	public static void studentInfo(String name, String string, int RollNo, double d)
	//method with parameter
	{
		System.out.println("==========================");
		System.out.println("Students name is "+name);
		System.out.println("Students gender is "+string);
		System.out.println("Students rollNum is "+RollNo);
		System.out.println("Students marks are "+d+"%");
		System.out.println("==========================");
	
	}
	
}
