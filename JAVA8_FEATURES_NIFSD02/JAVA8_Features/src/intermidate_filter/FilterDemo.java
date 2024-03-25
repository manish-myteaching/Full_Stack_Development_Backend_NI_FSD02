package intermidate_filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 5, 7, 8, 66, 77, 9, 14, 16, 19);
		
		System.out.println("Life WithOut java8");
		List<Integer> list2 = new ArrayList();
		for (Integer i : list) {
			if (i >= 5) {
				list2.add(i);
			}
		}
		Collections.sort(list2);
		for(Integer i:list2) {
			System.out.println(i);
		}
		
		System.out.println("Life With java8");
		list.stream().filter(t -> t >= 5).sorted().forEach(System.out::println);
	}
}
