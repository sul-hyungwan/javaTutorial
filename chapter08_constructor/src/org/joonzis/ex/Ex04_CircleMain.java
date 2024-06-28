package org.joonzis.ex;

public class Ex04_CircleMain {
	public static void main(String[] args) {
		Ex04_Circle cir1 = new Ex04_Circle();
		Ex04_Circle cir2 = new Ex04_Circle(2.5);
		Ex04_Circle cir3 = new Ex04_Circle(3, 4, 3.7);
		
		
		cir1.output();
		System.out.println("----------------");
		cir2.output();
		System.out.println("----------------");
		cir3.output();
		
		
		
		
	}
}
