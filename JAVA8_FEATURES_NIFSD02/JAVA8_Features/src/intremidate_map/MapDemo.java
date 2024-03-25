package intremidate_map;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 5, 7, 8, 66, 77, 9, 14, 16, 19);
		list.stream().map(e -> e * 2).forEach(e -> System.out.println(e));
	}

}
