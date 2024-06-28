package org.joonzis.ex;

class Espresso{
	String origin;
	public Espresso() {}
	public Espresso(String origin) {
		this.origin = origin;
	}
	void taste() {
		System.out.println("쓰다");
	}
}
class Latte extends Espresso{
	String milk;
	public Latte() {}
	public Latte(String origin, String milk) {
		super(origin);
		this.milk = milk;
	}
	@Override
	void taste() {
		System.out.println("부드럽다.");
	}
	void output() {
		System.out.println("원산지 : " + origin);
		System.out.println("우유 : " + milk);
	}
}
public class Ex05_Method_override {
	public static void main(String[] args) {
		Latte latte = new Latte("베트남", "서울우유");
		latte.taste();
	}
}






