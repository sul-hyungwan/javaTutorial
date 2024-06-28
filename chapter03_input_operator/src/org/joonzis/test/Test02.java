package org.joonzis.test;

public class Test02 {
	public static void main(String[] args) {
//		Test02.java
//		Q. 나이를 입력받아 "성인" 또는 "미성년자" 출력
		
		int age = 25;
		
		// 1. 한 번에 처리
		System.out.println(age>=20 ? "성인" : "미성년자");
		

		// 2. 결과 값을 저장해서 사용
		String result = age>=20 ? "성인" : "미성년자";
		System.out.println(result);
		
	}
}






