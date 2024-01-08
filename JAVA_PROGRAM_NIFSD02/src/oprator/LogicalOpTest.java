package oprator;

import java.lang.System;

public class LogicalOpTest {

	static int passingMarks = 33;
	static int subjectMarks = 100;

	public void getStudentStatus(int a, int b, int c) {
		if ((a >= 0 && a <= subjectMarks) && (b >= 0 && b <= subjectMarks) && (c >= 0 && a <= subjectMarks)) {
			boolean d = a >= passingMarks && b >= passingMarks && c >= passingMarks;
			if (d) {
				System.out.println("PASS");	
				getStudentAvrage(a, b, c);
			} else {
				System.out.println("FAIL");
			}
		} else {
			//System.out.println("Invalid input");
			new Exception("Invalid input").printStackTrace();
		}
	}

	public void getStudentAvrage(int a, int b, int c) {
		float d = a + b + c / 3;
		System.out.println(d);
	}

	public static void main(String[] args) {
		int a = 100, b = 75, c = 100;
		// int a = 77, b = 75, c = 23;
		// int a = 77, b = -75, c = 35;
		// int a = 77, b = 758, c = 35;
		LogicalOpTest lt = new LogicalOpTest();
		lt.getStudentStatus(a, b, c);
	}

}
