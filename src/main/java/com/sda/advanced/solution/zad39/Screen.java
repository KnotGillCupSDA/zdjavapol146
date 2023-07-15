package com.sda.advanced.solution.zad39;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Screen implements Runnable {
    private final AtomicInteger score;

    public Screen(AtomicInteger score) {
        this.score = score;
    }

    @Override
    public void run() {

        try {
            while (true) {
                System.out.println("Current score: " + score.get());
                Thread.sleep(new Random().nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
