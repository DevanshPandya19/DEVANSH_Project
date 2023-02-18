package com.company;

import java.util.Scanner;

public class arrays3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();//size kitni chayie
        String names[]=new String [size];

        //INPUT
        for (int i=0;i<size;i++){
            names[i]= sc.next();
        }
        //output
        for (int i=0;i<names.length;i++){
            System.out.print(names[i]+" ");
        }
    }
}
