package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	void m1() throws FileNotFoundException {

		m2();
		try {
			int c = 10 / 2; // Risk1
			int a[] = { 10, 20 };
			int e = a[4]; // Risk2
			System.out.println("M1 Within Try");
			FileInputStream fis = new FileInputStream("D://a.txt");// Risk3
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		} 
		System.out.println("M1");
	}

	void m2() {
		m3();
		System.out.println("M2");
	}

	void m3() {
		System.out.println("M3");
	}

	public static void main(String[] args) throws FileNotFoundException {
		ExceptionDemo2 ED = new ExceptionDemo2();
		ED.m1();
	}

}
