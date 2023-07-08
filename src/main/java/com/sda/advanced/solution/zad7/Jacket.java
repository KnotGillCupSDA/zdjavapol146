package com.sda.advanced.solution.zad7;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jacket {

	private final Deque<String> stack;
	private final int size;

	public Jacket(int size) {
		this.size = size;
		this.stack = new ArrayDeque<>();
	}

	public boolean loadBullet(String bullet) {
		if (stack.size() >= size) {
			return false;
		}

		stack.add(bullet);
		return true;
	}

	public boolean isLoaded() {
		return !stack.isEmpty();
	}

	public void shot() {
		String nextBullet = stack.pollLast();
		System.out.println(nextBullet == null ? "pusty magazynek" : nextBullet);
	}
}
