package oops.principle.ploymorphism;

public class ABChild extends ABParent {

	@Override
	void display() {
		System.out.println("Display");
	}
	
	void show() {
		System.out.println("Child:Show");
	}
}
