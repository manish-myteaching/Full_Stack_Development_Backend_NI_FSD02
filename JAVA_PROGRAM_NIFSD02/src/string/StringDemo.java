package string;

public class StringDemo {

	public static void main(String[] args) {
		//char[] cha={'a','b'};
		
		String str="Welcome To Newgen";	
		String str1= str + "Infotech";
		String  str2 = new String("Welcome To Newgen");
		
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str == str2);

	}

}
