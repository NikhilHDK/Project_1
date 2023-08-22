package a5_Inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		C c=new C();
		a.A1();
		A.A2();
		b.B1();
		b.A1();
		B.A2();
		c.A1();
		C.A2();
		c.C1();

	}

}
