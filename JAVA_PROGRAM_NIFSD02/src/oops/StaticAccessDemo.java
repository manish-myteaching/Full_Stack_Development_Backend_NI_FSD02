package oops;

public class StaticAccessDemo {
	int empNo;
	public final static String str = "Newgen";
	
	static Printer ptr;

	public void getEmpDetail() {
		System.out.println("Emp Detail: " + empNo + "\t" + str);
	}

	public static void main(String[] args) {
		StaticAccessDemo sad = new StaticAccessDemo();
		// System.out.println(sad.empNo);
		sad.empNo = 101;
		System.out.println(sad.empNo);
		// sad.str = "TCS";
		System.out.println(StaticAccessDemo.str);
		sad.getEmpDetail();

		StaticAccessDemo sad2 = new StaticAccessDemo();
		sad2.empNo = 102;
		System.out.println(sad2.empNo);
		System.out.println(StaticAccessDemo.str);
		sad2.getEmpDetail();

		StaticAccessDemo sad3 = new StaticAccessDemo();
		sad3.empNo = 103;
		System.out.println(sad3.empNo);
		System.out.println(StaticAccessDemo.str);
		sad3.getEmpDetail();

		Printer.getPrint("Manish");
		Printer.getPrint("Rajesh");
	}

}
