package com.company;

import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();//size kitni chayie
        int numbers[]=new int[size];//total number of elemnts kitne chayie

        for (int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }


        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

    }
}
