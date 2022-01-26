package com.infy.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 1000; i++) {
//			executorService.submit(() -> System.out.println("Task is executing"));
			Future<Integer> future = executorService.submit(new call1());
			try {
				System.out.println(future.get()+i);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		executorService.shutdownNow();

	}

}

class call1 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int i = 0;
		return i + 1;
	}

}
