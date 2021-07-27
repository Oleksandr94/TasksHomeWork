package com.company;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int hor,sec;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hours");
        hor=sc.nextInt();
        sec=hor*3600;
        System.out.println("Seconds: "+sec);
    }
}