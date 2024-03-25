package arrays_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortingDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "A", "Pune", 5000);
		Employee emp2 = new Employee(102, "B", "Banglure", 6000);
		Employee emp3 = new Employee(103, "BC", "Mumbai", 7000);
		Employee emp4 = new Employee(104, "DD", "Indore", 4000);
		Employee emp5 = new Employee(105, "AE", "Kolapur", 9000);

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp5);
		list.add(emp4);
		list.add(emp3);

		System.out.println(list);
		for (Employee e : list) {
			System.out.println(e);
		}
		Collections.sort(list, new EmpNoComparator());
		System.out.println(list);

		for (Employee e : list) {
			System.out.println(e);
		}
	}

}
