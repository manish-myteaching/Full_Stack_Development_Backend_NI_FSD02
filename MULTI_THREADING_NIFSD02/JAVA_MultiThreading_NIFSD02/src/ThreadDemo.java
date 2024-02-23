
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setName("First Thread");
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}

}
