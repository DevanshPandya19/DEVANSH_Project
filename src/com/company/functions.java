package com.company;

import java.util.Scanner;

public class functions {
   // public static int calculatesum(int a,int b){
     //   int sum=a*b;
       // return sum;
    //}
    public static void printFactorial(int n){
        //loop
        int factorial=1;
        for (int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial of a number is "+factorial);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printFactorial(n);


    }
}
