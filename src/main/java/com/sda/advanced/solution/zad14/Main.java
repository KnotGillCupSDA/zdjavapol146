package com.sda.advanced.solution.zad14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		int[] numbers = getRandomInts();
		System.out.println(findMostFrequentElements(numbers, 25));
	}

	private static int[] getRandomInts() {
		Random random = new Random();
		int[] array = new int[100000];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		return array;
	}

	private static List<Integer> findMostFrequentElements(int[] numbers, int top) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		/*for (int number : numbers) {
			if (!frequencyMap.containsKey(number)) {
				frequencyMap.put(number, 1);
			} else {
				Integer count = frequencyMap.get(number);
				frequencyMap.put(number, count + 1);
			}
		}*/

		for (int number : numbers) {
			frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
		}

		return frequencyMap.entrySet().stream()
				//to display those elements that occur most often, we need to compare the values of the keys
				.sorted((a, b) -> -1 * a.getValue().compareTo(b.getValue()))
				.map(Map.Entry::getKey)
				.limit(top)
				.collect(Collectors.toList());

	}
}
