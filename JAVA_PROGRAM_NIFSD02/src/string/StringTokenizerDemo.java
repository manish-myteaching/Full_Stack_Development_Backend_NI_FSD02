package string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Welcome to Java");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
