package org.joonzis.test;

import java.util.Scanner;

//클래스 Student
//- 필드 :
//String name, String dept, String score1, String score2
//double average
//boolean isPass(합격 유무) : 평균 점수가 80점 이상 true, 80점 미만 false
//- 메소드 : 
//input : name, dept, score1, score2 콘솔입력, 평균 및 패스 유무 확인
//output : name, dept, average, isPass ("합격","불합격")
public class Student {
	// 필드
	String name, dept, score1, score2;
	double average;
	boolean isPass;
	
	// 메소드
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 >> ");
		name = sc.next();
		System.out.print("학과 입력 >> ");
		dept = sc.next();
		System.out.print("중간 점수 입력 >> ");
		score1 = sc.next();
		System.out.print("기말 점수 입력 >> ");
		score2 = sc.next();
		average = (Double.parseDouble(score1) + Double.parseDouble(score2)) / 2.0;
		isPass = average >= 80 ? true : false;
	}
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + average);
		System.out.println(isPass ? "합격" : "불합격");
	}
	
	
	
}
