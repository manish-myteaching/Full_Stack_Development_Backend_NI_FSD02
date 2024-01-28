package oops.principle.encpsulation;

public class Encapsulation {
	private String empSalary;
	private int empNo;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age > 18 && age < 100) {
			this.age = age;
		} else {
			throw new Exception("Age Value is not allowed");
		}
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) throws Exception {
		if (empNo > 0) {
			this.empNo = empNo;
		} else {
			throw new Exception("Invalid");
		}
	}

}
