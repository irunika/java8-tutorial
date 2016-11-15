package org.wso2.java8Training.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by irunika on 11/15/16.
 */
public class PersonalDetails {
    private List<Person> personList = new ArrayList<>();

    public PersonalDetails() {
        personList.add(new Person("Irunika", 26));
        personList.add(new Person("Lakmal", 25));
        personList.add(new Person("Bhagya", 30));
        personList.add(new Person("Lakshitha", 23));
        personList.add(new Person("Ruchira", 29));
        personList.add(new Person("Lakshan", 32));
        personList.add(new Person("Lakshan", 31));
    }

    /**
     * @param age age limit of the people to be listed
     * @return the name list of the people whose age is above given age
     */
    public List<String> getNameListAboveAge(int age){
        this.personList.forEach(person -> System.out.println(person.getAge()));

        List<String> nameList = this.personList.stream()
                .filter(p -> p.isAbove(age))
                .map(p -> new String(p.getName()))
                .collect(Collectors.toList());

        return nameList;
    }


    /**
     * @param age age limit of the people to be listed
     * @return the name list of the people whose age is above given age
     */
    public List<String> getNameListBelowAge(int age){
        this.personList.forEach(person -> System.out.println(person.getAge()));

        List<String> nameList = this.personList.stream()
                /*
                If isAbove returns false which means
                it returns the true value for this logic
                 */
                .filter(p -> !p.isAbove(age))
                .map(Person::getName)
                .collect(Collectors.toList());

        return nameList;
    }



}
