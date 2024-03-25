package thread_creation;

public class Test {

	static void show() {
		System.out.println("show");
	}

	static void print() {
		show();
		System.out.println("print");
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		print();
	}

}
