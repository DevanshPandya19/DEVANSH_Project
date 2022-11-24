package com.company;


class MyTh extends Thread{
    public MyTh(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you "+this.getName());

    }
}

public class Thread_Priorities {
    public static void main(String[] args) {
        //ready Queue
        MyTh t1=new MyTh("dp1");
        MyTh t2=new MyTh("dp2");
        MyTh t3=new MyTh("dp3");
        MyTh t4=new MyTh("dp4");
        MyTh t5=new MyTh("dp5(most important)");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();


    }
}
