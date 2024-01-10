package statement;

public class SwitchStatementDemo2 {
	public static void main(String... k) {
		byte a = 4;
		switch (a) {
		case 5 % 2:
			System.out.println(++a);
			break;
		case 5 / 2:
			System.out.println(--a);
			break;
		default:
			System.out.println("Default");
		}
	}
}
