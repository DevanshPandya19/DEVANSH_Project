package com.company;

public class palindromicpattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            //print spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print numbers with 1st half going to backward
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            //print numbers with 2nd half
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }


            System.out.println();
        }

    }
}
