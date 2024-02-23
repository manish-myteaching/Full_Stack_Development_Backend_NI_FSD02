package thread_creation;

public class ThreadAnonymousClass {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
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
				}
			}
		};

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
		};
		
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
		};

		new Thread(r).start();
		new Thread(r1).start();
		new Thread(r3).start();
	}

}
