package com.ing.question41;

import java.util.concurrent.*;

public class NetworkUtility {

    private static ExecutorService exec = Executors.newFixedThreadPool(10);
    private static int DEFAULT_VALUE=4;


    // An empty catch block defeats the purpose of exceptions
    public void await() {
        try {
            // ...
        } catch (Exception e) {

        }
    }

    /** If you choose
    to ignore an exception, the catch block should contain a comment explaining
    why it is appropriate to do so, and the variable should be named ignored:
     */
    public void doWork() {

        Future<Integer> f = exec.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return Integer.MAX_VALUE;
            }
        });

        int numColors = DEFAULT_VALUE; // Default; guaranteed sufficient for any map
        try {
            numColors = f.get(1L, TimeUnit.SECONDS);
        } catch (TimeoutException | ExecutionException | InterruptedException ignored) {
            // Use default: minimal coloring is desirable, not required
        }
    }


}