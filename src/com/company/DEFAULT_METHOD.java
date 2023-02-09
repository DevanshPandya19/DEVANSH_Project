package com.company;

interface animal{
    //Default method
    default void say(){
        System.out.println("Hello this is default method");
    }
    //abstract method
    void bark();
}
class dp implements animal{
    @Override
    public void bark() {
        System.out.println("Dogs are barking");
    }
}

public class DEFAULT_METHOD {
    public static void main(String[] args) {
        dp d=new dp();
        d.bark();
        d.say();

    }
}
