package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDAO {

	public static void main(String... k) {

		// Database-->JDBC /ORM/Spring JDBC
		Employee employee1 = new Employee();
		employee1.setEmpNo(101);
		employee1.setEmpName("Ramesh");
		employee1.setEmpCity("Pune");
		employee1.setSalary(5000);
		System.out.println(employee1);

		Employee employee2 = new Employee();
		employee2.setEmpNo(102);
		employee2.setEmpName("Ashok");
		employee2.setEmpCity("Mumbai");
		employee2.setSalary(7000);
		System.out.println(employee2);

		Employee employee3 = new Employee();
		employee3.setEmpNo(101);
		employee3.setEmpName("Shyam");
		employee3.setEmpCity("Indore");
		employee3.setSalary(8000);
		System.out.println(employee3);

		List<Employee> list = new ArrayList<Employee>(); // Collection
		list.add(employee1); // Insertation
		list.add(employee2);
		list.add(employee3);
		System.out.println(list);

		// Traverse
		System.out.println("Traversing of Collection");
		for (int i = 0; i < list.size(); i++) {
			Employee emp = list.get(i);
			System.out.println(emp);
		}

		// forEach Loop
		for (Employee emp : list) {
			System.out.println(emp);
		}

		// Iterator
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Java8
		System.out.println("Java8");
		list.stream().forEach(t -> System.out.println(t));

	}

}
