package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1=sc.nextInt();
        System.out.println("Enter the second number :");
        int num2=sc.nextInt();
        System.out.println("Select the operation you need to be performed(+,-*,/)");
        String operation=sc.next();
        int result =0;
        switch (operation)
        {
            case "+":
                result=num1+num2;
                System.out.println("Addition will be "+result);
                break;

            case "-":
                result=num1-num2;
                System.out.println("Subtraction will be "+result);
                break;
            case "*":
                result=num1*num2;
                System.out.println("multiplication will be "+result);
                break;

            case "/":
                result=num1/num2;
                System.out.println("division will be "+result);
                break;
            default:System.out.println("Joi ne nakh");

        }
    }
}
