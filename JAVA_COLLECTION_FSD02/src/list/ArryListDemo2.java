package list;

import java.util.ArrayList;
import java.util.List;

public class ArryListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(10);// Primitive----->Integer(Autoboxing)----->Object(Upcasting)
		// list.add("A");// String------>Object(Upcasting)
		Integer x = list.get(0);
		System.out.println(x);

	}

}
