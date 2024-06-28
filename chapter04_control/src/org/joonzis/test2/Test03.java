package org.joonzis.test2;

public class Test03 {
	public static void main(String[] args) {
//		Test03.java
//		Q. 전체 구구단 출력하기_1
//		ex) 2x1 = 2
//			2x2 = 4
//			...
//			9x9 = 81
		
		
		for(int dan=2; dan <= 9; dan++) {	// 단수에 해당
			
			for (int i = 1; i <= 9; i++) {	// 곱하는 값
				
				System.out.println(dan + "X" + i + "=" + (dan*i));
				
			}
			
		}
		
		
		
		
		
		
		
	}
}
