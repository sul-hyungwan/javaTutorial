package org.joonzis.test;

public class Test02 {
	public static void main(String[] args) {
//		Test02.java
//		Q. 필기와 실기 점수를 입력 받아 합격 유무 출력하기
//			합격기준: 필기와 실기 점수 모두 70점 이상이거나,
//			평균이 80 이상시 "합격" 아니면 "불합격"
		
		// 필기 점수, 실기 점수, 평균
		int score1 = 60;
		int score2 = 83;
		double avg = (double)(score1 + score2) / 2;
		
		// 1. 논리식 x
		if(score1 >=70) {
			if(score2 >= 70) {
				System.out.println("합격");
			}
		}else if(avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 2. 논리식 o
		if( (score1 >=70 && score2 >= 70) || avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		
		
		
		
		
	}
}
