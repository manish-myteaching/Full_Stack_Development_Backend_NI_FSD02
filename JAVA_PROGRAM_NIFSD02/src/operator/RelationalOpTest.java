package operator;

public class RelationalOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 7;

		boolean c = (a - b) < (a + b);
		if (c) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		System.out.println(a == 5);

	}

}
