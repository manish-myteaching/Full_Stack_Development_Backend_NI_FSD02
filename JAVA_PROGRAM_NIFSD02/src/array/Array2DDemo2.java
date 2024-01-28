package array;

public class Array2DDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][4];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[0][3] = 4;

		a[1][0] = 1;
		a[1][1] = 2;
		a[1][2] = 3;
		a[1][3] = 4;

		a[2][0] = 1;
		a[2][1] = 2;
		a[2][2] = 3;
		a[2][3] = 4;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}
