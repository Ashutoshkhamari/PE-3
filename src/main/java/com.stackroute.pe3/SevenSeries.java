package com.stackroute.pe3;


import java.lang.Math;

public class SevenSeries {

    public void checkDigits(int[] input) {

        for (int i = 0; i < input.length - 1; i++) {
            if (Math.abs(input[i] - input[i + 1]) != 1)

                System.out.println("Not consecutive numbers");
        }

        System.out.println("Consecutive numbers");
    }


    public static void main(String[] args) {

        SevenSeries seriesOfSevenDigits = new SevenSeries();
        int[] input1={1,2,3,4,5,6,7,8,9};
        seriesOfSevenDigits.checkDigits(input1);

    }
}
