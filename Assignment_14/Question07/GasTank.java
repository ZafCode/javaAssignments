package com.cybertek.java_classes.Assignment_14.Question07;

public class GasTank {

    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double gas){

        if ((amount+gas) >= capacity){
            amount=capacity;
        }else{
            amount+=gas;
        }
    }

    public void useGas(double gas){

        if ((amount-gas) <= 0){
            amount=0;
        }else{
            amount-=gas;
        }
    }

    public boolean isEmpty(){
        if (amount<0.1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (amount>capacity-0.1){
            return true;
        }else{
            return false;
        }
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        double difference = capacity-amount;
        amount=capacity;
        return difference;
    }

}
