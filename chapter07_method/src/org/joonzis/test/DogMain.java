package org.joonzis.test;

public class DogMain {
	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		myDog.setDog("개멍멍이", 12, "치와와");
		myDog.info();
		
		System.out.println("-----------");
		
		Dog yourDog = new Dog();
		yourDog.setDog("애기멍멍이", 8);
		yourDog.info();
		
		
		
	}
}
