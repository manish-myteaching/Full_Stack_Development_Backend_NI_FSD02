package oops.principle.encpsulation;

public class Test {
	public static void main(String[] args)  {
		Encapsulation en= new Encapsulation();
		en.setEmpSalary("5000");
		try {
			en.setEmpNo(101);
			en.setAge(500);
		} catch (InvalidArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	
		System.out.println(en.toString());
		System.out.println(en.equals(en));
	}
}
