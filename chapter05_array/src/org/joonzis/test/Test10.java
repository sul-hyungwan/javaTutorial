package org.joonzis.test;

import java.util.Scanner;


public class Test10 {
	public static void main(String[] args) {
//		1행 >>3
//		2행 >>2
//		3행 >>3
//		4행 >>4
//		5행 >>5
//		1	1	1
//		1	1	
//		1	1	1	
//		1	1	1	1	
//		1	1	1	1	1
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][];
		
		// 입력 for
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "행 >> ");
			int row = sc.nextInt();
			arr[i] = new int[row];
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = 1;
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
