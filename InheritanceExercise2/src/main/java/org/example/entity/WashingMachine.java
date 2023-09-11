package org.example.entity;

public class WashingMachine extends Appliance {

    private int maxLoad;

    public WashingMachine() {
    }

    public WashingMachine(double price, String color, char energyClass, int weight, int maxLoad) {
        super(price, color, energyClass, weight);
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public void createWasher(String color, char energyClass, int weight, int maxLoad) {
        super.createAppliance(color,energyClass,weight);
        this.maxLoad = maxLoad;
    }

    public double finalPrice() {
        super.finalPrice();

        if (maxLoad > 30) {
            setPrice(getPrice() + 500);
        }

        return getPrice();
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "maxLoad=" + maxLoad +
                ", price=" + price +
                ", color=" + color +
                ", energyClass=" + energyClass +
                ", weight=" + weight +
                '}';
    }
}
