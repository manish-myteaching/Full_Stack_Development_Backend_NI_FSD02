package oops.constuctor;

public class ConstuctorDemo {
	int a;
	String str;
   
	
	 ConstuctorDemo() {   
		this.a = 0;
		this.str = null;
	}

	ConstuctorDemo(int a, String str) {
		this.a = a;
		this.str = str;
	}

	void show() {
		System.out.println(a + "  " + str);
	}

	public static void main(String... k) {
		ConstuctorDemo cd = new ConstuctorDemo();
		cd.show();
		ConstuctorDemo cd2 = new ConstuctorDemo(101, "manish");
		cd2.show();
		ConstuctorDemo cd3 = new ConstuctorDemo();
	}

}
