package com.company;

import java.util.*;

public class Array_list {

    public static void main(String[] args) {
        ArrayList<Integer> l1 =new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>(5);
        l2.add(99);
        l2.add(97);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(0,5);
        l1.add(0,33);
        l1.addAll(l2);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(159));
         for(int i=0; i<l1.size(); i++){
          System.out.print(l1.get(i));
          System.out.print(", ");
        }
    }

}
