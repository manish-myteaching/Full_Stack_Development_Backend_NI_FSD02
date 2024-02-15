package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		// Inseration
		list.add("Pune");
		list.add("Indore");
		list.add("Bangluru");
		list.add("Pune");
		list.add("Indore");
		list.add("Bangluru");
		list.add("Pune");
		list.add("Indore");
		list.add("Bangluru");
		list.add("Pune");
		list.add("Indore"); // 10
		list.add("Bangluru");// 11
		list.add(1);
		list.add(2);
		System.out.println(list);

		// search
		System.out.println(list.get(0)); 
		System.out.println(list.get(1));

		list.add(1, "Goa");
		System.out.println(list);

		// Remove
		list.remove(0);
		System.out.println(list);

		list.remove("Indore");
		System.out.println(list);

		// Traverse
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println(list.size());
	}

}
