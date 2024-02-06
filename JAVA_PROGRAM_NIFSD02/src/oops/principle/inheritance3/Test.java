package oops.principle.inheritance3;

public class Test {

	public static void main(String[] args) {
		A a = new A(); // Parent
		B b = new B(); // Child
		C c = new C(); // Child
		D d = new D(); // Child
		
		A aa=new B();
		A aaa=new D();
		
		B bb= new C(); // Upcasting
		C x=(C)   bb; // Downcasting
		
		System.out.println(c instanceof A);
		
	}

}
