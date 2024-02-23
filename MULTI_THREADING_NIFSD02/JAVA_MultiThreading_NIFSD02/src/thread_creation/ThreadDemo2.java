package thread_creation;

public class ThreadDemo2 extends Thread {

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Child");
		}
	}

	public static void main(String[] args) {
		ThreadDemo2 td = new ThreadDemo2();
		td.start();
		for (int i = 1; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Parent");
		}

	}

}
