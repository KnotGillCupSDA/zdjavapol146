package com.sda.advanced.solution.zad2;

import java.util.List;

public class Main {

	private static List<String> sortCaseInsensitive(List<String> unsorted) {

		return unsorted;
	}

	public static void main(String[] args) {
		List<String> unsorted = List.of("A", "Z", "B", "d", "a", "c");
		System.out.println(unsorted);
		System.out.println(sortCaseInsensitive(unsorted));
	}

}
