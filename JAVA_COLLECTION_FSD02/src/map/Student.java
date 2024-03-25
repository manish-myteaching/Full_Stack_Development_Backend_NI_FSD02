package map;

public class Student {
	private String rollNo;
	private String studentName;
	private int age;

	public Student(String rollNo, String studentName, int age) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		if (age > 0) {
			this.age = age;
		} else {
			throw new RuntimeException("age should be positive");
		}
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", age=" + age + "]";
	}
	
	

}
