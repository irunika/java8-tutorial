package org.wso2.java8Training.streams;

import java.util.stream.Collectors;

/**
 * Created by irunika on 11/15/16.
 */
public class Main {
    public static void main(String[] args) {
        PersonalDetails personalDetails = new PersonalDetails();

        String st = personalDetails.getNameListAboveAge(25)
                .stream()
                .collect(Collectors.toSet())
                .stream()
                .map((String s) -> "The name is : " +s + "\n")
                .collect(Collectors.joining());
        System.out.print(st);
        System.out.println("---------");
    }

}
