package string;

public class ImmutableDemo {

	public static void main(String[] args) {
		String str = "Welcome";
		String str1 = str + "To";
		String str2= str1.concat("Newgen"); 
		String str3 = new String(str2 + "Infotech"); 
		
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

	}

}
