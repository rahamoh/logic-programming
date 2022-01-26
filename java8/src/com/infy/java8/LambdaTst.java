package com.infy.java8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Test {
	void hello();
}

public class LambdaTst extends ArrayList<String> {

	@Override
	public boolean add(String o) {

		if (this.contains(o))
			return true;
		else {
			return super.add(o);
		}

	}

	public static void main(String[] args) {

		LambdaTst list = new LambdaTst();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("1");
		
		System.out.println(list);

	}

}