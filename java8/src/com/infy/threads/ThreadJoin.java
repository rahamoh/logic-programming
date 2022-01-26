package com.infy.threads;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(() -> System.out.println("Thread 1 is running"));
		Thread t2 = new Thread(() -> System.out.println("Thread 2 is running"));
		Thread t3 = new Thread(() -> System.out.println("Thread 3 is running"));
		Thread t4 = new Thread(() -> System.out.println("Thread 4 is running"));
		Thread t5 = new Thread(() -> System.out.println("Thread 5 is running"));
		Thread t6 = new Thread(() -> System.out.println("Thread 6 is running"));
		Thread t7 = new Thread(() -> System.out.println("Thread 7 is running"));
		Thread t8 = new Thread(() -> System.out.println("Thread 8 is running"));
		Thread t9 = new Thread(() -> System.out.println("Thread 9 is running"));
		Thread t10 = new Thread(() -> System.out.println("Thread 10 is running"));
//		Thread t11 = new Thread(() -> System.out.println("Thread 11 is running"));
//		Thread t12 = new Thread(() -> System.out.println("Thread 12 is running"));
//		Thread t13 = new Thread(() -> System.out.println("Thread 13 is running"));
//		Thread t14 = new Thread(() -> System.out.println("Thread 14 is running"));
//		Thread t15 = new Thread(() -> System.out.println("Thread 15 is running"));
//		Thread t16 = new Thread(() -> System.out.println("Thread 16 is running"));
//		Thread t17 = new Thread(() -> System.out.println("Thread 17 is running"));
//		Thread t18 = new Thread(() -> System.out.println("Thread 18 is running"));

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();
		t5.start();
		t5.join();
		t6.start();
		t6.join();

		t7.start();
		t7.join();

		t8.start();
		t8.join();

		t9.start();
		t9.join();

		t10.start();
		t10.join();

	}

}
