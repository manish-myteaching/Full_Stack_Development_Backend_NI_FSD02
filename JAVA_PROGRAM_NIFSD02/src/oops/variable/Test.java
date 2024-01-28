package oops.variable;

public class Test {

	public static void main(String... k) {
		VariableDemo vd = new VariableDemo();
		// vd.a=20;
		System.out.println("Non static " + vd.a);
		System.out.println("static " + vd.aa);	
		
		ChildVariableDemo cd=new ChildVariableDemo();
		int t=cd.a;
	}

}
