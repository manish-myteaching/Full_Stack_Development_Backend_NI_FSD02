package oops.principle.ploymorphism;

public class BMW implements Car {

	@Override
	public void showSpeed() {
		System.out.println("120 KM/H");
	}

	@Override
	public void showSpeed(String str) {
		if (str.equals("SIDDAN")) {
		} else {
		}
	}

}
