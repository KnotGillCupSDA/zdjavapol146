package com.sda.advanced.solution.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static List<String> sort(List<String> unsorted) {
		//sort the list

		return sortWithStream(unsorted);
	}

	private static List<String> sortWithStream(List<String> unsorted) {
		return unsorted.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}

	private static List<String> sortWithCollections(List<String> unsorted) {
		Collections.sort(unsorted);
		return unsorted;
	}

	public static void main(String[] args) {
		List<String> unsorted = new ArrayList<>(List.of("A", "Z", "B", "d", "a", "c"));
		System.out.println(unsorted);

		List<String> sorted = sort(unsorted);
		System.out.println(sorted);
	}

}
