package org.joonzis.ex;

import java.util.Scanner;

public class Ex06_break {
	public static void main(String[] args) {

		/*
		 * 1. 형식
		 * 
		 * while(true){ if(조건식){ break; } } 2. 특징 1) 반복문을 곧바로 종료한다.
		 */

		// 숫자 0 ~ 9 까지 화면에 출력
		int num = 0;
		while (true) {
			System.out.println(num);
			num++;
			break;
		}

		// id를 입력 받아서 id가 admin이면 "ID 일치" 출력 후 반복문 종료
		// 일치하지 않으면 "다시 입력하세요" 출력

		// 1. ID를 입력 받는다.
		// 2. id를 비교한다.
		// 3. 비교에 따라서 각 문자열을 출력한다.
		// 4. id가 일치하면 반복문을 종료한다.

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("id를 입력하세요 >> ");
			String id = sc.next();

			if (id.equals("admin")) {
				System.out.println("ID 일치");
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}

		sc.close();

	}
}
