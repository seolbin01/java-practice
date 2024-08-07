package com.seolbin.chap08.polymorphism.level01.basic;

public class Circle extends Shape implements Resizable {

    private int radius;
    private static double PI = 3.141592653589793;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        setRadius((int) (factor * getRadius()));
    }

    @Override
    double calculateArea() {
        return getPI() * (getRadius() * getRadius());
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * getRadius();
    }

    @Override
    String getName() {
        return "Circle";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

}
