package com.sda.advanced.solution.zad35;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
