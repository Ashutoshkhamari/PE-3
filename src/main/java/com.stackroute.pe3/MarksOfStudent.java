package com.stackroute.pe3;


import java.util.Scanner;

class MarksOfStudent {
    int numOfStudents;
    int[] grade=new int[50];
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of students: ");
        numOfStudents=sc.nextInt();
        System.out.println("Enter the Grades for each Student: ");
        for (int i=0;i<numOfStudents;i++){
            grade[i]=sc.nextInt();
        }
    }
    public void checkGrades(){
        for (int i=0;i<numOfStudents;i++){
            if((grade[i]<0)||(grade[i]>100)) {
                System.out.println("Grade Num. " + (i + 1) + " is not betn 1 and 100");
            }
        }
    }
    public static void main(String[] args){
        MarksOfStudent studentMarks=new MarksOfStudent();
        studentMarks.getData();
        studentMarks.checkGrades();
    }
}