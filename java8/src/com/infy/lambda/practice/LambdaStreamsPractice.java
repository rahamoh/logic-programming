package com.infy.lambda.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaStreamsPractice {

	public static void main(String[] args) {

		Product product1 = new Product("Books", "Quran", 10.0);
		Product product2 = new Product("Books", "gita", 9.0);
		Product product3 = new Product("Books", "bible", 8.0);
		Product product4 = new Product("Sports", "bat", 7.0);
		Product product5 = new Product("Sprots", "ball", 6.0);
		
		List<Product> list = new ArrayList<Product>();
		
		
//		list.addAll(list);
		list.add(product5);
		list.add(product4);
		list.add(product3);
		list.add(product2);
		list.add(product1);
		
	List<Double> listProductPrice = list.stream()
			.filter(b->b.getCategory().equalsIgnoreCase("Books") 
					&& b.getName().equalsIgnoreCase("Quran")
					&& b.getPrice()>1)
			.map(bp->bp.getPrice())
			.collect(Collectors.toList());
	
//	System.out.println(listProductPrice.size());
		
	for(int i=0;i<listProductPrice.size();i++) {
		if(listProductPrice.get(i)>15)
			System.out.println(listProductPrice.get(i));
		else
			System.out.println("No record found");
	}
		
		
		

	}

}
