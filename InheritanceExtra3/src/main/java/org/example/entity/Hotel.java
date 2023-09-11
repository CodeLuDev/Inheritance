package org.example.entity;

public abstract class Hotel extends Accommodation{

    protected int numRooms;
    protected int numBeds;
    protected int numFloors;
    protected double priceRoom;

    public Hotel(String name, String address, String location, String manager, int numRooms, int numBeds, int numFloors) {
        super(name, address, location, manager);
        this.numRooms = numRooms;
        this.numBeds = numBeds;
        this.numFloors = numFloors;
        //this.priceRoom = priceRoom;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }

    //methods
    public abstract double calculateRoomPrice();

}
