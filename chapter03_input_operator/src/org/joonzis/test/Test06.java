package org.joonzis.test;

public class Test06 {
	public static void main(String[] args) {
//		Test06.java
//		Q. 체질량 지수(BMI) = 몸무게(kg) / 키 (m) 제곱 
//		   BMI 25 이상이면 "과체중", 20 이상이면 "정상", 20 미만이면 "저체중"
		
		// 입력 받았다고 치고~
		double weight = 66.6;
		double height = 166.6;
		
		height = height / 100.0; // 키 m 단위로 변환
		
		double bmi = weight / (height * height);
		
		String result = (bmi >= 25) ? "과체중" : 
							(bmi >= 20) ? "정상" : "저체중";
		
		
	}
}
