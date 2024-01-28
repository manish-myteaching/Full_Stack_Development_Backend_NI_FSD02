package oops;

public class DataAccessDemo {

	int a; // Object create
	static int b; // Loading Time // One time

	DataAccessDemo() {
		this.a = 5;
		DataAccessDemo.b = 6;
	}

	void show() {
		System.out.println(this.a);
		System.out.println(DataAccessDemo.b);
	
	}

	static void print() {
		System.out.println(DataAccessDemo.b);
	}

	public static void main(String... k) {
		DataAccessDemo da = new DataAccessDemo();
		System.out.println(da.a);

		DataAccessDemo da2 = new DataAccessDemo();
		System.out.println(da2.a);

		DataAccessDemo da3 = new DataAccessDemo();
		System.out.println(da3.a);
	}

}
