package org.example.entity;

public class Animal {

    protected String name;
    protected String food;
    protected int age;
    protected String breed;

    public Animal(String name, String food, int age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }

    public String feed() {
        return "This " +
                breed + " " +
                "named " + name + " " +
                "eats " + food;
    }

}
