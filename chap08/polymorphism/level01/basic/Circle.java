package com.seolbin.chap08.polymorphism.level01.basic;

public class Circle extends Shape implements Resizable {

    private static double PI = 3.141592653589793;

    public Circle(int radius) {
        super(radius);
    }

    @Override
    public void resize(double factor) {
        setRadius((int) (factor * getRadius()));
    }

    @Override
    double calculateArea() {
        return getPI() * (super.getRadius() * super.getRadius());
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * getRadius();
    }

    @Override
    String getName() {
        return "Circle";
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

}
