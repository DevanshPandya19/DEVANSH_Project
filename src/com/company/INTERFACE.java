package com.company;

interface  bicycle{
    int a =45;
    void applyBrake(int decrement);
    void speedup(int increment);


}
interface HornBicycle{
    void blowhornk3g();
    void blowhoenMHN();

}
class Avoncycle implements bicycle,HornBicycle{
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedup(int increment){
        System.out.println("speed up");
    }
    public void blowhornk3g(){
        System.out.println("ASP");

    }
    public void blowhoenMHN(){
        System.out.println("pp");

    }

}

public class INTERFACE {
    public static void main(String[] args) {
        Avoncycle c=new Avoncycle();
        c.applyBrake(4);
        c.speedup(7);
        c.blowhoenMHN();
        c.blowhornk3g();
    }
}
