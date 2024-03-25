package arrays_collections;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		String name1 = emp1.getEmpName();
		String name2 = emp2.getEmpName();
		return name1.compareTo(name2);
	}

}
