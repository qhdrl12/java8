package com.tree.Step1;

import java.util.Scanner;

public class Step1_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("임의의 정수를 입력하세요.");
		
		int num = in.nextInt();
		
		System.out.println("radius : " + Math.floorMod(num, 360));
	}
}
