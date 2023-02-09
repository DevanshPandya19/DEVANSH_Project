package com.company;

class MyMainEmployee{
    private int id;
    private String name;

   public MyMainEmployee(String myname,int myid){
       id=myid;
       name=myname;
   }
   public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public void setId(int  i){this.id=i;}
    public int  getId(){return id;}

}

public class Constructors_dp {
    public static void main(String[] args) {
        MyMainEmployee Dev=new MyMainEmployee("devansh",99);
        System.out.println(Dev.getName());
        //System.out.println((Dev.getName()));

    }
}
