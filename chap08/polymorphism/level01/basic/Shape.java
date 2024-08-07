package com.seolbin.chap08.polymorphism.level01.basic;

public abstract class Shape {

    private int radius;

    public Shape() {}

    public Shape(int radius) {
        this.radius = radius;
    }

    /* 넓이 계산 메소드 */
    abstract double calculateArea();
    /* 둘레 계산 메소드 */
    abstract double calculatePerimeter();

    abstract String getName();

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
