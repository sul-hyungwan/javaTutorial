package org.joonzis.ex;

// 국내에 거주하는 사람
public class Ex02_Local {
	// 필드
	String name;
	int age;
	String sn;
	boolean isKorean;
	
	// 메소드
	void setLocalInfo(String n, int a, String s) {
		// 이름, 나이, 주민등록 번호를 입력 받아 초기화
		// 주민등록번호 뒷 자리의 첫 번째 값이 1~4일 경우에 한국인
		name = n;
		age = a;
		sn = s;
		// 1. charAt(); -> 999999-1234567
		isKorean = sn.charAt(7) <= '4' ? true : false;
		// 2. substring();
	}
	void setLocalInfo(String n, int a) {
		// 이름, 나이를 전달 받아 초기화
		name = n;
		age = a;
	}
	void output() {
		// 이름, 나이, 주민등록번호, 한국인or외국인 출력
		// 주민등록번호가 없으면 "없음"으로 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호 : " + (sn == null ? "없음" : sn));
		System.out.println( isKorean ? "한국인" : "외국인");
	}
	
	
	
	
	
	
	
	
}
