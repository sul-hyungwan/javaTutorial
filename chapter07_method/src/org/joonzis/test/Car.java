package org.joonzis.test;

import java.util.Calendar;

//- 필드 : String model,String color, int year
//- 메소드 : setFields(model, color) : 올해를 year로 처리, 
//		 setFields(model, color, year),
//		 output()
public class Car {
	String model, color;
	int year;
	
	void setFields(String m, String c) {
		model = m;
		color = c;
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
	}
	void setFields(String m, String c, int year) {
		model = m;
		color = c;
		this.year = year;
	}
	void output() {
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("연식 : " + year);
	}
	
	
	
	
	
	
}





