package org.joonzis.test2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
//		Test07.java
//		Q.두 정수를 입력 받아 두 정수 사이의 모든 정수의 합계 출력하기
//		    입력 순서와 무관하게 동일한 결과를 출력 
//		 	실행 예1)
//			첫 번째 정수 >> 1
//			두 번째 정수 >> 10
//			1부터 10까지 모든 정수의 합은 55입니다.
//			실행 예2)
//			첫 번째 정수 >> 10
//			두 번째 정수 >> 1
//			1부터 10까지 모든 정수의 합은 55입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int fir = 0;	// 첫 번째 값
		int sec = 0; 	// 두 번째 값
		int sum = 0;	// 합계
		int tmp = 0;	// 값 교환을 위한 임시 변수
		
		// 1. 입력
		System.out.print("첫 번째 숫자 입력 >> ");
		fir = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		sec = sc.nextInt();
		
		// 2. 두 값 비교
		// fir > sec 상황
		if(fir > sec) {
			// ex ) 5 , 1
			tmp = fir;
			fir = sec;
			sec = tmp;
		}
		for (int i = fir; i <= sec; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		sc.close();
		
		
		
		
	}
}	
