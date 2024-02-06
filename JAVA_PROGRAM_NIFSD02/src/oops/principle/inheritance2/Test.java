package oops.principle.inheritance2;

public class Test {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		

		Parent parent2 = new Child(); // Upcasting	
		Child child2= (Child)parent2;  // Downcasting
		
	}

}
