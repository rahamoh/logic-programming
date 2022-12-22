package com.rest.application;

import java.util.concurrent.*;

public class Wissen {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService service = Executors.newCachedThreadPool();
        FutureDemo demo = new FutureDemo();
        Future future1 = service.submit(()->demo.printMessage1());
        Future future2 = service.submit(()->demo.printMessage2());

        System.out.println(future1.get());

        CompletableFuture completableFuture = new CompletableFuture();
        boolean result = completableFuture.complete(future2.get());

//      System.out.println(future2.get(10000, TimeUnit.SECONDS));

        if(result)
            System.out.println(future2.get());

            for (int i = 1; i <= 10; i++)
                System.out.print(i + " ");

        service.shutdownNow();
    }
}

class FutureDemo {

    public String printMessage1() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName() + " Printing";
    }

    public String printMessage2() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return Thread.currentThread().getName() + " Printing";
    }
}
