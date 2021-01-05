package com.cybertek.java_classes.Assignment_14.Question02;

public class LameCalculator {

    public int plus(int num1, int num2){
        return num1+num2;
    }
    public int minus(int num1, int num2){
        return num1-num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;
    }
    public int divide(int num1, int num2){
        return num1/num2;
    }

    public static void main(String[] args) {

        LameCalculator lc = new LameCalculator();

        System.out.println(lc.plus(1, 1));
        //returns:2

        System.out.println(lc.minus(1, 1));
        //returns:0

        System.out.println(lc.multiply(2, 1));
        //returns:2

        System.out.println(lc.divide(10, 2));
        //returns:5

    }
}
