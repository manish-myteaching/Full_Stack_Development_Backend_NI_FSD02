package sortingjava8;

public class ThreadDemoRunnable implements Runnable {


	@Override
	public void run() {
		// Business Logic
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "===========>" + i );
		}

	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadDemoRunnable());
		thread1.start();

		Thread thread2 = new Thread(new ThreadDemoRunnable());
		thread2.start();

	}

}
