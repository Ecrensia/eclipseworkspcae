package school;

import java.util.ArrayList;

public class School {
	private static School instance = new School();
	
	private static String SCHOOL_NAME = "JAVA HIGH SCHOOL";
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	private School() {};
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void setStudentList() {
		this.studentList = studentList;
	}
	
	public ArrayList<Subject> getSubjectList(){
		return subjectList;
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	public void setSubjectList() {
		this.subjectList = subjectList;
	}
}