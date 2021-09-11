package com.company;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width,double length,double height){
        super(length,width);
        this.height=height<0?0:height;
    }
    public double getVolume(){
        return this.height*getArea();
    }

    public double getHeight() {
        return height;
    }
}
