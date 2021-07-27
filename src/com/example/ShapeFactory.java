package com.example;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if(shapeType.isEmpty()) {
            return null;
        }
        switch (shapeType) {
            case "Triangle":
                return new Triangle();
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
