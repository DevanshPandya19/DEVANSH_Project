package com.company;

public class reverseArray {

    public  static void reverseArray(int arr[],int start,int end ){
        int temp;
        while (start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[],int size){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
       // System.out.println(" array is \n ");
        printArray(arr,6);
        reverseArray(arr, 0, 5);
        System.out.println("Reversed array is \n ");
        printArray(arr, 6);


    }
}
