package com.company;

import java.util.Scanner;

public class functionexcercies {

    public static int averagetwonumbers(int a,int b){
        int avg=(a+b)/2;
        return avg;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int avg=averagetwonumbers(a,b);
        System.out.println(avg);

    }
}
/*import java.util.*;


public class Solutions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print(a+" ");

        if(n > 1) {
            //find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b+" ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }


            System.out.println();
        }
    }
}*/
