package com.company;

class monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface basicAnimal{
    void eat();
    void sleep();

     }
class Human extends monkey implements basicAnimal{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class PracQue2_java {
    public static void main(String[] args) {
        Human hm=new Human();
        hm.eat();
        hm.sleep();
        hm.bite();
        hm.jump();

    }
}
