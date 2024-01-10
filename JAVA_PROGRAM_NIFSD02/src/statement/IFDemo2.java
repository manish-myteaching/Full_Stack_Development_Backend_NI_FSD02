package statement;

public class IFDemo2 {

	public static void main(String[] args) {
		int a = 5, b = 6;
		if (a++ >b)
			System.out.println(a++);
		System.out.println(++a);
	}

}
