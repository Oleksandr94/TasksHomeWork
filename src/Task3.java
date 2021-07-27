package com.company;
import java.util.Scanner;

public class Task3 {

        public static void main(String arg[])
        {
            int n;
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter any number ");
            n=sc.nextInt();
            System.out.println("Next number ("+n+") is:"+next(n));

        }
        static int next(int n)
        {
            return ++n;
        }
}
