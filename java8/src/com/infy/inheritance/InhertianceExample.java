package com.infy.inheritance;

public class InhertianceExample {
	private int i;
	int j;
	 protected int k = 3;
	public int m=5;

}

class B extends InhertianceExample {

	public void bMethod() {
		
		//System.out.println(i);        Private member can not be inherited
        System.out.println(j);           //Default member can be inherited within package
        System.out.println(k);         //protected member can be inherited to any subclass
        System.out.println(m);       //public member can be inherited to all sub classes
	}
}
