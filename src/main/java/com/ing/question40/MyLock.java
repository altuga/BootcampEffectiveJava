package com.ing.question40;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/*
TODO:
 - Run the app
 - Any problem ?
*/
public class MyLock {

    static ExecutorService exec = Executors.newFixedThreadPool(10);

    private final List<String> myList = new ArrayList();

    {
        myList.add("Hello");
        myList.add("Africa");

    }


    private final Object key1 = new Object();
    private final Object key2 = new Object();


    public String get(int index)  {

        synchronized (key1) {
            try {
                Thread.sleep(100); // IO
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (String element : myList) {
                System.out.println(" Here is the list " + element );
            }


            synchronized (key2) {
                return myList.get(index);
            }
        }
    }

    public void set(String value) {
        synchronized (key2) {
            synchronized (key1) {
                 myList.add(value);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyLock myLock = new MyLock();
        Runnable taskForSet = () ->  myLock.set("Canada");
        Runnable taskForGet = () ->   System.out.println(myLock.get(2));
        exec.submit(taskForSet);
        exec.submit(taskForGet);

        exec.shutdown();
        System.out.println("Finito");

    }
}
