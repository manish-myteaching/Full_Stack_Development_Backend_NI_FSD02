package intermidate_filter;

public class Student {
	private int studentRollNo;
	private String studentName;
	private int marks;

	public Student(int studentRollNo, String studentName, int marks) {
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
	
}
