package org.joonzis.ex;

public class Ex01_PersonMain {
	public static void main(String[] args) {
		
		Ex01_Person person1 = new Ex01_Person("김씨", 10, 123.4, '남');
		Ex01_Person person2 = new Ex01_Person("이씨", 20, 223.4, '여');
		Ex01_Person person3 = new Ex01_Person("박씨", 30, 323.4, '여');
		
		person1.output();
		person2.output();
		person3.output();
		
		System.out.println("----------------------------");
		
		// 크기 3의 참조 배열 people을 선언 후 값 입력
		// 각 배열 내 데이터 출력
		
		// Person 타입의 배열 선언
		Ex01_Person[] people = new Ex01_Person[3];
		
		// 배열 내에 데이터 저장 1 - 개별 입력
		// people[0] = person1
		people[0] = new Ex01_Person("김씨", 10, 123.4, '남');
		people[1] = new Ex01_Person("이씨", 20, 223.4, '여');
		people[2] = new Ex01_Person("박씨", 30, 323.4, '여');
		
		// 배열 내에 데이터 저장 2 - 동적 입력
		for (int i = 0; i < people.length; i++) {
			// 스캐너로 입력 받는다.
			System.out.println((i+1) + "번 객체 값 입력 >> ");
			String name = sc.next();
			int age = sc.nextInt();
			...
			
			people[i] = new Ex01_Person(name, age, );
		}
		
		for (int j = 0; j < people.length; j++) {
			people[j].output();
		}
		
		
		
		
		
		
		
		
		
	}
}
