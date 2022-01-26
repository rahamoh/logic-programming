package com.infy.threads;

public class ThreadDeadlock {

	public static void main(String[] args) throws InterruptedException {

		String r1 = "resource1";
		String r2 = "resource2";

		Thread t1 = new Thread(() -> {
			synchronized (r1) {
				System.out.println("Thread 1 locked resource 1");

				synchronized (r2) {
					System.out.println("Thread 1 locked resource 2");
				}
			}
		});

		t1.start();
//		t1.join();
		
		Thread t2 = new Thread(() -> {

			synchronized (r2) {
				System.out.println("Thread 2 locked resource 2");

				synchronized (r1) {
					System.out.println("Thread 2 locked resource 1");
				}
			}

		});
				
	t2.start();
//	t2.join();

	}
}