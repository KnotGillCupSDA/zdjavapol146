package com.sda.advanced.solution.zad39;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        AtomicInteger score = new AtomicInteger(0);

        int screens = 100;
        ExecutorService screenPool = Executors.newFixedThreadPool(screens);
        for(int i = 0; i< screens; i++) {
            screenPool.execute(new Screen(score));
        }

        int sensors = 200;
        ExecutorService sensorPool = Executors.newFixedThreadPool(sensors);
        for(int i = 0; i< sensors; i++) {
            sensorPool.execute(new Sensor(score));
        }

    }
}
