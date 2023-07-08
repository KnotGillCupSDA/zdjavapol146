package com.sda.advanced.solution.zad3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	private static void print(Map<String, Integer> map) {
		/*
		//Can be also done like this
		for (String key : map.keySet()) {
			Integer value = map.get(key);
		}*/

		int index = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			boolean isLastElement = index == map.size() -1;
			if(isLastElement) {
				System.out.println("Klucz: " + key + ", Wartość: " + value + ".");
			} else {
				System.out.println("Klucz: " + key + ", Wartość: " + value + ",");
				//System.out.printf("Klucz: %s, Wartość: %d,\n", key, value);
			}
			index++;
		}

	}

	public static void main(String[] args) {
		/*Map<String, Integer> map = new HashMap<>();
		map.put("Java", 18);
		map.put("Python", 1);
		map.put("PHP", 0);*/
		Map<String, Integer> map = Map.of("Java", 18, "Python", 1, "PHP", 0);

		print(map);
	}

}
