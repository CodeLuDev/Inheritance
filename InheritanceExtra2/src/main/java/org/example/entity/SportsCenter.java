package org.example.entity;

public class SportsCenter extends Building{

    private boolean isCovered;

    public SportsCenter(double width, double height, double length, boolean isCovered) {
        super(width, height, length);
        this.isCovered = isCovered;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public void setCovered(boolean covered) {
        isCovered = covered;
    }

    @Override
    public double calculateSurface() {
        double surface;
        if (isCovered) {
            surface = 2 * (length * width + length * height + width * height);
        } else {
            surface = 2 * (height * width + height * length) + (width * length);
        }
        return surface;
    }

    @Override
    public double calculateVolume() {
        return width * height * length;
    }
}
