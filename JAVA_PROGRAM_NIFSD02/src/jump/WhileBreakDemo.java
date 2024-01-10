package jump;

public class WhileBreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<10) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
