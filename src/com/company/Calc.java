package com.company;

import java.util.Scanner;

public class Calc {
    int x,y;
    public  void getInputFromUser(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1=sc.nextInt();
        System.out.println("Enter the second number :");
        int num2=sc.nextInt();
    }
    public void sum(){
        int ans=x+y;
        System.out.println("answer is "+ans);
    }
    public void sub(){
        int ans=x-y;
        System.out.println("answer is "+ans);
    }
    public void mul(){
        int ans=x*y;
        System.out.println("answer is "+ans);
    }
    public void div(){
        int ans=x/y;
        System.out.println("answer is "+ans);
    }
    public void getChoice(){



    int ch=10;{
        while(ch!=0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n1.Sum\n2.Sub\n3.Mul\n4.Div\n0.Exit\nEnter your choice : ");
            String choice= sc.next();

            if (ch == 1) {
                getInputFromUser();
                sum();
            }
            else if (ch == 2) {
                getInputFromUser();
                sub();
            }
            else if (ch == 3) {
                getInputFromUser();
                mul();
            }
            else if (ch == 4) {
                getInputFromUser();
                div();
            }
            else if(ch==0){
                System.out.println("Khtam ab nhi");
            }

            else{
                System.out.println("joi ne nakh");
            }

        }

        }
    }





    public static void main(String[] args) {
        Calc m=new Calc();
        m.getInputFromUser();
        m.getChoice();
        //m.div();
        //m.mul();
        //m.sum();
        //m.sub();

    }
}
