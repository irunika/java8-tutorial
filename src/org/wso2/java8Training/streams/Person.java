package org.wso2.java8Training.streams;

/**
 * Created by irunika on 11/15/16.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @param age the age limit to be lest
     * @return whether the person's age is above the given age
     */
    public boolean isAbove(int age){
        return this.age > age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
