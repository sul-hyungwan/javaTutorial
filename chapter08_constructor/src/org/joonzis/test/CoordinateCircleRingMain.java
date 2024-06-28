package org.joonzis.test;

public class CoordinateCircleRingMain {
	public static void main(String[] args) {
		
		// 1. 좌표 한 개
		Coordinate coor = new Coordinate(3, 3);
		
		// 2. 원 두 개 ( 원 == 좌표1 + 반지름1 )
		Circle cir1 = new Circle(coor, 12);
		Circle cir2 = new Circle(coor, 15);
		
		// 3. 원 두 개를 이용하여 ring 제작
		Ring ring = new Ring(cir1, cir2);
		ring.output();
		
		
		
		
		
	}
}
