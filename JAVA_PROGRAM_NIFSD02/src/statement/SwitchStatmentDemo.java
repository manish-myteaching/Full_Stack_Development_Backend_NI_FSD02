package statement;

public class SwitchStatmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		switch (a) {
		case 1:
			System.out.println(++a);
			break;
		case 2:
			System.out.println(a++);
			break;
		case 3:
			System.out.println(--a);
			break;
		default:
			System.out.println(a);
			break;
		}

	}

}
