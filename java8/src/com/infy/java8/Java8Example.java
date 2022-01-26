package com.infy.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example {

	public static void main(String[] args) {

		Emplyoee emp1 = new Emplyoee();
		Emplyoee emp2 = new Emplyoee();
		Emplyoee emp3 = new Emplyoee();
		
		Sports sports1 = new Sports();
		Sports sports2 = new Sports();
		Sports sports3 = new Sports();

		List<Emplyoee> list = new ArrayList<Emplyoee>();

		List<Sports> list2 = new ArrayList<Sports>();
		List<Sports> list3 = new ArrayList<Sports>();
		List<Sports> list4 = new ArrayList<Sports>();

		sports1.setGames("Cricket");
		sports2.setGames("Chess");
		sports3.setGames("Chess");

		list2.add(sports1);
		list3.add(sports2);
		list4.add(sports3);

		emp1.setEmpId(1);
		emp1.setDept("delivery");
		emp1.setGender('M');
		emp1.setName("emp1");
		emp1.setSal(50001);
		emp1.setList(list2);

		emp2.setEmpId(2);
		emp2.setDept("education");
		emp2.setGender('F');
		emp2.setName("emp2");
		emp2.setSal(5000);
		emp2.setList(list3);
		
		emp3.setEmpId(3);
		emp3.setDept("play");
		emp3.setGender('F');
		emp3.setName("emp3");
		emp3.setSal(50000);
		emp3.setList(list4);

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		list.stream()
			.filter(e->e.getList().listIterator().next().getGames().equalsIgnoreCase("Cricket"))
			.filter(e->e.getSal()>=50000)
			.collect(Collectors.toList())
			.forEach(e->System.out.println(e.getName()));
		
		String size = list.stream()
			.collect(Collectors.groupingBy(Emplyoee::getGender,Collectors.counting()))
			.toString();

		
		System.out.println(size);
	}

}
