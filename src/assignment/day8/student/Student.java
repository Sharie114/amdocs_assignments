package assignment.day8.student;

public class Student {

	 String name;
	 int studentId;

	public Student(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String toString() {
		return "Student Name : " + name + " Student Id: " + studentId;
	}
	 
}
