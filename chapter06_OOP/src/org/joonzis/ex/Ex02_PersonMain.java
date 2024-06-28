package org.joonzis.ex;
class Person{
	// 필드
	char gender;
	int age;
	double height;
	String name;
	
	// 메소드
	void info() {
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("이름 : " + name);
	}
}
public class Ex02_PersonMain {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.age = 10;
		person1.gender = '남';
		person1.height = 123.4;
		person1.name = "김꼬마";
		
		person1.info();
	}
}













