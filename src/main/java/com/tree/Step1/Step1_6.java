package com.tree.Step1;

import java.math.BigInteger;

public class Step1_6 {

	private static BigInteger bi = BigInteger.ONE;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(10));

	}
	
	
	public static BigInteger factorial(int i) {
		if (i == 1) {
			return bi;
		}
		
		bi = bi.multiply(BigInteger.valueOf(i));
		
		return factorial(i-1);  
	}

}
