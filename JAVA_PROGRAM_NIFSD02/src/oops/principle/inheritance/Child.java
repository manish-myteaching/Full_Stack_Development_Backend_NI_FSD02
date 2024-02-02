package oops.principle.inheritance;

public class Child extends Parent {

	String student;

	Child() {
		super(101, "A");
		super.empName = "B";
		super.empNo = 102;
		System.out.println("Constructor - Child");
	}

	Child(String student) {
		super(101, "A");
		this.student = student;	
	}
	
	void show() {
		
	}
}
