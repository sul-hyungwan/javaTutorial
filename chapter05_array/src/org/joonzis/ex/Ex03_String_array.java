package org.joonzis.ex;

import java.util.Scanner;

public class Ex03_String_array {
	public static void main(String[] args) {
		
		// 크기 3의 문자열 배열 names를 생성한 뒤
		// 스캐너로부터 입력 받아 데이터 저장 한 뒤
		// 배열 내 모든 요소를 "입력한 이름 : XX" 형식으로 출력
		
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		
		// 입력 for문
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 입력 >> ");
			names[i] = sc.next();
		}
		
		// 출력 for문
		for (String name : names) {
			System.out.println("입력한 이름 : " + name);
		}
		
		
		
		
		
		sc.close();
		
	}
}
