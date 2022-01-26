package com.infy.threads;

public class ThreadExample {
	
	public static void main(String[] args) {
	Runnable r= new MyThread();
	
	Thread t = new Thread(r);
	
	t.start();
	}

}

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Running");
	}
}