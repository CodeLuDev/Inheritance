package org.example;

import org.example.entity.Animal;
import org.example.entity.Cat;
import org.example.entity.Dog;
import org.example.entity.Horse;

/*
Español
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.

English
We have a parent Animal class along with its 3 daughter classes Dog, Cat, Horse.
The Animal class will have as attributes the name, food, age and breed of the Animal.
Create a method in the Animal class through which each child class should then display a
message on the screen informing that it is fed.
 */
public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Max","dog kibble",3,"labrador retriever");
        System.out.println(dog.feed());

        Animal cat = new Cat("Whiskers", "fish",5,"siamese");
        System.out.println(cat.feed());

        Animal horse = new Horse("Spirit","grass",8,"arabian");
        System.out.println(horse.feed());

    }
}
