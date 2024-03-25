package inner_class;

public class NestedTopClassDemo {

	static class Test {
		void show() {
			System.out.println("Nested Top level class");
		}
	}

	public static void main(String... k) {
		// NestedTopClassDemo.Test.show();
		NestedTopClassDemo.Test test = new NestedTopClassDemo.Test();
		test.show();
	}

}
