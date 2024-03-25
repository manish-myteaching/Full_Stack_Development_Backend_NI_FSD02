package intermidate_filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Java8StudentDemo {

	public static int sortEmpId(Student s1, Student s2) {
		if (s1.getStudentRollNo() > s2.getStudentRollNo())
			return 1;
		else if (s1.getStudentRollNo() < s2.getStudentRollNo())
			return -1;
		return 0;
	}

	public static int sortEmpName(Student s1, Student s2) {
		return s1.getStudentName().compareToIgnoreCase(s2.getStudentName());
	}

	public static boolean markCondition(Student stu) {
		if (stu.getMarks() >= 80)
			return true;
		return false;
	}

	public static void main(String[] args) {

		List<Student> listStudent = new ArrayList<>();
		listStudent.add(new Student(110, "XYZ", 87));
		listStudent.add(new Student(101, "Ramesh", 75));
		listStudent.add(new Student(102, "Ram", 70));
		listStudent.add(new Student(103, "Divya", 80));
		listStudent.add(new Student(108, "Dev", 90));
		listStudent.add(new Student(111, "Ramesh", 75));
		listStudent.add(new Student(109, "Ram2", 60));
		listStudent.add(new Student(105, "Divya2", 90));
		listStudent.add(new Student(106, "Dev2", 70));

		// Filter + Sorting With Lambdaa Expression
//		listStudent.stream().filter(student -> student.getMarks() >= 80).sorted((o1, o2) -> {
//			if (o1.getStudentRollNo() > o2.getStudentRollNo())
//				return 1;
//			else if (o1.getStudentRollNo() < o2.getStudentRollNo())
//				return -1;
//			return 0;
//		}).forEach(stu -> System.out.println(stu));

		// Filter + Sorting with Method Reference

		listStudent.stream().filter(Java8StudentDemo::markCondition).sorted(Java8StudentDemo::sortEmpId)
				.forEach(stu -> System.out.println(stu));

		listStudent.stream().filter(Java8StudentDemo::markCondition).sorted(Java8StudentDemo::sortEmpName)
				.forEach(stu -> System.out.println(stu));
	}
	// Minimum
	/*
	 * Optional<Student> student = listStudent.stream().min((o1, o2) -> { if
	 * (o1.getMarks() > o2.getMarks()) return 1; else if (o1.getMarks() <
	 * o2.getMarks()) return -1; return 0; }); if (student.isPresent()) {
	 * System.out.println(student.get()); }
	 */

}
