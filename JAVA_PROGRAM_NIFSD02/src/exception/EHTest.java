package exception;

public class EHTest {

	public static void main(String[] args) {
		try {
			System.out.println("start");
			//int c = 10 / 0;
			//System.out.println("End");
			throw new ArithmeticException();
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}

		System.out.println("Last");
		System.out.println("Last");

	}

}
