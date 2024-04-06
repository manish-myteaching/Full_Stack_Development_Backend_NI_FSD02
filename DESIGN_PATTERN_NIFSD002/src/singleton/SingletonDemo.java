package singleton;

public class SingletonDemo implements Cloneable {

	private static SingletonDemo INSTANCE = null;

	private SingletonDemo() {

	}

	// factory method
	public static synchronized SingletonDemo getInstace() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonDemo();
		}
		return INSTANCE;
	}

	public void show() {
		System.out.println("show");
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Object is not able to clone");
	}

}
