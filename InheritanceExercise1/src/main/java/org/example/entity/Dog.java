package org.example.entity;

public class Dog extends Animal {

    public Dog(String name, String food, int age, String breed) {
        super(name, food, age, breed);
    }

    public String feed() {
        return super.feed();
    }
}
