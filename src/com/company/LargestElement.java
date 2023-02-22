package com.company;

   public class LargestElement {
    public static void main(String[] args) {
        int arr[]={3,67,299,4},max=arr[0],min=arr[0];


        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if (arr[i]<min){
                min=arr[i];
           // else {
             //   smax=arr[i];
            }
        }
        System.out.println("Largest element in an array is "+max);
        System.out.println("smallest element in an array is "+min);
    }
}
