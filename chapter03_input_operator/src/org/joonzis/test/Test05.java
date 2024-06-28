package org.joonzis.test;

public class Test05 {
	public static void main(String[] args) {
//		Test05.java
//		Q. 하이픈 없이 주민등록번호를 입력받아 (정수, 문자열) "남자","여자" 출력하기
//			* String의 메소드 이용하기
//			* ex) charAt(), substring() 등
		
		String sn = "8004041234567";
		
		// 1. charAt()
//		char num = sn.charAt(6);	// 1 => '1'
//		String gender = (num=='1' || num=='3') ? "남자" : "여자";

		// 2. substring()
		String num = sn.substring(6, 7);
		String gender = (num.equals("1") || num.equals("3")) ? "남자" : "여자";
		
		
		System.out.println("성별 : " + gender);
		
	}
}
