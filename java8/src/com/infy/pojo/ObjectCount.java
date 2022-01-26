package com.infy.pojo;

public class ObjectCount {

	public static void main(String[] args) {
		SingletonClass instance1 = SingletonClass.getInstance();

		// Instance 2
		SingletonClass instance2 = SingletonClass.getInstance();

		// now lets check the hash key.
		System.out.println("Instance 1 hash:" + instance1.hashCode());
		System.out.println("Instance 2 hash:" + instance2.hashCode());

	}

}

class SingletonClass {

	private static volatile SingletonClass s;

	private SingletonClass() {

	}

	public static synchronized SingletonClass getInstance() {

		if (s == null) {
			s = new SingletonClass();
		}

		return s;
	}
}