package oops.principle.ploymorphism;

public class MethodOveloading {

	int show(int a) {
		return a;
	}

	void print(short a) {
		System.out.println("Short: " + a);
	}

	void print(int a) {
		System.out.println("Integer: " + a);
	}

	void print(long a) {
		System.out.println("long: " + a);
	}

	void print(int a, int b) {
	}

	void print(String s) {
	}

	void print(Boolean b) {
	}

	void display(String str) {
		System.out.println("String: " + str);
	}

	void display(Object ob) {
		System.out.println("Object: " + ob);
	}

	static void demo() {
	}

	static int demo(int a, int b) {
		return b;
	}

	static void demo(String str) {
	}

	public static void main(String... k) {
		MethodOveloading mo = new MethodOveloading();
		mo.print(10);
		mo.display(null);
	}
}
