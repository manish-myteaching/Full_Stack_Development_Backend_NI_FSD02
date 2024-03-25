package boxing_unboxing;

public class BoxingAndUnBoxing {

	public static void main(String[] args) {
		Integer i = new Integer(10); // Boxing
		System.out.println(i.toString());
		int ii = i.intValue(); // Unboxing

		Integer j = 20; // Auto-Boxing
		int k = j;// Auto-Unboxing

		// integer --- String
		// String--Integer
		String s = "10"; // String
		int kk = Integer.parseInt(s);// int
	}

}
