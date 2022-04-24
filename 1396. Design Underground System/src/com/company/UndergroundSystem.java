package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class UndergroundSystem {
    HashMap<Integer,Event> arrivals;
    HashMap<String,Average> averages;
    public UndergroundSystem() {
        arrivals=new HashMap<>();
        averages=new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        arrivals.put(id,new Event(id,stationName,t));
    }

    public void checkOut(int id, String stationName, int t) {

        Event oldEvent=arrivals.remove(id);
        String names=oldEvent.stationName+","+stationName;
        int diff = t- oldEvent.time;
        if(averages.containsKey(names)){
            Average oldAverage=averages.get(names);
            oldAverage.updateAverage(diff);
            averages.put(names,oldAverage);
        }
        else{
            Average newAverage=new Average();
            newAverage.updateAverage(diff);
            averages.put(names,newAverage);
        }
    }

    public double getAverageTime(String startStation, String endStation) {

        String names=startStation+","+endStation;
        return averages.get(names).getAverage();
    }
}
