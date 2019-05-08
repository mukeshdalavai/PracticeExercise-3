package com.stackroute.pe3;

import java.util.Scanner;

public class MatrixAddition {
    int[][] firstMatrix;
    int[][] secondMatrix;
    int rows,columns;
    public MatrixAddition(){
    System.out.println("Enter the Number of rows and columns: ");
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        columns=sc.nextInt();
        firstMatrix=new int[rows][columns];
        secondMatrix=new int[rows][columns];
    }
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data for 1st Matrix: ");
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                firstMatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the data for 2nd Matrix: ");
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                secondMatrix[i][j]=sc.nextInt();
            }
        }

    }
    public int[][] sum(){
        getData();
        int[][] result=new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                result[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        return result;
    }
    public static void main(String[] args){
        MatrixAddition matrixAddition=new MatrixAddition();
        int result[][]=matrixAddition.sum();
    }
}