package org.joonzis.ex;

public class Ex02_switch {
	public static void main(String[] args) {
		/*
		 * 1. 형식
		 * 		switch (표현식){
		 * 			case 값1 : 실행문; 
		 * 				  break;
		 * 			case 값2 : 실행문;
		 * 				  break;
		 * 			default : 실행문;
		 * 		}
		 * 
		 * 2. 특징
		 * 	1) 표현식의 결과는 정수, 문자, 문자열만 가능하다. 실수는 불가능!!
		 *  2) 실제 사용 예시
		 *  
		 *  	switch (var){
		 *  		case >= 10 : 	// 불가능!
		 *  		case 10 : 		// 가능!		(정수)
		 *  		case 1.5 : 		// 불가능!	(실수)
		 *  		case '남' : 		// 가능!		(문자)
		 *  		case "admin" : 	// 가능!		(문자열)
		 *  	}
		 */
		
		// 성인과 미성년자를 구분하는 값
		int age = 25;
		if(age >= 20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
		int ckAge = age/10;
		switch (ckAge) {
			case 1: System.out.println("미성년자");
				break;
			default:System.out.println("성인");
				break;
		}
		
		
		String gender = "M";	// M/F
		// switch문을 이용해서 성별을 출력
		switch (gender) {
			case "M":
				System.out.println("남성");
				break;
			case "F":
				System.out.println("여성");
				break;
		}
		
		// if문으로도 작성
		if(gender.equals("M")) {
			System.out.println("남성");
		}else if(gender.equals("F")) {
			System.out.println("여성");
		}
		
		
		
		
		
		
		
	}
}
