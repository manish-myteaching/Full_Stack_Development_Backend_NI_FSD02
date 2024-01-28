package thiskeyword;

public class Employee {

	String empName;
	long empSalary;

	Employee(String empName, long empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public void show() {
		System.out.println(this.empName);
		System.out.println(this.empSalary);
	}

}
