package org.joonzis.test;

public class RecursiveCall {
	
	// int count = 5 -> 5회 반복 실행
	static void recursive(int count) {
		// 1.
		if(count == 0) {
			return;
		}
		System.out.println("Hello");
		recursive(count - 1);
		
		// 2. 
		if(count != 0) {
			System.out.println("Hello");
			recursive(count - 1);
		}
	}
	
	public static void main(String[] args) {
		recursive(5);
	}
}
