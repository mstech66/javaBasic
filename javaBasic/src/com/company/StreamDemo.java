package com.company;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.groupingBy;

enum Gender{
    MALE,
    FEMALE
}

class Person{
    String name;
    int age;
    Gender gender;

    Person(String name, Gender gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Gender getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Manthan", Gender.MALE, 21),
                new Person("Manthan", Gender.MALE, 72),
                new Person("Sila", Gender.FEMALE, 18),
                new Person("Mona", Gender.FEMALE, 17),
                new Person("Emy", Gender.FEMALE, 16)
        );
        //get person's name capitalised whose age is greater than 18
        people.stream().filter(person -> person.getAge() > 18).map( person -> person.getName().toUpperCase()).forEach(System.out::println);
        //get total age of everyone
        int totalAge = people.stream().map(Person::getAge).reduce(0, (carry, age) -> carry += age);
        int betterTotalAge = people.stream().map(Person::getAge).reduce(0, Integer::sum);
        int evenBetterTotalAge = people
                .stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println(totalAge + " " + betterTotalAge + " " + evenBetterTotalAge);
        //count no of people who are teens
        System.out.println(
                people.stream()
                .filter(person -> person.getAge() < 18)
                .count()
        );
        //count females in this group
        long femaleCount = people.stream()
                .filter(person -> person.getGender() == Gender.FEMALE)
                .count();
        System.out.println("Females are " + femaleCount);
        //find average female age in this group
        int totalFemaleAge = people.stream()
                .filter(person -> person.getGender() == Gender.FEMALE)
                .map(Person::getAge)
                .reduce(0, (carry, age) -> carry+=age);
        System.out.println("Average Female Age is " + totalFemaleAge / femaleCount);
        //list and set example
        List<String> nameList = people.stream()
                .filter(person -> person.getGender() == Gender.MALE)
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(nameList);
        Set<String> nameSet = people.stream()
                .filter(person -> person.getGender() == Gender.MALE)
                .map(Person::getName)
                .collect(Collectors.toSet());
        System.out.println(nameSet);
        //create a hashmap based on gender like Map<Gender, List<Person>>
        Map<Gender, List<Person>> genderListMap = people.stream()
                .collect(groupingBy(Person::getGender));
        System.out.println(genderListMap);
        //sort by age in the collection
        people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);
        //IntStreams
        IntStream.range(1, 10).forEach(System.out::println);
        int[] intArray = IntStream.range(0, 10).toArray();
        for(int item: intArray){
            System.out.println(item);
        }
    }
}
