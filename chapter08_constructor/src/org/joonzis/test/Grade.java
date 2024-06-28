package org.joonzis.test;

public class Grade {
	int kor, eng, mat;
	double average;
	char grade;
	
	public Grade() {}
	public Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.average = (kor + eng + mat) / 3.0;
		if(average >= 90) {
			grade = 'A';
		}else if(average >= 80) {
			grade = 'B';
		}else if(average >= 70) {
			grade = 'c';
		}else if(average >= 60) {
			grade = 'D';
		}else{
			grade = 'F';
		}
	}
	double getAverage() {
		return average;
	}
	char getGrade() {
		return grade;
	}
	
	
	
	
}
