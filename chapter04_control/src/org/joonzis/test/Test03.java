package org.joonzis.test;

public class Test03 {
	public static void main(String[] args) {
//		Test03.java
//		Q. 나이를 입력 받아 7 이하면 "미취학", 13 이하이면 "초등학생", 
//		16 이하이면 "중학생", 19 이하이면 "고등학생", 나머지는 "성인"
		
		int age = 17;
		
		if(age <= 7) {
			System.out.println("미취학");
		}else if(age <= 13) {
			System.out.println("초등학생");
		}else if(age <= 16) {
			System.out.println("중학생");
		}else if(age <= 19) {
			System.out.println("고등학생");
		}else {
			System.out.println("성인");
		}
		
		
	}
}
