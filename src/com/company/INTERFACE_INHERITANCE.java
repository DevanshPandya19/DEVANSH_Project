package com.company;

interface sampleinterface{
    void meth1();
    void meth2();

}
interface childsamepleinterface extends sampleinterface{
    void meth3();
    void meth4();
}
class Mysample implements childsamepleinterface{
    @Override
    public void meth1() {
        System.out.println("Meth1");
    }
    public void meth2() {
        System.out.println("Meth2");
    }
    public void meth3() {
        System.out.println("Meth3");

    }
    public void meth4() {
        System.out.println("Meth4");
    }
}

public class INTERFACE_INHERITANCE {
    public static void main(String[] args) {
        Mysample ms=new Mysample();
        ms.meth1();
        ms.meth2();
        ms.meth3();
    }
}
