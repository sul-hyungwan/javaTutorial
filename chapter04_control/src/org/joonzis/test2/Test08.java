package org.joonzis.test2;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int ans = 0;	// 입력 변수
		int count = 0;	// 카운트 변수
		int cor = 54;	// 정답 - 추후에 랜덤 값으로 대체
		
		while (true) {
			System.out.print("입력 >> ");
			ans = sc.nextInt();
			count++;
			
			if(ans < cor) {
				System.out.println("UP!!");
			}else if(ans > cor) {
				System.out.println("DOWN!!");
			}else {
				System.out.println("ANSWER!!");
				System.out.println(count+"회 만에 성공!");
				break;
			}
		}
		
		
		
		
		
		sc.close();
	}
}
