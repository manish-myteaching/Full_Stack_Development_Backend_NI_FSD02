package sortingjava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

		// Anonymous
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.compareTo(o2);
			}
		});

		// Lambdaa
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));

		for (Employee e : list) {
			System.out.println(e);
		}
	}

}
