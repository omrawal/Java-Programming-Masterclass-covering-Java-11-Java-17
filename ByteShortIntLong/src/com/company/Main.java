package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int minIntVal=Integer.MIN_VALUE;
        int maxIntVal=Integer.MAX_VALUE;
        System.out.println("Min Integer value = "+minIntVal);
        System.out.println("Max Integer value = "+maxIntVal);
        System.out.println("Buster Max val = "+(maxIntVal+1));
        System.out.println("Busted Min val = "+(minIntVal-1));

        byte minByte=Byte.MIN_VALUE;
        byte maxByte=Byte.MAX_VALUE;
        System.out.println("Min Byte value = "+minByte);
        System.out.println("Max Byte value = "+maxByte);

        short minShort=Short.MIN_VALUE;
        short maxShort=Short.MAX_VALUE;
        System.out.println("Min Short value = "+minShort);
        System.out.println("Max Short value = "+maxShort);

        long myLongVal=100L;

        System.out.println("MyLong Val = "+myLongVal);
        long minLong=Long.MIN_VALUE;
        long maxLong=Long.MAX_VALUE;
        System.out.println("Min Long value = "+minLong);
        System.out.println("Max Long value = "+maxLong);
        byte myNewByteVal = (byte)(minByte/2);

        /////// primitive types challange

        byte cbyte=18;
        short cshort=125;
        int cint=111;
        long clong=50000+10*(cbyte+cshort+cint);
        System.out.println("clong = "+clong);

    }
}
