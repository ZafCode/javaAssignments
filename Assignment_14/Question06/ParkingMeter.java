package com.cybertek.java_classes.Assignment_14.Question06;

public class ParkingMeter {

    public int timeLeft = 0;
    public int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int par) {

        if (par == 25 && (timeLeft + 30) <= maxTime) {
            timeLeft += 30;
            return true;
        } else {
            return false;
        }
    }

    public void tick(){
        if (timeLeft>0){
            timeLeft--;
        }
    }

    public boolean isExpired(){
        if (timeLeft==0){
            return true;
        }else{
            return false;
        }
    }
}
