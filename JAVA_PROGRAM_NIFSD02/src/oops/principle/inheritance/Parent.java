package oops.principle.inheritance;

import java.io.FileNotFoundException;

public class Parent {
	int empNo;
	String empName;

	Parent() {
		System.out.println("Parent-Defaut-constuctor");
	}

	Parent(int empNo, String empName) {
		this();
		this.empNo = empNo;
		this.empName = empName;
		System.out.println(this.toString());

	}

	void show() {
		System.out.println("Show-Parent");
	}

	@Override
	public String toString() {
		return "Parent [empNo=" + empNo + ", empName=" + empName + "]";
	}
}
