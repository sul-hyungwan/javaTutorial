package org.joonzis.ex;

public class Ex03_StudentMain {
	public static void main(String[] args) {
		
		Ex03_StudentManager manager = new Ex03_StudentManager(5);
		
		manager.addNewStudent(manager.input());
		manager.addNewStudent(manager.input());
		
		manager.outputAllStudents();	// 전체 학생 정보 출력
		manager.outputAverage();		// 전체 학생들 평균
		
		manager.output(manager.findStudent());	// 특정 학생 찾기
		
		
	}
}
