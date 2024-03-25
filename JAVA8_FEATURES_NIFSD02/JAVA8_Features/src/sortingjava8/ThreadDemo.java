package sortingjava8;

public class ThreadDemo extends Thread {

	public void run() { //PSVM
		// Business Logic
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "===========>" + i);
		}
	}

	public static void main(String[] args) { // Main Thread
		System.out.println(Thread.currentThread().getName());
		ThreadDemo t1 = new ThreadDemo();
		t1.start(); // T1

		ThreadDemo t2 = new ThreadDemo();
		t2.start(); // T2

	}

}
