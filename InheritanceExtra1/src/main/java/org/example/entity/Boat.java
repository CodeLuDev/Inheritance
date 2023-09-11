package org.example.entity;

public class Boat extends Rent {

    protected String registration;
    protected double length; //in meters
    protected int yearOfProduction;

    public Boat() {
    }

    public Boat(String registration, double length, int yearOfProduction) {
        this.registration = registration;
        this.length = length;
        this.yearOfProduction = yearOfProduction;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

}
