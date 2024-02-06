package string;

public class StringBuilderDemo2 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("SELECT * FROM EMPLOYEE");
		sb.append("WHERE ENP No=" + "101");
		sb.append("AND ENP Name=" + "RAM");
	}

}
