package com.company;
import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {
                int min,sec;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Minutes");
                min=sc.nextInt();
                sec=min*60;
                System.out.println("Seconds: "+sec);
        }
}

