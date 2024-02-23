package lambaa;

public class AnonymousDemo {
	public static void main(String[] args) {
		A a = new A() {
			@Override
			public void show() {
				System.out.println("show");
			}

			@Override
			public void print() {
				System.out.println("print");
			}
		};
		a.show();
		a.print();
	}
}
