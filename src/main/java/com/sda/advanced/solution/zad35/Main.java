package com.sda.advanced.solution.zad35;

public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunnable());
		thread.start();
	}

}
