package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List list = new LinkedList();
		// Inseration
		list.add("Pune");
		list.add("Indore");
		list.add("Bangluru");
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

		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println(list.size());
	}

}
