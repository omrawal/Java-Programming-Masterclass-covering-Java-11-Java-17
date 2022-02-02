package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre=new Theatre("PVR",5,15);
//        theatre.getSeats();
        if(theatre.reserveSeat("E11")){
            System.out.println("Booking of seat successful please pay");
        }
        else{
            System.out.println("Failed to book the seat");
        }
        if(theatre.reserveSeat("E11")){
            System.out.println("Booking of seat successful please pay");
        }
        else{
            System.out.println("Failed to book the seat");
        }
    }

}
