package oops.principle.ploymorphism;

public abstract class ABParent {
	String str;
	abstract void display();

	void show() {
		System.out.println("Parent:Show");
	}

	void print() {
		System.out.println("Print");
	}
}
