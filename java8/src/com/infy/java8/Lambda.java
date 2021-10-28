package com.infy.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {

		List<Emplyoee> list = new ArrayList<Emplyoee>();

		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
			
		Emplyoee emplyoee1 = new Emplyoee();
		Emplyoee emplyoee2 = new Emplyoee();
		Emplyoee emplyoee3 = new Emplyoee();
		Emplyoee emplyoee4 = new Emplyoee();

		emplyoee1.setEmpId(1);
		emplyoee1.setGender('M');

		emplyoee2.setEmpId(2);
		emplyoee2.setGender('F');

		emplyoee3.setEmpId(3);
		emplyoee3.setGender('M');

		emplyoee4.setEmpId(4);
		emplyoee4.setGender('M');

		list.add(emplyoee1);
		list.add(emplyoee2);
		list.add(emplyoee3);
		list.add(emplyoee4);

		list.stream().filter((e) -> e.getGender() == 'M').collect(Collectors.toList())
				.forEach(e1 -> System.out.println(e1));
		
		list1.stream()
			.filter(n->n>3)
			.collect(Collectors.toList())
			.forEach(num->System.out.println(num));
		
	}

}
