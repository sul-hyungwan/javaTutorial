package org.joonzis.ex;

import java.util.Scanner;

public class Ex03_StudentManager {
	int idx;	// 외부(전역)에서 접근 가능한 인덱스
	Ex03_Student[] arr;
	Scanner sc = new Scanner(System.in);
	
	// 생성자 - 몇 명의 학생을 관리할지 - 배열 크기 선언
	public Ex03_StudentManager() {}
	public Ex03_StudentManager(int numOfStudents) {
		arr = new Ex03_Student[numOfStudents];
	}
	
	// 학생 정보를 저장한 뒤 학생 객체 리턴
	Ex03_Student input() {
		System.out.print("학생 이름 >> ");
		String name = sc.next();
		System.out.print("학생 학과 >> ");
		String dept = sc.next();
		System.out.print("중간 점수 >> ");
		String score1 = sc.next();
		System.out.print("기말 이름 >> ");
		String score2 = sc.next();
		Ex03_Student stu = new Ex03_Student(name, dept, score1, score2); 
		return stu;
	}
	
	// 위 메소드에서 받은 학생 객체를 배열에 저장
	void addNewStudent(Ex03_Student student) {
		arr[idx] = student;
		idx++;
	}
	
	// 전체 학생 정보 출력
	void outputAllStudents() {
		for(int i = 0; i < idx; i++) {
			System.out.println((i+1) + "번 학생 정보 ------");
			arr[i].output();
		}
	}
	// 학생 전체의 평균 점수 출력
	void outputAverage() {
		double total = 0;
		for(int i = 0; i < idx; i++) {
			total += arr[i].getAverage();
		}
		System.out.println("*** 전체 평균 : " + (total / idx));
	}
	// 특정 학생을 찾는 메소드
	Ex03_Student findStudent() {
		System.out.print("찾을 학생의 이름 이름 >> ");
		String name = sc.next();
		for(int i = 0; i < idx; i++) {
			if(arr[i].name.equals(name)) {
				return arr[i]; 
			}
		}
		return null;
	}
	
	// 학생 정보를 전달 받아 출력하는 메소드
	void output(Ex03_Student student) {
		if(student == null) {
			System.out.println("찾는 학생이 없습니다.");
		}else {
			student.output();
		}
	}
	
	
	
	
	
	
	
	
}
