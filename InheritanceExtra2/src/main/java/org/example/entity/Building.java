package org.example.entity;

public abstract class Building {

    protected double width;
    protected double height;
    protected double length;

    public Building() {
    }

    public Building(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //methods
    public abstract double calculateSurface();

    public abstract double calculateVolume();
}
