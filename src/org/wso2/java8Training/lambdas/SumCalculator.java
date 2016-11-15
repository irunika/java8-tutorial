package org.wso2.java8Training.lambdas;

/**
 * Created by irunika on 11/15/16.
 */

public class SumCalculator{
    public static void main(String[] args) {
        Cal cal = new Cal();

        cal.run((a,b) -> a+b);
    }
}


class Cal{
    public void run(Calculatable cal){
        System.out.println("Sum is : " + cal.sum(12,13));
    }
}

interface Calculatable{
    int sum(int a, int b);
}
