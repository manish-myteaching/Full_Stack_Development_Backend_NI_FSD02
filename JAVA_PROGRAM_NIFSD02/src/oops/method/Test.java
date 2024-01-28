package oops.method;

public class Test extends MethodDemo {
	
	
	

	public static void main(String[] args) {
		Test test=new Test();
		test.show();	
		int c=test.add(10, 20);
		System.out.println(c);
	
	}

	@Override
	void show() {
		System.out.println("Test");
		
	}

}
