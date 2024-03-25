package optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[0]="A";
		Optional<String> s = Optional.ofNullable(str[0]);
		if (s.isPresent()) {
			System.out.println(str[0].toUpperCase());
		} else {
			System.out.println("Value is not present");
		}
	}

}
