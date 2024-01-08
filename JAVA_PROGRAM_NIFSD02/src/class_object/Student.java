package class_object;

public class Student {
	//Variables/fields
	int rollNumber;
	String studentName;

	//default constructor
	Student() {
	}
	
	//Parameterize constructor
	Student(int rollNum,String stuName) {
		rollNumber=rollNum;
		studentName=stuName;
	}

	//method 
	public void getStudentDetail() {
		System.out.println(rollNumber + " " + studentName);
	}

	//main method call by jvm
	public static void main(String[] args) {
		// object create
		Student student = new Student();
		//data access
		student.rollNumber=102;
		//method call
		student.getStudentDetail();
		Student student2 = new Student(101,"ABC");
		student2.rollNumber=104;
		student2.getStudentDetail();
	}

}
