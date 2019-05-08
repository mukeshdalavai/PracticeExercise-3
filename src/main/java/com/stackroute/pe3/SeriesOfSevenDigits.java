package com.stackroute.pe3;
import java.lang.Math;
import java.util.Scanner;

public class SeriesOfSevenDigits {
    public void checkDigits(int[] input)
    {
        int test=0;
        for (int i = 0; i < input.length - 1; i++) {
            if (Math.abs(input[i] - input[i + 1]) != 1) {
                System.out.println("Not consecutive numbers");
                test=1;
                break;
            }
        }
        if(test!=1)
        System.out.println("Consecutive numbers");
    }
    public static void main(String[] args) {
        int[] input=new int[7];
        SeriesOfSevenDigits seriesOfSevenDigits = new SeriesOfSevenDigits();
        System.out.println("Enter 7 digits:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<7;i++){
            input[i]=sc.nextInt();
        }
        seriesOfSevenDigits.checkDigits(input);
    }
}
