package method_referance;

public class ArbitoryTypeDemo {

	public static void main(String[] args) {
		ADemo ad = String::toUpperCase;
		String s = ad.display("manish");
		System.out.println(s);

	}
}
