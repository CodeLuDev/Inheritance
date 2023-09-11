package org.example.entity;

public class Circle implements CalculationsShapes {

    private final double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return PI * (radius * 2);
    }
}
