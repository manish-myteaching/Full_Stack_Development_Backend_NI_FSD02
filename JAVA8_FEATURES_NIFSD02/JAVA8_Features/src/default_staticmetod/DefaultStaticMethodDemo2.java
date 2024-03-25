package default_staticmetod;

public interface DefaultStaticMethodDemo2 {
	void show();

	default void print() {
		System.out.println("print2");
	}

	default void demo() {
		System.out.println("demo2");
	}

}
