package org.joonzis.ex;

public class Ex03_Student {
	/*
	 * 필드
	 * String name, dept, score1, score2
	 * double average
	 * boolean isPass
	 * 
	 * 메소드
	 * 생성자
	 * getAverage() => 평균 리턴
	 * getPagee() => 평균이 80 이상이면 true 아니면 false 리턴
	 * output() => 이름, 학과, 평균, 합격 유무 출력
	 */
	String name, dept, score1, score2;
	double average;
	boolean isPass;
	
	public Ex03_Student() {}
	public Ex03_Student(String name, String dept, String score1, String score2) {
		this.name = name;
		this.dept = dept;
		this.score1 = score1;
		this.score2 = score2;
		this.average = 
				(Double.parseDouble(score1) + 
						Double.parseDouble(score2)) / 2.0;
		this.isPass = (average >= 80) ? true : false;
	}
	double getAverage() {
		return average;
	}
	boolean getPass() {
		return isPass;
	}
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 " + dept);
		System.out.println("평균 : " + getAverage());
		System.out.println("합격유무 : " + (isPass ? "합격" : "불합격"));
	}
	
	
	
	
	
}
