package org.joonzis.test;

public class SingerSongMain {
	public static void main(String[] args) {
		
		Singer singer = new Singer("아이유");

		// Song 객체를 Singer에게 전달하는 방법  - 1
		Song song = new Song("팔레트", "대한민국");
		// Song 객체를 Singer에게 전달하는 방법  - 2
//		singer.setSong(new Song("팔레트", "대한민국"));
		singer.setSong(song);
		singer.output();
		
	}
}
