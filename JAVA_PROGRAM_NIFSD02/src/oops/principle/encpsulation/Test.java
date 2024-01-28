package oops.principle.encpsulation;

public class Test {
	public static void main(String[] args) throws Exception {
		Encapsulation en= new Encapsulation();
		en.setEmpSalary("5000");
		en.setEmpNo(101);
		en.setAge(500);
		
		System.out.println(en.getEmpNo() + " "+en.getEmpSalary());
	}
}
