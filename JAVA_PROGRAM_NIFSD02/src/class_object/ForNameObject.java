package class_object;

public class ForNameObject {

	public static void show(String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Student fo = (Student) Class.forName(str).newInstance();
		System.out.println(fo);
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		show("class_object.Student");
	}

}
