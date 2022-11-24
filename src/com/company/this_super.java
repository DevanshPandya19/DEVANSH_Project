package com.company;

class chw{
    int x;

    public int getX() {
        return x;
    }
    chw(int x){
        this.x=x;

    }

}


public class this_super {
    public static void main(String[] args) {
        chw cp=new chw(65);
        System.out.println(cp.getX());

    }
}
