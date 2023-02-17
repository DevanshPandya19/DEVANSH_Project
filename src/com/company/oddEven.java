package com.company;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%3==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is o8dd");
        }
    }
}
