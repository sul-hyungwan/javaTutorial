package org.joonzis.ex;

import java.util.Scanner;

public class Ex01_TriangleMain {
	public static void main(String[] args) {
		Ex01_Triangle semo1 = new Ex01_Triangle();
		semo1.setFields(10, 20);
		semo1.output();
		
		System.out.println("-------------");
		
		Ex01_Triangle semo2 = new Ex01_Triangle(10, 20);
		semo2.setFields(3, 4);
		semo2.output();		
		
		
		
		
	}
}
