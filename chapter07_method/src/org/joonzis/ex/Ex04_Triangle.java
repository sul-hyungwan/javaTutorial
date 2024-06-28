package org.joonzis.ex;

public class Ex04_Triangle {
	int width, height;
	
	// 아래 두 메소드가 오버로딩 되지 않는 이유
	// -> 메소드 이름은 같으나, 매개 변수가 다르지 않다.
	int calcArea() {
		return width * height / 2;
	}
	double calcArea() {
		return width * height / 2.0;
	}
	
}
