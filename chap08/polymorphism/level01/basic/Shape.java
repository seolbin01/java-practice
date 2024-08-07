package com.seolbin.chap08.polymorphism.level01.basic;

public abstract class Shape {

    public Shape() {}

    /* 넓이 계산 메소드 */
    abstract double calculateArea();
    /* 둘레 계산 메소드 */
    abstract double calculatePerimeter();

    abstract String getName();

}
