package com.infy.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {

		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Aharon", 21, "Female"));
		personList.add(new Person("Maria", 18, "Female"));
		personList.add(new Person("Jack", 2, "Male"));
		personList.add(new Person("James", 3, "Male"));

//      Map<String, List<Person>> map = personList.stream()
//        	.collect(Collectors.groupingBy(Person::getGender));

		Collections.sort(personList, new NameComparator());
		System.out.println(personList);

		Map<String, Optional<Person>> map = personList.stream().collect(
				Collectors.groupingBy(Person::getGender, Collectors.maxBy(Comparator.comparing(Person::getAge))));

//      map.entrySet()
//      	.forEach(e->System.out.println(e.getKey() + e.getValue()));

		System.out.println(map.toString());
	}

}
