package org.joonzis.ex;
class Person{
	void sleep() {
		System.out.println("잔다");
	}
	void eat(String food) {
		System.out.println(food + "먹는다.");
	}
}
class Student extends Person{
	void study(){
		System.out.println("공부한다.");
	}
}
class Worker extends Person{
	void work() {
		System.out.println("일한다.");
	}
}
public class Ex02_Inheritance {
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.study();
		stu.eat("급식");
		stu.sleep();
		
	}
}







