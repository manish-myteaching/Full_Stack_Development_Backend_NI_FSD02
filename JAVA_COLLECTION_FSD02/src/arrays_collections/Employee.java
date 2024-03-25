package arrays_collections;

import java.util.Objects;

import list.InvalidSalaryException;

//POJO
public class Employee implements Comparable<Employee> {
	private Integer empNo;
	private String empName;
	private String empCity;
	private Integer salary;

	public Employee(Integer empNo, String empName, String empCity, Integer salary) {

		this.empNo = empNo;
		this.empName = empName;
		this.empCity = empCity;
		this.salary = salary;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			throw new InvalidSalaryException("Salary should greater than 0");
		}
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empCity=" + empCity + ", salary=" + salary
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empCity, empName, empNo, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empCity, other.empCity) && Objects.equals(empName, other.empName)
				&& Objects.equals(empNo, other.empNo) && Objects.equals(salary, other.salary);
	}

	@Override
	public int compareTo(Employee o) {
		if (this.getEmpNo() > o.getEmpNo()) {
			return 1;
		}else if(this.getEmpNo() < o.getEmpNo()){
			return -1;
		}
		return 0;
	}

}
