package com.cybertek.java_classes.Assignment_14.Question10;

public class Calculator {

    public static int plus(int num1, int num2){
        return num1+num2;
    }

    public static int minus(int num1, int num2){
        return num1-num2;
    }

    public static void main(String[] args) {

        System.out.println(Calculator.minus(1, 1));
        //returns:0

        System.out.println(Calculator.plus(10, 1));
        //returns:11

    }
}
