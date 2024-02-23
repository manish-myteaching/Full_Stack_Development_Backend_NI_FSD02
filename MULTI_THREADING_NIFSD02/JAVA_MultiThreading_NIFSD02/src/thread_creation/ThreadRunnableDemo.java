package thread_creation;

public class ThreadRunnableDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println("Child");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable r = new ThreadRunnableDemo();
		Thread t = new Thread(r);
		t.start(); // New Thread Create
		for (int i = 1; i <= 1000; i++) {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName());
			System.out.println("Parent");
		}
	}

}
