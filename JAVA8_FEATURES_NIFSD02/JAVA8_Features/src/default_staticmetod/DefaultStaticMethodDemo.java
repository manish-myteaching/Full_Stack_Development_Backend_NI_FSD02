package default_staticmetod;

public interface DefaultStaticMethodDemo {
	void show();

	default void print() {
		System.out.println("print");
	}

	default void demo() {
		System.out.println("demo");
	}

	static void m() {
		System.out.println("m");
	}

	static void n() {
		System.out.println("n");
	}

}
