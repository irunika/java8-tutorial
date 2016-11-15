package org.wso2.java8Training.sort;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by irunika on 11/15/16.
 */
public class Sorter {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Irunika");
        nameList.add("Lakmal");
        nameList.add("Saman");
        nameList.add("Andrew");
        nameList.add("Weera");
        nameList.add("Janith");

        Sorter sorter = new Sorter();
        sorter.sortUsingJava8(nameList);

        for(String name:nameList)
            System.out.println(name);

    }

    /**
     * Sorting using java 7
     */
    private void sortUsingJava7(List<String> nameList){
        Collections.sort(nameList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    /**
     * Sorting using java 8
     */
    private void sortUsingJava8(List<String> nameList){
        Collections.sort(nameList, (s1,s2) -> s1.compareTo(s2));
    }


}
