package org.joonzis.test;

import java.util.Scanner;

class Triangle{
	//- 필드 : width, height
	int width;
	int height;
	
	//- 메소드
	double calcArea() {
		// w*h/2 넓이계산 후 리턴
		return (width * height / 2.0);
	}
	void init() {
		// 너비, 높이 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("너비 입력 >> ");
		width = sc.nextInt();
		System.out.print("높이 입력 >> ");
		height = sc.nextInt();
	}
	void info() {
		// 너비, 높이, 크기 출력
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea() );
	}

}
public class TriangleMain {
	public static void main(String[] args) {
		Triangle semo = new Triangle();
		semo.init();
		semo.info();
	}
}





