package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyDemo {

	public static void show() {
		try {
			FileInputStream fis = new FileInputStream("D://abc.txt");
			System.out.println("ABC");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally");
		}

		System.out.println("Show End");
	}

	public static void main(String[] args) {
		show();
	}

}
