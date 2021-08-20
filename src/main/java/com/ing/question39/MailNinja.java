package com.ing.question39;


/*
TODO:
 - Run the app
 - Problem : Speed up the application, sendMail() method is too slow
 - call sendMail method in an async way with Thread
*/
public class MailNinja {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // call sendMail method in an async way with Thread
            sendMail(i);
        }

    }

    public static void sendMail(int counter) {
        try {
            Thread.sleep(1000);
            System.out.println(" Mail send ... " + counter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
