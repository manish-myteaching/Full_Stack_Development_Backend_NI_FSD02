package method_referance;

public class ThreadDemoJava8 {

	public static void createMethod() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		Thread t = new Thread(ThreadDemoJava8::createMethod);
		t.start(); // New Thread Start

		Thread t2 = new Thread(ThreadDemoJava8::createMethod);
		t2.start(); // New Thread Start

		Thread t3 = new Thread(ThreadDemoJava8::createMethod);
		t3.start(); // New Thread Start

		Thread t4 = new Thread(ThreadDemoJava8::createMethod);
		t4.start(); // New Thread Start
	}

}
