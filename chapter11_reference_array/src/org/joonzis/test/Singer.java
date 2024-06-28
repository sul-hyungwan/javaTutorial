package org.joonzis.test;
//Singer.java				- 필드 : String name, 
//Song[] songList : Song의 객체 n개를 
//		메인으로부터 받아서 처리,
//	int idx : 배열 인덱스에 접근용도						
//- 메소드 : Constructor : 이름, 배열 크기 선언,
//setSong(song), output
public class Singer {
	String name;
	Song[] songList;
	int idx;
	
	public Singer() {}
	public Singer(String name, int songCount) {
		this.name = name;
		songList = new Song[songCount];
	}
	void setSong(Song s) {
		songList[idx] = s;
		idx++;
	}
	void output() {
		System.out.println("가수 : " + name);
		for (int i = 0; i < idx; i++) {
			songList[i].output();
		}
	}
	
	
	
	
	
}
