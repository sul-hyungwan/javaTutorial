package org.joonzis.test;
//- 필드 : width, height
//- 메소드 : init(너비, 높이 입력), info(너비, 높이, 크기(calcArea) 출력), 
//calcArea(w*h, 넓이계산(크기) 출력)

import java.util.Scanner;

public class Rect {
	// 필드
	int width;
	int height;
	int size;
	
	// 메소드
	void init() {
		Scanner sc = new Scanner(System.in);
		System.out.print("너비 입력 >> ");
		width = sc.nextInt();
		System.out.print("높이 입력 >> ");
		height = sc.nextInt();
		size = width * height;
	}
	void info() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + size);
	}
}






