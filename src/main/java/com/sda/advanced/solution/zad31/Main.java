package com.sda.advanced.solution.zad31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		Path workingDir = Paths.get("src", "main", "resources", "zad31");
		Path originalFile = workingDir.resolve("zadania.txt");
		byMichal(originalFile.toString(),
				originalFile.getParent().resolve("out.txt").toString());
	}

	private static void byMichal(String inputFile, String outputFile) throws IOException {
		Map<String, Integer> wordCountMap = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					if (wordCountMap.containsKey(word)) {
						int count = wordCountMap.get(word);
						wordCountMap.put(word, count + 1);
					} else {
						wordCountMap.put(word, 1);
					}
				}
			}
		}

		try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				String word = entry.getKey();
				int count = entry.getValue();
				writer.write(word + "\t\t" + count);
				writer.newLine();
			}
		}
	}

}
