import java.util.Scanner;
import static java.lang.Integer.parseInt;

 class Employee {
	
	 static private  final int eno = 111;
	
    String ename = "Manish Verma";
	float esal = 50000.0f;
	String eemail = "Manish.Verma@gmail.com";
	String emobile = "91-9988776655";
	String eaddr = "202/3rt,PS Road, Aundh, Pune-38";
	static String companyName= "Infosys";

	public void displayEmpDetails() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill some Details");
        String empNo= scanner.next();
        System.out.println("Number" + empNo);

        
        
	    System.out.println(empNo);
		System.out.println("Employee Details");
		System.out.println("---------------------------");
		System.out.println("Employee Number : " + eno);// Employee Number : 111
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esal);
		System.out.println("Employee Email Id : " + eemail);
		System.out.println("Employee Mobile No : " + emobile);
		System.out.println("Employee Address : " + eaddr);
		System.out.println("Employee Address : " + companyName);
	}
}