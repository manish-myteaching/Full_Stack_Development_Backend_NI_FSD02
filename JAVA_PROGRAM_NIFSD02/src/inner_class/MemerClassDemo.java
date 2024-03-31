package inner_class;

public class MemerClassDemo {

	class Test {
		void show() {
			System.out.println("Nested Top level class");
		}
	}

	public static void main(String[] args) {
		MemerClassDemo memerClassDemo = new MemerClassDemo();
		MemerClassDemo.Test test = memerClassDemo.new Test();
		test.show();

		MemerClassDemo.Test test2 = new MemerClassDemo().new Test();
		test2.show();

	}

}
