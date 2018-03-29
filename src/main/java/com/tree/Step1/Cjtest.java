package com.tree.Step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;import org.springframework.boot.web.server.MimeMappings.Mapping;


public class Cjtest {
	
	
	private static List<String> cho = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
	private static Map<Integer, List<String>> map = new HashMap<>();
	private static int mapIndex = 1;
	
	public static void main(String[] args) {
		initMap(mapIndex);
		Scanner in = new Scanner(System.in);
		System.out.println("age를 입력하세요 ");
		
		String sin = in.nextLine();
		
		String[] sp = sin.split(",");
		
		StringBuffer sb = new StringBuffer();
		for (String s : sp) {
			sb.append(s.trim());
		}
		
		char[] cArray = sb.toString().toCharArray();
		for (char c : cArray) {
			int count = 1;
			System.out.println("c : " + c);
			boolean result = true;
			while (result) {
//			do {
				if (map.get(count) == null) {
					mapIndex++;
					initMap(mapIndex);
					continue;
				}
				
				int listIdx = map.get(count).indexOf(String.valueOf(c));
				System.out.println("idx : " + listIdx);
				if (listIdx > -1) {
					map.get(count).set(listIdx, null);
					result = false;
				} else {
					count++;
				}
			}
//			} while (result==true);
			
		}
		
		System.out.println("result : " + mapIndex);
		
	}
	
	private static void initMap(int idx) {
		map.put(mapIndex, cho);
	}
}
