package org.joonzis.test;

public class StudentGradeMain {
	public static void main(String[] args) {
		
		Grade g = new Grade(70, 80, 90);
		Student stu = new Student("김씨", "컴공", g);
		stu.output();
		
		
	}
}
