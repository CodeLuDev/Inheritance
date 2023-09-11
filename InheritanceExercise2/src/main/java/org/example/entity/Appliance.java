package org.example.entity;

public class Appliance {

    protected double price;
    protected String color;
    protected char energyClass;
    protected int weight;

    public Appliance() {
    }

    public Appliance(double price, String color, char energyClass, int weight) {
        this.price = price;
        this.color = color;
        this.energyClass = energyClass;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(char  energyClass) {
        this.energyClass = energyClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void createAppliance(String color, char energyClass, int weight) {
        setPrice(1000);
        this.color = color;
        this.energyClass = energyClass;
        this.weight = weight;

        checkEnergyConsumption(energyClass);
        checkColor(color);
    }

    public double finalPrice() {
        checkingTheLetter();
        checkingTheWeight();

        return getPrice();
    }

    private void checkingTheLetter() {
        char letter = getEnergyClass();

        if (letter == 'A' || letter == 'a') {
            setPrice(getPrice() + 1000);
        }

        if (letter == 'B' || letter == 'b') {
            setPrice(getPrice() + 800);
        }

        if (letter == 'C' || letter == 'c') {
            setPrice(getPrice() + 600);
        }

        if (letter == 'D' || letter == 'd') {
            setPrice(getPrice() + 500);
        }

        if (letter == 'E' || letter == 'e') {
            setPrice(getPrice() + 300);
        }

        if (letter == 'F' || letter == 'f') {
            setPrice(getPrice() + 100);
        }
    }

    private void checkingTheWeight() {
        int weight = getWeight();

        if (weight >= 1 && weight <= 19) {
            setPrice(getPrice() + 100);
        }

        if (weight >= 20 && weight <= 49) {
            setPrice(getPrice() + 500);
        }

        if (weight >= 50 && weight <= 79) {
            setPrice(getPrice() + 800);
        }

        if (weight > 80) {
            setPrice(getPrice() + 1000);
        }
    }

    private void checkEnergyConsumption(char letter) {
        char[] letters = {'A','B','C','D','E','F'};
        boolean isGreaterThanF = false;

        for (char c : letters) {
            if (letter > 'F') {
                isGreaterThanF = true;
                break;
            }
        }

        if (isGreaterThanF) {
            setEnergyClass('F');
        }
    }

    private void checkColor(String color) {
        if (!color.equalsIgnoreCase("White") && !color.equalsIgnoreCase("Black") &&
                !color.equalsIgnoreCase("Red") && !color.equalsIgnoreCase("Blu") &&
                !color.equalsIgnoreCase("Grey")) {
            setColor("White");
        }
    }
}
