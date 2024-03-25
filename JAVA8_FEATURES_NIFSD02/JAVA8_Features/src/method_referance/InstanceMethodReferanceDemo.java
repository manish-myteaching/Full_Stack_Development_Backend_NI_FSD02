package method_referance;

public class InstanceMethodReferanceDemo {

	void print() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		Demo demo = new InstanceMethodReferanceDemo()::print;
		demo.call();
		
		Test test= new InstanceMethodReferanceDemo()::print;
		test.test();
	}

}
