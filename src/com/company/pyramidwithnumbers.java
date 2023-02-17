package com.company;

public class pyramidwithnumbers {
    public static void main(String[] args) {
        int n=5;
        //int count=0;
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
          //      count=count+1;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
