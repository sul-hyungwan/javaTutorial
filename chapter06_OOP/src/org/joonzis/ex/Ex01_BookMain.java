package org.joonzis.ex;

public class Ex01_BookMain {
	public static void main(String[] args) {
		
		// 1. Ex01_Book 클래스 객체(인스턴스) 생성 
		Ex01_Book book = new Ex01_Book();
		
		// 2. 생성된 객체 활용
		book.title = "백설공주";
		book.writer = "세 번째 난장이";
		book.price = 2400;
		book.isBestSeller = true;
		
		
		book.info();
		
	}
}
