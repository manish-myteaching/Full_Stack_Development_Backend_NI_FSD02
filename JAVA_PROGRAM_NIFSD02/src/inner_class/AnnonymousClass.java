package inner_class;

interface A {
	void show();

	void print();
}

public class AnnonymousClass {

	public static void main(String[] args) {
		A ac = new A() {
			@Override
			public void show() {
				System.out.println("show");
			}

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("print");

			}
		};
		ac.show();
	}

}
