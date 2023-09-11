package org.example.entity;

public final class Residence extends ExtraHotel{

    private int numOfRooms;
    private boolean discountToUnions;
    private boolean hasASportField;

    public Residence(String name, String address, String location, String manager, boolean isPrivate, double squareMeter, int numOfRooms, boolean discountToUnions, boolean hasASportField) {
        super(name, address, location, manager, isPrivate, squareMeter);
        this.numOfRooms = numOfRooms;
        this.discountToUnions = discountToUnions;
        this.hasASportField = hasASportField;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public boolean isDiscountToUnions() {
        return discountToUnions;
    }

    public void setDiscountToUnions(boolean discountToUnions) {
        this.discountToUnions = discountToUnions;
    }

    public boolean isHasASportField() {
        return hasASportField;
    }

    public void setHasASportField(boolean hasASportField) {
        this.hasASportField = hasASportField;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", manager='" + manager + '\'' +
                ", isPrivate=" + isPrivate +
                ", squareMeter=" + squareMeter +
                ", numOfRooms=" + numOfRooms +
                ", discountToUnions=" + discountToUnions +
                ", hasASportField=" + hasASportField +
                '}';
    }
}
