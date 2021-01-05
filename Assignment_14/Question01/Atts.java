package com.cybertek.java_classes.Assignment_14.Question01;

public class Atts {

    public String name;
    public String color;
    public int amount;

    public String asString(){
        return "name: "+name+ " color: "+color+" amount: "+amount;
    }

    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "table";
        a.color = "brown";
        a.amount = 1;

        System.out.println(a.asString());

      //  name: table color: brown amount: 1

    }

}
