package com.infy.threads;

//Java program to implement solution of producer
//consumer problem.

import java.util.LinkedList;

public class ThreadProducerConsumer {
	public static void main(String[] args) throws InterruptedException {
		// Object of a class that has both produce()
		// and consume() methods
		final PC pc = new PC();

		// Create producer thread
		Thread t1 = new Thread(() -> {

			try {
				pc.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		// Create consumer thread
		Thread t2 = new Thread(() -> {

			try {
				pc.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}

	// This class has a list, producer (adds items to list
	// and consumer (removes items).
	public static class PC {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		int capacity = 2;

		public void produce() throws InterruptedException {
			int value = 1;
			while (true) {
				synchronized (this) {
					while (ll.size() == capacity)
						wait();

					System.out.println("Producer produced-" + value);

					ll.add(value++);
					notify();
				}
			}

		}

		public void consume() throws InterruptedException {

			while (true) {
				synchronized (this) {
					while (ll.size() == 0)
						wait();

					int val = ll.removeFirst();
					System.out.println("Consumer consumed-" + val);
					notify();
				}
			}

		}

	}
}
