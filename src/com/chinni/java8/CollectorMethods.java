package com.chinni.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class CollectorMethods {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("David", 25),
                new Person("Eve", 35)
        );
        List<String> namesList = people.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("namesList  - " + namesList);
//        namesList  - [Alice, Bob, Charlie, David, Eve]

        Set<String> uniqueNames = people.stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("uniqueNames  - " + uniqueNames);
//        uniqueNames  - [Alice, Bob, Charlie, David, Eve]

        String concatenatedStrings = people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println(concatenatedStrings);
//        Alice, Bob, Charlie, David, Eve

        Integer computeAgeSum = people.stream().mapToInt(Person::getAge).sum();
        System.out.println(computeAgeSum);
//        145

        Map<Integer, List<Person>> mapCountWithPersons = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(mapCountWithPersons);
//        {35=[Person{name='Eve', age=35}], 25=[Person{name='Bob', age=25}, Person{name='David', age=25}], 30=[Person{name='Alice', age=30}, Person{name='Charlie', age=30}]}

        Map<Boolean, List<String>> personsAbove30 = people.stream()
                .collect(Collectors.partitioningBy(person -> (person.getAge() >= 30),
                        Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(personsAbove30);
//        {false=[Person{name='Bob', age=25}, Person{name='David', age=25}], true=[Person{name='Alice', age=30}, Person{name='Charlie', age=30}, Person{name='Eve', age=35}]}

        Map<String, Integer> mapStringValue = Stream.of("AA", "B", "C").collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(mapStringValue);
    }
}
