package org.joonzis.test;

public class CarMain {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.setFields("소나타", "red", 2010);
		myCar.output();
		
		System.out.println("----------------");
		
		Car yourCar = new Car();
		yourCar.setFields("산타페", "black");
		yourCar.output();
		
		
	}
}
