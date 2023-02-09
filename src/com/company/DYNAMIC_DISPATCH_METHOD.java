package com.company;

class Phone{
    public void showTime(){
        System.out.println("The time is 8 am");
    }
    public void on(){
        System.out.println("turning phone on");
    }

}
class SmartPhone extends Phone{
    public void Music(){
        System.out.println(("Playing music"));
    }
    public void on(){
        System.out.println("Turning smart phone On");
    }
}

public class DYNAMIC_DISPATCH_METHOD {
    public static void main(String[] args) {
        //Phone obj=new Phone();
        //SmartPhone obj2=new SmartPhone();
        Phone obj=new SmartPhone();
        obj.showTime();
        obj.on();//Allowed
        //obj.Music not allowed
    }
}
