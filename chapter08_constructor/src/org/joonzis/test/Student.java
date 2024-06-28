package org.joonzis.test;

public class Student {
	String name ,dept;
	Grade grade;
	
	public Student() {}
	public Student(String name, String dept, Grade grade) {
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}
	void output() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 학과 : " + dept);
		System.out.println("학생 평균 : " + grade.getAverage());
		System.out.println("학생 학점 : " + grade.getGrade());
		
		
	}
}
