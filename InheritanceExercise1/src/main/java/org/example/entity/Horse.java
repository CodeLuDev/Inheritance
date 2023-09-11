package org.example.entity;

public class Horse extends Animal{

    public Horse(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    public String feed() {
        return super.feed();
    }
}
