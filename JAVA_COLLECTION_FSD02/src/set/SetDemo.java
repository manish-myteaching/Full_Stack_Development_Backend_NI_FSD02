package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String... k) {

		List list = new ArrayList();
		list.add("Pune");
		list.add("Mumbai");
		list.add("Dehli");
		list.add("Mumbai");
		System.out.println(list);
	

		Set set = new HashSet();
		set.add("Pune");
		set.add("Mumbai");
		set.add("Dehli");
		set.add("Mumbai");
		System.out.println(set);

		Set lset = new LinkedHashSet<>();
		lset.add("Pune");
		lset.add("Mumbai");
		lset.add("Dehli");
		lset.add("Mumbai");
		System.out.println(lset);

		Set tree = new TreeSet<>();
		tree.add("Pune");
		tree.add("Mumbai");
		tree.add("Dehli");
		tree.add("Mumbai");
		tree.add("Amarvati");
		tree.add("Bhopal");
		System.out.println(tree);

	}

}
