package org.joonzis.ex;

public class Ex02_LocalMain {
	public static void main(String[] args) {
		
		Ex02_Local local = new Ex02_Local();
		local.setLocalInfo("김씨", 20, "999999-1234567");
		local.output();
		
		System.out.println("---------------");
		
		Ex02_Local local2 = new Ex02_Local();
		local2.setLocalInfo("박씨", 30);
		local2.output();
		
		
		
		
	}
}
