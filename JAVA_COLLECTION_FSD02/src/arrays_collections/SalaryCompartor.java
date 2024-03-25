package arrays_collections;

import java.util.Comparator;

public class SalaryCompartor implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		int s1 = emp1.getSalary();
		int s2 = emp2.getSalary();
		if (s1 < s2)
			return -1;
		else if (s1 > s2)
			return 1;
		else
			return 0;
	}

}
