package com.example;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        System.out.println("Creating the first shape...");
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();


        System.out.println("Creating the second shape...");
        Shape shape2 = shapeFactory.getShape("Triangle");
        shape2.draw();

        System.out.println("Creating the third shape...");
        Shape shape3 = shapeFactory.getShape("Circle");
        shape3.draw();
    }
}
