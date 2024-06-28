package org.joonzis.test;

public class SingerSongMain {
	public static void main(String[] args) {
		
		Singer singer = new Singer("이영지", 3);
		singer.setSong(new Song("16", "대한민국"));
		singer.setSong(new Song("My cat", "대한민국"));
		
		singer.output();
		
		
	}
}
