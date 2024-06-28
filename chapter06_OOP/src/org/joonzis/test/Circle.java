package org.joonzis.test;

import java.util.Scanner;

public class Circle {
//	- 필드 : radius, PI, name
	double radius;
	double PI = 3.14;
	String name;
	
//	- 메소드 : info
//	반지름, 이름, 크기(PI*R*R), 둘레(2*PI*R) 값 출력
	void info() {
		System.out.println("반지름 : " + radius);
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + (PI * radius * radius));
		System.out.println("둘레 : " + (PI * 2 * radius));
	}
	
	
}
