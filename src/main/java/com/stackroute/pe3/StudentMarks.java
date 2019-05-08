package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    int numOfStudents;
    int[] stuGrades=new int[50];
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of students: ");
        numOfStudents=sc.nextInt();
        System.out.println("Enter the Grades for each Student: ");
        for (int i=0;i<numOfStudents;i++){
            stuGrades[i]=sc.nextInt();
        }
    }
    public void checkGrades(){
        for (int i=0;i<numOfStudents;i++){
            if((stuGrades[i]<0)||(stuGrades[i]>100))
                System.out.println("Grade Number "+(i+1)+" is not between 1 and 100.");
        }
    }
    public static void main(String[] args){
        StudentMarks studentMarks=new StudentMarks();
        studentMarks.getData();
        studentMarks.checkGrades();
    }
}
