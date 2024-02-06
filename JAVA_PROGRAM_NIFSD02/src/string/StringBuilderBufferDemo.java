package string;

public class StringBuilderBufferDemo {

	public static void main(String[] args) {

		// Non-Synchronized
		StringBuilder sb = new StringBuilder("Hi...");
		sb.append("How are you..!");
		sb.append("I am good");
		System.out.println(sb);

		// Synchronized
		StringBuffer sb1 = new StringBuffer("Hi...");
		sb1.append("How are you..!");
		sb1.append("I am good");
		System.out.println(sb1);

	}

}
