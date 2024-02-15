package set;

import java.util.HashSet;
import java.util.Set;

import set.Employee;

public class EmployeeDAO {

	public static void main(String... k) {

		// Database-->JDBC /ORM/Spring JDBC
		Employee employee1 = new Employee();
		employee1.setEmpNo(101);
		employee1.setEmpName("Ramesh");
		employee1.setEmpCity("Pune");
		employee1.setSalary(5000);
		System.out.println(employee1.hashCode());
		// System.out.println(employee1);

		Employee employee2 = new Employee();
		employee2.setEmpNo(102);
		employee2.setEmpName("Ashok");
		employee2.setEmpCity("Mumbai");
		employee2.setSalary(7000);
		System.out.println(employee2.hashCode());
		// System.out.println(employee2);

		Employee employee3 = new Employee();
		employee3.setEmpNo(101);
		employee3.setEmpName("Shyam");
		employee3.setEmpCity("Indore");
		employee3.setSalary(8000);
		System.out.println(employee3.hashCode());

		Employee employee4 = new Employee();
		employee4.setEmpNo(101);
		employee4.setEmpName("Shyam");
		employee4.setEmpCity("Indore");
		employee4.setSalary(8000);
		System.out.println(employee4.hashCode());
		// System.out.println(employee3);

		Set<Employee> se = new HashSet();
		se.add(employee1);
		se.add(employee2);
		se.add(employee3);
		se.add(employee4);
		//System.out.println(se);

		for (Employee emp : se) { // Foreach
			System.out.println(emp);
		}

		// System.out.println(employee1.equals(null));
		// System.out.println("Emp1 and Emp3 " + employee1.equals(employee3));
		// System.out.println("Emp1 and Emp2 " + employee1.equals(employee2));
	}

}
