package com.tree.Step1;

import java.util.Scanner;

public class Step1_1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("진법 변환할 정수 입력");
		
		int num = in.nextInt();
		System.out.println("2진수 : " + Integer.toBinaryString(num));
		System.out.println("8진수 : " + Integer.toOctalString(num));
		System.out.println("16진수 : " + Integer.toHexString(num));
	}
}
