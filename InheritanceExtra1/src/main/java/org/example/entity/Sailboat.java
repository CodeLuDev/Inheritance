package org.example.entity;

public class Sailboat extends Boat {

    private int numberOfMasts;

    public Sailboat(String registration, double length, int yearOfProduction, int numberOfMasts) {
        super(registration, length, yearOfProduction);
        this.numberOfMasts = numberOfMasts;
    }

    public int getNumberOfMasts() {
        return numberOfMasts;
    }

    public void setNumberOfMasts(int numberOfMasts) {
        this.numberOfMasts = numberOfMasts;
    }

    @Override
    public double calculateRent() {
        return super.calculateRent() + getNumberOfMasts();
    }

    @Override
    public String toString() {
        return "Sailboat{" +
                "numberOfMasts=" + numberOfMasts +
                ", registration='" + registration + '\'' +
                ", length=" + length +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
