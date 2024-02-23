package thread_creation;

public class ThreadDemo extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		td.start();// Thread Start
		System.out.println(Thread.currentThread().getName());
	}

}
