package org.example.entity;

public class OfficeBuilding extends Building {

    private int numOffices;
    private int numPeopleInOffice;
    private int numFloors;

    public OfficeBuilding(double width, double height, double length, int numOffices, int numPeopleInOffice, int numFloors) {
        super(width, height, length);
        this.numOffices = numOffices;
        this.numPeopleInOffice = numPeopleInOffice;
        this.numFloors = numFloors;
    }

    public int getNumOffices() {
        return numOffices;
    }

    public void setNumOffices(int numOffices) {
        this.numOffices = numOffices;
    }

    public int getNumPeopleInOffice() {
        return numPeopleInOffice;
    }

    public void setNumPeopleInOffice(int numPeopleInOffice) {
        this.numPeopleInOffice = numPeopleInOffice;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int numberOfPeople() {
        return numPeopleInOffice * numOffices; //entire building
    }

    @Override
    public double calculateSurface() {
        return numFloors * 2 * (length * width + length * height + width * height);
    }

    @Override
    public double calculateVolume() {
        return  numFloors * (width * height * length);
    }
}
