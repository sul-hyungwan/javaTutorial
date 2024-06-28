package org.joonzis.test;

public class Circle {
	Coordinate center;
	double radius;
	public Circle(Coordinate center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	void output() {
		System.out.println("반지름 : " + radius);
		center.output();
	}
}
