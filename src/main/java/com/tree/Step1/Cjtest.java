package com.tree.Step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;import org.springframework.boot.web.server.MimeMappings.Mapping;


public class Cjtest {
	
	
//	private static List<String> cho = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
	static String[] strs = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
	private static Map<Integer, String[]> map = new HashMap<>();
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
			System.out.print("char : " + c);
			boolean result = true;
			while (result) {
				if (map.get(count) == null) {
					System.out.print("initMap : " + mapIndex);
					mapIndex++;
					initMap(mapIndex);
					count = mapIndex;
				}
				
				System.out.println(", count : " + count);


				int listIdx = Arrays.asList(map.get(count)).indexOf(String.valueOf(c));
				if ( listIdx == -1) {
					if (String.valueOf(c).equals("6")) {
						listIdx = Arrays.asList(map.get(count)).indexOf("9");	
					} else if (String.valueOf(c).equals("9")) {
						listIdx = Arrays.asList(map.get(count)).indexOf("6");
					}
				}
					
				System.out.println("idx : " + listIdx);
				if (listIdx > -1) {
					map.get(count)[listIdx] = "0";
					result = false;
				} else {
					count++;
				}
			}
			
		}
		
		System.out.println("result : " + mapIndex);
		
	}
	
	private static void initMap(int idx) {
		map.put(mapIndex, Arrays.copyOf(strs, strs.length));
	}
}
