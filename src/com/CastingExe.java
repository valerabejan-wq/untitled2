package com;

public class CastingExe {
    public static void main(String[] args) {
        // повышения

        byte myByte =127;
        int myInt = myByte;
        System.out.println(myInt);
        double myDouble = myInt;
        System.out.println(myDouble);

        //понижения

        int highInt = 400;
        byte highByte = (byte) highInt;
        System.out.println(highByte); /* 400-256 = 146 - 256 = -112 */


        double highDouble = 100.9;
        highInt = (int) highDouble;
        System.out.println(highInt);


    }
}
