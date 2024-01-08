package statement;

public class IfElseifElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int percentage = 99;
		if (percentage > 90) {
			System.out.println("A");
		} else if (percentage <= 90 && percentage >= 75) {
			System.out.println("B");
		} else if (percentage <= 75 && percentage >= 60) {
			System.out.println("C");
		} else if (percentage <= 35 && percentage >= 60) {
			System.out.println("D");
		} else {
			System.out.println("Failed");
		}
	}

}
