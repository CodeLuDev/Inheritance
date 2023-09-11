package org.example.entity;

public class MotorBoat extends Boat{

    private double horsepower;

    public MotorBoat(String registration, double length, int yearOfProduction, double horsepower) {
        super(registration, length, yearOfProduction);
        this.horsepower = horsepower;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public double calculateRent() {
        return super.calculateRent() + getHorsepower();
    }

    @Override
    public String toString() {
        return "MotorBoat{" +
                "horsepower=" + horsepower +
                ", registration='" + registration + '\'' +
                ", length=" + length +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
