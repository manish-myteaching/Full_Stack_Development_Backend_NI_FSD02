package sortingjava8;

public class ThreadAnonymousDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());	
		Runnable runable=new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());			
			}		
		};
		
		Thread t=new Thread(runable);
		t.start();

	}

}
