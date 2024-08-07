package com.seolbin.chap08.polymorphism.level01.basic;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index = 0;

    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        if(index >= shapes.length) {
            // shapes = Arrays.copyOf(shapes, shapes.length * 2);
            Shape[] newShapes = new Shape[shapes.length * 2];
            System.arraycopy(shapes, 0, newShapes, 0, shapes.length);
            shapes = newShapes;
        }

        shapes[index++] = shape;
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for(int i=0;i<index;i++) {
            if(shapes[i].equals(shape)) {
                for(int j=i+1;j<shapes.length;j++) {
                    shapes[j-1] = shapes[j];
                }
                shapes[--index] = null;
                break;
            }
        }

    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for(Shape shape : shapes) {
            if(shape != null) {
                System.out.println("Shape : " + shape.getName());   // shape.getClass().getSimpleName()로도 쓸 수 있다. : Object 클래스의 메소드 활용
                System.out.println("Area : " + shape.calculateArea());
                System.out.println("Perimeter : " + shape.calculatePerimeter());
            } else break;
        }

    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double sum = 0;
        for(Shape shape : shapes) {
            if(shape != null) {
                sum += shape.calculateArea();
            } else break;
        }
        return sum;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sum = 0;
        for(Shape shape : shapes) {
            if(shape != null) {
                sum += shape.calculatePerimeter();
            } else break;
        }
        return sum;
    }
}