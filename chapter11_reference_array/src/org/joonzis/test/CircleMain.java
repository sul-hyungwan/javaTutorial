package org.joonzis.test;

import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		// 1. 고정 객체 생성
//		Circle cir1 = new Circle(1.54);
//		Circle cir2 = new Circle(3.14);
//		Circle cir3 = new Circle(45);
//		
//		cir1.output();
//		cir2.output();
//		cir3.output();
		
		// 2. 배열 이용(1)
		Circle[] circles = new Circle[3];
		circles[0] = new Circle(3);
		circles[1] = new Circle(4);
		circles[2] = new Circle(5);
		
		circles[0].output();
		circles[1].output();
		circles[2].output();
		
		// 3. 배열 이용(2)
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < circles.length; i++) {
			System.out.print("반지름 입력 >> ");
			double r = sc.nextDouble();
			circles[i] = new Circle(r);
		}
		for (int i = 0; i < circles.length; i++) {
			circles[i].output();
		}
		
		// 가장 큰 원 .. 원의 크기, 인덱스 번호
		// 최대 값 구하기
		double max = circles[0].calcArea();
		int idx = 0;
		for (int i = 0; i < circles.length; i++) {
			if(max < circles[i].calcArea()) {
				max = circles[i].calcArea();	// 가장 큰 원의 크기
				idx = i;						// 가장 큰 원의 인덱스
			}
		}
		
		System.out.println("가장 큰 원의 인덱스 번호 : " + idx);
		System.out.println("가장 큰 원의 크기 : " + max);
		System.out.println("가장 큰 원의 정보");
		circles[idx].output();
		
		
		
		
		
		
		
		
		
	}
}
