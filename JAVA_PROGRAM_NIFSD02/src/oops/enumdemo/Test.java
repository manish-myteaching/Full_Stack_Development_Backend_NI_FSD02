package oops.enumdemo;

public class Test {
	public static void main(String... k) {
		Enum2[] e = Enum2.values();
		for (Enum2 ee : e) {
			System.out.println(ee + " "+ee.get());
		}
	}
}
