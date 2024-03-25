package sortingjava8;

public class ThreadDemoJava8 {

	public static void main(String... k) {

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});

		t.start();
	}
}
