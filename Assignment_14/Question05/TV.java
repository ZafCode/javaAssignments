package com.cybertek.java_classes.Assignment_14.Question05;

public class TV {

    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {

        if (channel>0 && channel<=120){
            this.channel = channel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel.");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {

        if (volumeLevel>=1 && volumeLevel<=7 && on){
            this.volumeLevel = volumeLevel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level.");
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        setChannel(channel++);
    }

    public void channelDown(){
        setChannel(channel--);
    }

    public void volumeUp(){
        volumeLevel++;
    }

    public void volumeDown(){
        volumeLevel--;
    }

    public boolean isOn(){
        return on;
    }

    public void turnOn(){
        if (!on){
            on = true;
        }else{
            System.out.println("TV is already ON.");
        }
    }

    public void turnOff(){
        if (on){
            on = false;
        }else{
            System.out.println("TV is already OFF.");
        }
    }


}
