package exception;

public class ExceptionPropogationDemo {

	static void m1() throws InvalidArgumentException {
		System.out.println("M1-Start");
		m2();
		System.out.println("M1-End");
	}

	static void m2() throws InvalidArgumentException {
		System.out.println("M2-Start");
		m3();
		System.out.println("M2-End");
	}

	static void m3() throws InvalidArgumentException {
		System.out.println("M3-Start");
		display("Ramesh"); // Logic Break
		System.out.println("M3-End");
	}

	static void display(String name) throws InvalidArgumentException {
		if (name.equals("Manish")) {
			System.out.println(name);
		} else {
			throw new InvalidArgumentException("Name is not Allowed");
		}
		System.out.println("Display End");
	}

	public static void main(String[] args) {
		
			try {
				m1();
			} catch (InvalidArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("End-Main");
	}

}
