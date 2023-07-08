package com.sda.advanced.solution.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private static List<String> sortWithStream(List<String> unsorted) {
		return unsorted.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}

	private static List<String> sortWithCollections(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		// Collections.reverse(sorted); - not good, just reverses the order of elements
		Collections.sort(sorted, Collections.reverseOrder());
		return sorted;
	}

	public static void main(String[] args) {
		List<String> unsorted = List.of("A", "Z", "B", "d", "a", "c");
		System.out.println(unsorted);
		System.out.println(sortWithCollections(unsorted));
		System.out.println(sortWithStream(unsorted));
	}

}
