package jump;

public class BreakLableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FIRST: for (int i = 0; i < 10; i++) {
			SECOND: for (int j = 0; j < 10; j++) {
				if (j == 5)
					break FIRST;
				System.out.println(j);
			}
		}
	}

}
