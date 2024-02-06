package exception;

public class ErrorDemo {

	static int i = 0;

	static void show() {
		System.out.println(i);
		show();
		
	}

	public static void main(String[] args) {
		show();
	}

}
