package oprator;

public class ConditionalOpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 8, b = 7, c = 9;
		// int c=(a>b)?a:b;
		// int d=((a>b)&&(a>c)) ? a*a:c*c;

		int d = ((a > b) && (a > c)) ? a : (b < c) ? b : c;

		System.out.println(d);

	}

}
