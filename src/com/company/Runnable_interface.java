package com.company;

class MythreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
    }
}
class MythreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
        System.out.println("I am a thread 2 not a threat 1");
    }
}
public class Runnable_interface {
    public static void main(String[] args) {
        MythreadRunnable1 Bullet1 =new MythreadRunnable1();
        Thread gun1=new Thread(Bullet1);

        MythreadRunnable2 Bullet2 =new MythreadRunnable2();
        Thread gun2=new Thread(Bullet2);

        gun1.start();
        gun2.start();

    }
}
