package com.company;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int size=sc.nextInt();
        int Numbers[]=new int[size];

        //input
        for (int i=0;i<size;i++){
            Numbers[i]= sc.nextInt();
        }
        int x= sc.nextInt();


        //output
        for (int i=0;i<Numbers.length;i++){
            if (Numbers[i]==x){
                System.out.println("x found at index "+i);
            }
        }
        }
    }

