package com.rest.application;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee1 {

    private String name;
    private Integer id;

    public Employee1(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee1)) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(getName(), employee1.getName()) && Objects.equals(getId(), employee1.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }*/

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
//        HashSet<Employee1> set = new HashSet<>();
//        HashMap<String, Employee1> map = new HashMap<>();
//        map.put("1234", new Employee1("Ram", 18));
//        map.put("1234", new Employee1("Ram", 18));
//        map.put(null,null);
//        map.put(null,null);
        Employee1 employee1 = new Employee1("Ram", 18);
        Employee1 employee2 = new Employee1("Ram", 16);

        List<Employee1> list = new ArrayList();
        list.add(employee1);
        list.add(employee2);

        List list1  = list.stream().map(e->e.getName()).collect(Collectors.toList());
        System.out.println(list1);
////        set.add(null);
////        set.add(null);
//
//        map.entrySet().stream().forEach(e-> System.out.println(e.getKey() +"-->"+e.hashCode()));
//
//        System.out.println("-----------------------");
//
//        Stream.of(Arrays.asList(1,2),Arrays.asList(3,4))
//                .flatMap(List::stream)
//                .map(i->i+100)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);



    }
}
