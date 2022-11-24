package com.company;

abstract class Pen{
    abstract void write();
    abstract void refil();
}
class fountainPen extends Pen{
    @Override
    void write() {
        System.out.println("write");
    }

    @Override
    void refil() {
        System.out.println("Refilling");
    }
    void chanenib(){
        System.out.println("Changing the nib");

    }
}

public class PraticeQues {
    public static void main(String[] args) {
        fountainPen fp=new fountainPen();
        fp.chanenib();



    }
}
