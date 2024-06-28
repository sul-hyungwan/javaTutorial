package org.joonzis.test;
//- 필드 : String name, String breed, int age
//- 메소드 : setDog(name, age) : 품종은 푸들
//		setDog(name, age, breed) 
//		info() - name, age, breed 출력
public class Dog {
	String name, breed;
	int age;
	
	void setDog(String name, int age) {
		setDog(name, age, "푸들");
	}
	void setDog(String n, int a, String b) {
		this.name = n;
		this.age = a;
		this.breed = b;
	}
	void info() {
		System.out.println("강아지 이름 : " + name);
		System.out.println("강아지 나이 : " + age);
		System.out.println("강아지 품종 : " + breed);
	}
	
	
	
	
	
}
