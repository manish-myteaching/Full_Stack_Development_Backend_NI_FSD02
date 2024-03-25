package method_referance;

public class StaticMethodReferanceDemo {

	public static void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		Demo d = StaticMethodReferanceDemo::show;
		d.call();

	     Test t = StaticMethodReferanceDemo::show;
	     t.test();
	}

}
