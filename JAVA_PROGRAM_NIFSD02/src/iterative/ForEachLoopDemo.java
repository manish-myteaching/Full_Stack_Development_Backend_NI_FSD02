package iterative;

import java.util.Arrays;
import java.util.List;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] city = { "Pune", "Mumbai", "Indore" };// Fixed
		List<String> list = Arrays.asList("Pune", "Mumbai", "Indore");

		/*
		 * int i=0; while(i<3) { System.out.println(city[i]); }
		 */

		/*
		 * int i=0; do { System.out.println(city[i]); i++; }while(i<3);
		 */

		/*
		 * for (int i = 1; i < 3; i++) { System.out.println(city[7]); }
		 */

		for (String s : list) {
			System.out.println(s);
		}

	}

}
