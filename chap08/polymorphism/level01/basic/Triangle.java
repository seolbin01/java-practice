package com.seolbin.chap08.polymorphism.level01.basic;

public class Triangle extends Shape implements Resizable {

    private int base;
    private int height;
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int base, int height, int side1, int side2, int side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void resize(double factor) {
        setBase((int) (factor * getBase()));
        setHeight((int) (factor * getHeight()));
        setSide1((int) (factor * getSide1()));
        setSide2((int) (factor * getSide2()));
        setSide3((int) (factor * getSide3()));
    }

    @Override
    double calculateArea() {
        return (double) (base * height) / 2;
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    String getName() {
        return "Triangle";
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
}
