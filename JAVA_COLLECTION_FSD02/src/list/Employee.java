package list;

//POJO
public class Employee {
	private Integer empNo;
	private String empName;
	private String empCity;
	private Integer salary;

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

}
