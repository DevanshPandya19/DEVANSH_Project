/*package com.company;

import java.util.Arrays;

public class Choclatedistribution {
    static int choclate(int arr[], int n, int m) {
        Arrays.sort(arr);
        int min = arr[0];
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min)
                min = diff;

            return min;
        }

    }

    public static void main(String[] args) {
        int arr[]={3,4,1,9,56,7,9,12};
        int n=arr.length;
        int m=5;
        System.out.println(choclate(arr,n,m));


    }

}*/
