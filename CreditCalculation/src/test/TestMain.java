package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {
	School javaHighSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();

		test.creatSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}
	
	public void creatSubject() {
		korean = new Subject(Define.KOREAN, "����");
		math = new Subject(Define.MATH, "����");
		dance = new Subject(Define.DANCE, "��");
		
		dance.setGradeType(Define.PF_TYPE);
		
		javaHighSchool.addSubject(korean);
		javaHighSchool.addSubject(math);
		javaHighSchool.addSubject(dance);
	}
	
	public void createStudent() {
		Student student1 = new Student("�ȼ���", 181213, korean);
		Student student2 = new Student("������", 181518, math);
		Student student3 = new Student("�̵�ȣ", 171230, korean);
		Student student4 = new Student("������", 171255, korean);
		Student student5 = new Student("������", 171590, math);
		
		javaHighSchool.addStudent(student1);
		javaHighSchool.addStudent(student2);
		javaHighSchool.addStudent(student3);
		javaHighSchool.addStudent(student4);
		javaHighSchool.addStudent(student5);
		
		korean.registor(student1);
		korean.registor(student2);
		korean.registor(student3);
		korean.registor(student4);
		korean.registor(student5);
		
		math.registor(student1);
		math.registor(student2);
		math.registor(student3);
		math.registor(student4);
		math.registor(student5);
		
		dance.registor(student1);
		dance.registor(student3);
		dance.registor(student5);
		
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student5, korean, 85);
		
		addScoreForStudent(student1, math, 56);
		addScoreForStudent(student2, math, 95);
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student4, math, 95);
		addScoreForStudent(student5, math, 56);
		
		addScoreForStudent(student1, dance, 90);
		addScoreForStudent(student3, dance, 70);
		addScoreForStudent(student5, dance, 50);
	}
	
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentNum(), subject, point);
		student.addSubjectScore(score);
	}
}
