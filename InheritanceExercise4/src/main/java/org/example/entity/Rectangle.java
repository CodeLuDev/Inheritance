package org.example.entity;

public class Rectangle implements CalculationsShapes{

    private final int b;
    private final int h;
    private final double PI = 3.14;

    public Rectangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return b * h;
    }

    @Override
    public double perimeter() {
        return (b * h) * 2;
    }
}
