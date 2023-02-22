package com.company;

public class missingelement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        int xorArray = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xorArray = xorArray ^ arr[i];
        }
        int xorAllArray = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xorAllArray = xorAllArray ^ arr[i];
        }
        int missingNumber=xorArray^xorAllArray;
        System.out.println("Misssing element in an array is:"+missingNumber);
    }
}
