class Test {

	static public void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Employee emp = new Employee();
		emp.displayEmpDetails();

		Employee emp2 = new Employee();
		emp2.displayEmpDetails();

		Employee emp3 = new Employee();
		emp3.displayEmpDetails();
	}
}