package org.example.entity;

public final class Camping extends ExtraHotel{

    private int maxCapacityTents;
    private int numToilets;
    private boolean hasARestaurant;

    public Camping(String name, String address, String location, String manager, boolean isPrivate, double squareMeter, int maxCapacityTents, int numToilets, boolean hasARestaurant) {
        super(name, address, location, manager, isPrivate, squareMeter);
        this.maxCapacityTents = maxCapacityTents;
        this.numToilets = numToilets;
        this.hasARestaurant = hasARestaurant;
    }

    public int getMaxCapacityTents() {
        return maxCapacityTents;
    }

    public void setMaxCapacityTents(int maxCapacityTents) {
        this.maxCapacityTents = maxCapacityTents;
    }

    public int getNumToilets() {
        return numToilets;
    }

    public void setNumToilets(int numToilets) {
        this.numToilets = numToilets;
    }

    public boolean isHasARestaurant() {
        return hasARestaurant;
    }

    public void setHasARestaurant(boolean hasARestaurant) {
        this.hasARestaurant = hasARestaurant;
    }

    @Override
    public String toString() {
        return "Camping{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", manager='" + manager + '\'' +
                ", isPrivate=" + isPrivate +
                ", squareMeter=" + squareMeter +
                ", maxCapacityTents=" + maxCapacityTents +
                ", numToilets=" + numToilets +
                ", hasARestaurant=" + hasARestaurant +
                '}';
    }
}
