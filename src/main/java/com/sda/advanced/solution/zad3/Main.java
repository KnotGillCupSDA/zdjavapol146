package com.sda.advanced.solution.zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	private static void print(Map<String, Integer> map) {

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
