package com.sda.advanced.solution.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

	private final Map<String, List<String>> map;

	public Storage() {
		this.map = new HashMap<>();
	}

	public void addToStorage(String key, String value) {
		//check if the map contains the key
		boolean exists = map.containsKey(key);

		//if no => create a List with 1 element
		if(!exists) {
			List<String> values = new ArrayList<>();
			values.add(value);
			map.put(key, values);
		}
		//if yes => get the list and append the new element
		else {
			List<String> values = map.get(key);
			values.add(value);
		}

		/* Solution that uses specialized computeIfAbsent method
		List<String> strings = map.computeIfAbsent(key, s -> new ArrayList<>());
		strings.add(value);*/
	}

	public void printValues(String key) {

	}

	public void findKeysByValue(String value) {

	}


}