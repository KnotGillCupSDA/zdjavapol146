package com.sda.advanced.solution.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

	public static void main(String[] args) throws IOException {

		Path workingDir = Paths.get("src", "main", "resources", "zad30");
		Path originalFile = workingDir.resolve("someTextFile.txt");
		String originalContent = Files.readString(originalFile);

		String reversedContent = reverse(originalContent);
		Path destinationFile = reverseFileName(originalFile);

		Files.writeString(destinationFile, reversedContent, StandardOpenOption.CREATE);

	}

	private static String reverse(String originalContent) {
		return null;
	}

	private static Path reverseFileName(Path originalFile) {
		return null;
	}

}
