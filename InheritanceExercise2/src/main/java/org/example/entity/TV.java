package org.example.entity;

public class TV extends Appliance {

    private int resolution;
    private boolean TDT;

    public TV() {
    }

    public TV(double price, String color, char energyClass, int weight, int resolution, boolean TDT) {
        super(price, color, energyClass, weight);
        this.resolution = resolution;
        this.TDT = TDT;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void createTv(String color, char energyClass, int weight, int resolution, boolean TDT) {
        super.createAppliance(color,energyClass,weight);
        this.resolution = resolution;
        this.TDT = TDT;
    }

    public double finalPrice() {
        super.finalPrice();

        if (resolution > 40) {
            setPrice(getPrice() + (getPrice() * 0.30));
        }

        if (TDT) {
            setPrice(getPrice() + 500);
        }

        return getPrice();
    }

    @Override
    public String toString() {
        return "TV{" +
                "resolution=" + resolution +
                ", TDT=" + TDT +
                ", price=" + price +
                ", color=" + color +
                ", energyClass=" + energyClass +
                ", weight=" + weight +
                '}';
    }
}
