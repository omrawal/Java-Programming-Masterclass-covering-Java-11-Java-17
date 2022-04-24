package com.company;

public class Average {
    public double total;
    public int count;

    public void updateAverage(int diff){
        ++count;
        total+=diff;
    }

    public double getAverage(){
        return  total/count;
    }
}
