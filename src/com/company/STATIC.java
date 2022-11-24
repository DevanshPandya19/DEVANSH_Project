package com.company;

class Mycls{
    int x;
    static int y;

    Mycls(){
        System.out.println("Object is created");
    }
    Mycls(int a,int b){
        x=a;
        y=b;
    }
    void printData(){
        System.out.println("X :"+x+"Y:"+y);
    }
    static void printY(){
        System.out.println("Y :"+y);
    }
}

public class STATIC {
    public static void main(String[] args) {
      //  Mycls m1=new Mycls(10,10);
        //Mycls m2=new Mycls(10,20);
        //Mycls m3=new Mycls(10,30);

        //m1.printData();
        //m2.printData();
        //m3.printData();
        Mycls m1=new Mycls(10,10);
        m1.printData();
        Mycls m2=new Mycls(10,20);
        m1.printY();
        m2.printData();
        Mycls m3=new Mycls(10,30);
        //m2.printData();
        m3.printData();
        m3.printY();
        m2.printY();


    }
}
