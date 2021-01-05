package com.cybertek.java_classes.Assignment_14.Question12;

public class CameraPhone extends Phone{

    int imageSize;
    int memorySize;

    public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }


    public int numPictures(){
        return memorySize*1000/imageSize;
    }

    public static void main(String[] args) {

        CameraPhone cp = new CameraPhone(10,4);
        System.out.println(cp.numPictures());


    }
}
