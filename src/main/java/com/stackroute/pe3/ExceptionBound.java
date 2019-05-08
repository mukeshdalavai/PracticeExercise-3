package com.stackroute.pe3;
import java.util.Scanner;

public class ExceptionBound {

    public static void main (String[] args) {

        while (true) {

            int[] arr =new int[5];
            int num;
            System.out.print("Enter number of integers : ");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            try {

                for(int i=1;i<num;i++)
                {
                    System.out.println(arr[num]);
                }
                System.out.print("Enter number : ");
                int no = input.nextInt();

            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.toString());
            }
            catch (NegativeArraySizeException x) {
                System.out.println(x);
            }
            catch (NullPointerException x) {
                System.out.println(x);
            }
            finally {
                System.out.println("Finally arrived");
            }

        }
    }
}