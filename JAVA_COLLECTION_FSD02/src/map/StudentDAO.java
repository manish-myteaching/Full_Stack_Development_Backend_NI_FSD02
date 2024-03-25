package map;

//Ctrl + shift + o
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentDAO {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Map<String, Student> map = new HashMap();

		Student student1 = new Student("RG001", "John", 29);
		Student student6 = new Student("RG001", "Mohan", 29);
		Student student7 = new Student("RG001", "Kalesh", 29);
		Student student8 = new Student("RG001", "John", 40);
		Student student2 = new Student("RG002", "Alex", 30);
		Student student3 = new Student("RG003", "Commins", 29);
		Student student4 = new Student("RG004", "Butlar", 30);
		Student student5 = new Student("RG005", "Kohali", 33);
		map.put(student1.getRollNo(), student1);
		map.put(student2.getRollNo(), student2);
		map.put(student3.getRollNo(), student3);
		map.put(student4.getRollNo(), student4);
		map.put(student5.getRollNo(), student5);

		map.put(student6.getRollNo(), student6);
		map.put(student7.getRollNo(), student7);
		map.put(student8.getRollNo(), student8);
		// System.out.println(map);

		// Search
		Student student = (Student) map.get("RG005");
		System.out.println(student);

		// Traverse
		Set sett = map.entrySet();
		for (Object obj : sett) {
			Map.Entry ma = (Map.Entry) obj;
			// System.out.println(ma.getKey() + " ----------------" + ma.getValue());
		}

		Iterator i = sett.iterator();
		while (i.hasNext()) { // Check
			Map.Entry<String, Student> me = (Map.Entry) i.next();
			System.out.println(me.getKey() + "--------------> " + me.getValue());
		}

	}

}
