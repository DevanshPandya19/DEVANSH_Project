package com.company;

abstract class parent2{
     parent2(){
        System.out.println("i am constructor 1 ");

    }
    public void sayhello(){

         System.out.println("Hello how r u");
    }
    abstract public void greet();
    abstract public void greet2();

}
class child extends parent2{
    @Override
    public void greet() {
        System.out.println("Good morning");

    }
    child(){
        System.out.println("I am constructor 2");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}
 abstract class child3 extends parent2{
    public void cricket(){
        System.out.println("Cricket is good");
    }

 }

public class ABSTARCT {
    public static void main(String[] args) {
        //parent2 p=new parent2(); error
        child c =new child();
        //child3 c3=new child3();error
        //System.out.println(parent2());





            }
        }



