package org.example.entity;

public class Yacht extends Boat{

    private double horsepower;
    private int numberOfCabins;

    public Yacht(String registration, double length, int yearOfProduction, double horsepower, int numberOfCabins) {
        super(registration, length, yearOfProduction);
        this.horsepower = horsepower;
        this.numberOfCabins = numberOfCabins;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

    public int getNumberOfCabins() {
        return numberOfCabins;
    }

    public void setNumberOfCabins(int numberOfCabins) {
        this.numberOfCabins = numberOfCabins;
    }

    @Override
    public double calculateRent() {
        return super.calculateRent() + getHorsepower() + getNumberOfCabins();
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "horsepower=" + horsepower +
                ", numberOfCabins=" + numberOfCabins +
                ", registration='" + registration + '\'' +
                ", length=" + length +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
