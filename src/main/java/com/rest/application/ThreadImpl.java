package com.rest.application;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadImpl {

    int counter = 1;

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        ThreadImpl threadImpl = new ThreadImpl();
        Future evenFuture = service.submit(() -> threadImpl.printEven());
        Future oddFuture = service.submit(() -> threadImpl.printOdd());

//        Thread thread1 = new Thread(() -> threadImpl.printEven());
//        Thread thread2 = new Thread(() -> threadImpl.printOdd());
//
//        thread1.start();
//        thread2.start();
        if (oddFuture.isCancelled())
            service.shutdownNow();
    }

    private synchronized void printEven() {
        while (counter < 10) {
            if (counter % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(counter);
            counter++;
            notify();
        }
    }

    private synchronized void printOdd() {

        while (counter < 10) {
            if (counter % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(counter);
            counter++;
            notify();
        }
    }

}