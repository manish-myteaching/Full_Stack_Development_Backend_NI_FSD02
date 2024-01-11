package array;

public class ArrayDemo3 {
	public static void main(String[] args) {
		String[] city = new String[100];
		city[0]="Pune";
		city[1]="Mumbai";
		for (int cityVar = 0; cityVar < city.length; cityVar++) {
			System.out.println(cityVar +"    "+city[cityVar]);
		}
	}
}
