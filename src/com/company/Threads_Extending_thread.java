package com.company;

class Mythread extends Thread{
    public void run(){
        int i=0;
        while (i<40000){
            System.out.println("My cooking thread is running");
            System.out.println("I am happy");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");

            i++;
        }
    }
}


public class Threads_Extending_thread {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();

    }
}
