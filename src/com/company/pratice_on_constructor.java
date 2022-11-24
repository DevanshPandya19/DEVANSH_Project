package com.company;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * 3.14 * 3.14 * radius * radius + 2 * 3.14 * radius * height;

    }

    class rectangle {


        private int length;
        private int breadth;

        public rectangle() {
            this.length = 4;
            this.breadth = 5;
        }

        public rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;

        }


    }

    //problem1
    public class pratice_on_constructor {
        public static void main(String[] args) {

            Cylinder MyCylinder = new Cylinder(9, 12);
            //MyCylinder.setHeight(9);
            System.out.println(MyCylinder.getHeight());
            //MyCylinder.setRadius(33);
            System.out.println(MyCylinder.getRadius());
            System.out.println(MyCylinder.surfaceArea());
            //rectangle r =new rectangle()


        }
    }
}