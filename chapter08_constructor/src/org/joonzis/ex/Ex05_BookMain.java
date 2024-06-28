package org.joonzis.ex;

public class Ex05_BookMain {
	public static void main(String[] args) {
		Ex05_Book book1 = new Ex05_Book();
		Ex05_Book book2 = new Ex05_Book("자바의정석", 20000);
		Ex05_Book book3 = new Ex05_Book("수학의정석", 30000, "정근준");
		
		book1.setSalesVolume(5000);
		book1.output();
		System.out.println("-------------");
		book2.setSalesVolume(500);
		book2.output();
		System.out.println("-------------");
		book3.setSalesVolume(50000);
		book3.output();
		
		
		
	}
}
