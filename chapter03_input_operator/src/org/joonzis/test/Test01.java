package org.joonzis.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		Test01.java
//		Q. 두 정수를 입력받아 a, b에 저장한 뒤 두 변수의 값을 교환하는 프로그램 구현
//			* 임시 변수 필요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 값 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 값 : ");
		int b = sc.nextInt();
		
		System.out.println("변환 전의 a의 값 : " + a);
		System.out.println("변환 전의 b의 값 : " + b);
		
		int tmp = a;	// 임시 변수
		a = b;
		b = tmp;
		
		System.out.println("변환 후의 a의 값 : " + a);
		System.out.println("변환 후의 b의 값 : " + b);
		
		
		
		sc.close();
		
	}
}
