package org.example.entity;

public class Cat extends Animal{

    public Cat(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    public String feed() {
        return super.feed();
    }
}
