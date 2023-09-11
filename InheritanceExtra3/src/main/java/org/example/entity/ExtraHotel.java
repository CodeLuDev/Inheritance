package org.example.entity;

public class ExtraHotel extends Accommodation{

    protected boolean isPrivate;
    protected double squareMeter;

    public ExtraHotel(String name, String address, String location, String manager, boolean isPrivate, double squareMeter) {
        super(name, address, location, manager);
        this.isPrivate = isPrivate;
        this.squareMeter = squareMeter;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }
}
