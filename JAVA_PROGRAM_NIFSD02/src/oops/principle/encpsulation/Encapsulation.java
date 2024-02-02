package oops.principle.encpsulation;
 class Encapsulation {
	private String empSalary;
	private int empNo;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidArgumentException {
		if (age > 18 && age < 100) {
			this.age = age;
		} else {
			throw new InvalidArgumentException(Constant.INVAID_AGE);
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

	public void setEmpNo(int empNo) throws InvalidArgumentException {
		if (empNo > 0) {
			this.empNo = empNo;
		} else {
			throw new InvalidArgumentException(Constant.INVAID_EMP_NO);
		}
	}

	@Override
	public String toString() {
		return "Encapsulation [empSalary=" + empSalary + ", empNo=" + empNo + ", age=" + age + "]";
	}
}
