package org.joonzis.ex;

public class Ex05_Casting {
	public static void main(String[] args) {
		/*
		 * 형 변환(casting)
		 * 
		 * 1. 자동 형 변환(묵시적)
		 * 	1) java 스스로 형 변환
		 * 	2) 타입이 섞인 경우 작은 크기의 타입을 큰 크기의 타입으로 통일시키는
		 * 		방향으로 형 변환
		 * 		ex) short와 int의 연산 -> 둘 다 int로 변환 뒤 연산
		 * 	3) 정수와 실수가 섞인 경우 정수를 실수로 변환
		 * 
		 * 2. 강제 형 변환(명시적)
		 * 	1) 개발자가 직접 형 변환
		 * 	2) 타입 상관없이 원하는 타입으로 변환
		 * 	3) (자료형)변수, (자료형)값
		 * 		ex) int num = 10;
		 * 			(double)num;  > 실수로 처리
		 * 
		 */
		
		// 1. 자동 형 변환
		System.out.println( 1 + 1.5 );
		// java 스스로 1.0 + 1.5로 변환 후 연산
		
		double a = 10;
		System.out.println(a);
		// java 스스로 double a = 10.0으로 변환 후 처리
		
		
		// 2. 강제 형 변환
		int b = (int)20.9;
		System.out.println(b);
		
		
		int c = 1;
		int d = 2;
		double e = (double)c / d;
		System.out.println(e);
		// 화면에 1/2 결과 출력
		
		
		// 1. 국어 kor, 영어 eng, 수학 mat 각 변수를 만들고  
		// 2. 임의의 값을 대입한 뒤 
		// 3. 국영수 평균 값을 변수 avg에 저장
		// 4. 화면에 출력하시오. 
		int kor;
		int eng;
		int mat;
		
		kor = 24;
		eng = 30;
		mat = 40;
		int sum = (kor + eng + mat);
		double avg = sum / 3.0;
		
		System.out.println(avg);
		
		
		
	}
}
