package com.tree.Step1;

import java.util.Random;

public class Step1_7 {
	
	public static void main(String[] args) {
		Random rd = new Random();
		short c1 = (short) rd.nextInt(65536);
		short c2 = (short) rd.nextInt(65536);
		
		c1 = (short) (c1 > 0 ? c1 : -c1);
		c2 = (short) (c2 > 0 ? c2 : -c2);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("add : " + (c1 + c2));
		System.out.println("minus : " + (c1 - c2));
		System.out.println("multiply : " + (c1 * c2));
		System.out.println("division : " + (c1 / c2));

	}
}
