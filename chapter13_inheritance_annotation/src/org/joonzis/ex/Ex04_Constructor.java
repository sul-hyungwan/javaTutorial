package org.joonzis.ex;
/*
 * super
 * 
 * 1. 자식 클래스가 알고있는 부모 클래스의 참조
 * 2. 사용 방법
 * 		1) super.필드			: 부모 클래스 필드 사용
 * 		2) super.메소드()			: 부모 클래스 메소드 사용
 * 		3) super()				: 부모 클래스의 생성자 사용
 */
class Animal{
	String name;
	public Animal() {}
	public Animal(String name) {
		this.name = name;
	}
}
class Dog extends Animal{
	String personName;
	public Dog(String personName) {
		super();
		this.personName = personName;
	}
	public Dog(String personName, String name) {
		super(name);
		this.personName = personName;
	}
	void whoAmI() {
		System.out.println("내 이름은 : " + super.name + "이고,"+
					"주인은 " + personName + "입니다.");
	}
}
public class Ex04_Constructor {
	public static void main(String[] args) {
		
		Dog dog = new Dog("김씨");
		dog.whoAmI();
		
		System.out.println("-----------------");
		
		Dog dog2 = new Dog("옆집 아주머니", "김쿠키");
		dog2.whoAmI();
	}
}








