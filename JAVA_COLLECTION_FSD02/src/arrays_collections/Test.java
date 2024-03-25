package arrays_collections;

public class Test {

	public static void main(String[] args) {
		String s="ABC";
		String s2="AXU";
		System.out.println(s2.compareTo(s));
		
		Employee emp1 = new Employee(101, "A", "Pune", 5000);
		Employee emp2 = new Employee(102, "B", "Banglure", 6000);
		System.out.println(emp1.compareTo(emp1));
	}

}
