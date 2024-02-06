package oops.principle.inheritance3;

public class InstanceOfDemo {

	public static void main(String[] args) {
		A a = new D();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof D);
		System.out.println(a instanceof E);

	}

}
