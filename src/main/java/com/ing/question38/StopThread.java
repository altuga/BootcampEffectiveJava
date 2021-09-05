package com.ing.question38;

import java.util.concurrent.TimeUnit;

/** TODO
* How long would you expect this program to run?
*/
public class StopThread {
    private static boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args)
            throws InterruptedException {

        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested())
                i++;
            System.out.println("Finito");
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop() ;

    }
}