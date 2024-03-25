package arrays_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(32); // Autoboxing
		al.add(90);
		al.add(99);
		al.add(89);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
