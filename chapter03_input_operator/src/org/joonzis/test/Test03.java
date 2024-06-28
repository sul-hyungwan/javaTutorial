package org.joonzis.test;

public class Test03 {
	public static void main(String[] args) {
//		Test03.java
//		Q. 매출액과 등급("VIP", "일반")을 입력받아
		// 등급이 "VIP"이면 매출액에서 20%를 할인하고
//		   "일반"이면 매출액에서 5%를 할인하는 프로그램 구현
		
		int money = 10000;
		String grade = "vip";
		
		int result = (int)(grade.equalsIgnoreCase("VIP") ? money * 0.8 : money * 0.95);	
		
		System.out.println("할인 받은 매출액 : " + result);
		
		
	}
}
