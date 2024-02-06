package exception;

public class EmployeeDemo {

	String empName;
	int age;
	long salary;

	EmployeeDemo(String empName, int age, long salary) throws UserDefinedException {
		this.empName = empName;
		if (age > 0 && age < 100) {
			this.age = age;
		} else {
			throw new UserDefinedException("Age is not allowed");
		}
		this.salary = salary;
	}

	public EmployeeDemo getEmployeeDetail(String name, int age, long salary) throws InvalidArgumentException {
		if (!name.startsWith("M")) {
			throw new InvalidArgumentException("Name should be started from M");
		} else if (!(age > 18 && age < 100)) {
			throw new InvalidArgumentException("Age is not Allowed");
		} else if (salary < 1000) {
			throw new UserDefinedException("Salay Should at least 10000");
		}
		EmployeeDemo emp = new EmployeeDemo(name, age, salary);
		return emp;
	}

	@Override
	public String toString() {
		return "EmployeeDemo [empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String... k) {

		EmployeeDemo emp = new EmployeeDemo("A", 20, 5000);
		try {
			EmployeeDemo emp2 = emp.getEmployeeDetail("Manish", 23, 30000);
			System.out.println(emp2);

			EmployeeDemo emp3 = emp.getEmployeeDetail("Mahesh", 30, 50000);
			System.out.println(emp3);

			EmployeeDemo emp4 = emp.getEmployeeDetail("Manik", 36, 60000);
			System.out.println(emp4);
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Mehod End");
	}

}
