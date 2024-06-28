package org.joonzis.ex;
/*
 * 필드
 *  - String title				: 책 제목
 *  - String writer				: 저자
 *  - int price					: 책 가격
 *  - int salesVolume			: 판매량
 *  - boolean isBestSeller		: 베스트 셀러 유무
 *  
 * 메소드
 *  - 생성자()
 *  - 생성자() : 제목, 가격 초기화 (저자는 "작자미상" 으로 기입)
 *  - 생성자() : 제목, 가격, 저자 초기화
 *  - setSalesVolume(int sales) : 판매량이 1000 이상이면 베스트 셀러
 *  - output() : 제목, 저자, 가격, 판매량, 베스트셀러 유무 출력
 */
public class Ex05_Book {
	String title, writer;
	int price, salesVolume;
	boolean isBestSeller;
	
	public Ex05_Book() {}
	public Ex05_Book(String title, int price) {
		this.title = title;
		this.price = price;
		writer = "작자미상";
	}
	public Ex05_Book(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	void setSalesVolume(int sales) {
		salesVolume = sales;
		isBestSeller = sales >= 1000 ? true : false;
	}
	void output() {
		//제목, 저자, 가격, 판매량, 베스트셀러 유무 출력
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println("판매량 : " + salesVolume);
		System.out.println(isBestSeller ? "베스트셀러" : "일반서적");
	}
}













