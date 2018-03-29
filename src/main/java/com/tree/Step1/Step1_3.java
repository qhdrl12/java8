package com.tree.Step1;

import java.util.Scanner;

public class Step1_3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int count = 1;
		int max = 0;
		do {
			System.out.println(count +" 번 째  숫자를 입력해주세요.");
			int i = in.nextInt();
//			if (i > max) {
//				max = i;
//			} 
			max = Math.max(i, max);
			
			count++;
		} while ( count < 4 );
		
		System.out.println(" 최대값 : " + max);
	}
}
