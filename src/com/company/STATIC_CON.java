package com.company;

class Myobj{
    int x=0;
    static int y=0;
    static int count=0;

    Myobj(int a,int b){
        x=x+a;
        y=y+b;
        count++;

    }
    static void printObjCount(){
        System.out.println("Count :"+ count);
    }
    void printData(){
        System.out.println("X: "+x+"Y :"+y);
    }
}

public class STATIC_CON {
    public static void main(String[] args) {
        Myobj m1=new Myobj(10,10);
        m1.printData();
        Myobj m2=new Myobj(20,20);
        m2.printData();
        Myobj m3=new Myobj(30,30);

     //m1.printData();
       //m2.printData();
       m3.printData();

    }
}
