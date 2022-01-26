package com.infy.collections;

import java.util.ArrayList;

public class ArrayListDemo extends ArrayList<Integer> {
	
	
	@Override
	public boolean add(Integer i) {
		if(this.contains(i))
			return true;
		else
		return super.add(i);
	}
	

	public static void main(String[] args) {

		ArrayListDemo demo = new ArrayListDemo();
		demo.add(1);
		demo.add(1);
		demo.add(1);
		demo.add(2);
		
		System.out.println(demo);

	}

}
