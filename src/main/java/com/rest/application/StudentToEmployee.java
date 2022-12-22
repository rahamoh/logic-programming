package com.rest.application;

import java.util.ArrayList;
import java.util.List;

class Student{
    public String name;
    public int age;

    public Student(String stuName, int i) {
        this.name = stuName;
        this.age = i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Employee{
    public String name;
    public int age;

    public Employee(String empName, int i) {
        this.name = empName;
        this.age = i;
    }
}

public class StudentToEmployee{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("s", 12));
        list.add(new Student("stuName",32));

        List<?> list1 = list;
        list1.stream().forEach(l-> System.out.println(l));
    }
}