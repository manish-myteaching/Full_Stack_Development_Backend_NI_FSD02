package string;

public class StringDemo2 {

	public static void main(String[] args) {
		String s = "Hi"; // CP
		String s1 = "Hi"; // CP
		String s2 = "Hi";// CP
		String s3 = new String("Hi"); // CP + Heap Area

		//System.out.println(s == s1);
		//System.out.println(s1 == s2);
		
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));

	}

}
