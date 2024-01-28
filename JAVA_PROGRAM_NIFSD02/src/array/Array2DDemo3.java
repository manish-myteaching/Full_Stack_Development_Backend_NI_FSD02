package array;

public class Array2DDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 10, 20, 30 }, { 20, 20, 40 }, { 20, 50, 30 } };
		
		for(int b[]:a) {
			for(int c:b) {
				System.out.print(c+"\t");
			}
			System.out.println("");
		}
		
		

	}

}
