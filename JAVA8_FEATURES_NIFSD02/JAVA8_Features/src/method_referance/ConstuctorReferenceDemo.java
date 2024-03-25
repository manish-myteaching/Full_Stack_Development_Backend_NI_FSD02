package method_referance;

public class ConstuctorReferenceDemo {

	ConstuctorReferenceDemo() {
		System.out.println("ConstuctorReferenceDemo");
	}

	public static void main(String[] args) {
		Demo d = ConstuctorReferenceDemo::new;
		d.call();

	}

}
