package exception;

public class UserDefinedTest {

	public static void main(String[] args) {
		LogicDemo ld = new LogicDemo();
		try {
			ld.show();
		} catch (Exception ec) {
			System.out.println(ec);
		}
		System.out.println("End");

	}

}
