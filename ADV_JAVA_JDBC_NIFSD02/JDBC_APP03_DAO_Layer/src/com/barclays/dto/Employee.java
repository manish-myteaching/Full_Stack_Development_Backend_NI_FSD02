package com.barclays.dto;

//POJO
public class Employee {
	private int empId;
	private String empName;
	private int age;
	private int aadhar;
	private String salary;

	public Employee(int empId, String empName, int age, int aadhar, String salary) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.aadhar = aadhar;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAadha() {
		return aadhar;
	}

	public void setAadha(int aadha) {
		this.aadhar = aadha;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", aadhar=" + aadhar + ", salary="
				+ salary + "]";
	}

}
