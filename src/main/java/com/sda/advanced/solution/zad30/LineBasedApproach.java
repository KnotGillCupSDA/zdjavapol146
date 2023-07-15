package com.sda.advanced.solution.zad30;

import java.nio.file.Path;
import java.nio.file.Paths;

public class LineBasedApproach {

	public static void main(String[] args) {
		Path workingDir = Paths.get("src", "main", "resources", "zad30");
		Path originalFile = workingDir.resolve("someTextFile.txt");
	}

}
