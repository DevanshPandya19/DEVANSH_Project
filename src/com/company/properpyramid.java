package com.company;

public class properpyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers-print number of rows
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers-print number of rows
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
