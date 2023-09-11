package org.example;

import org.example.entity.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Español
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.

English
In a port, moorings are rented for boats of different types. For each rental is saved: the
name, client document, the rental date, return date, the position of the
mooring and the ship that will occupy it.
A Boat is characterized by: its registration, its length in meters and year of manufacture.
However, it is intended to differentiate the information of some types of special ships:
• Number of masts for sailboats.
• Power in CV for motor boats.
• Power in CV and number of cabins for luxury yachts.
A rent is calculated by multiplying the number of days of occupancy (calculated with the date of
rent and return), for a module value of each boat (obtained simply
multiplying the length by 10).
In special type ships, the module of each ship is calculated by taking out the normal module and
adding the particular attribute of each ship. In sailing ships the number of masts is added,
in motor boats the power in CV is added and in yachts the power in CV is added and
the number of cabins.
Using inheritance appropriately, we will have to program in Java, the classes and the
necessary methods that allow the user to choose the boat he wants to rent and show him the
final price of your rental.
 */
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //creating boats
        Sailboat sailboat = new Sailboat("AAA125", 12.5, 2020, 2);
        MotorBoat motorBoat = new MotorBoat("AAA126",5,2015,250);
        Yacht yacht = new Yacht("AAA889",9,2023,100,2);

        List<Rent> rentList = new ArrayList<>();
        List<Integer> mooringsRented = new ArrayList<>();

        int option;
        do {
            System.out.println("Chose a boat to calculate the rent:"
            + "\n1. Sailboat"
            + "\n2. Motor Boat"
            + "\n3. Yacht"
            + "\n4. Exit");
            System.out.print("\nEnter a valid option: ");
            option = read.nextInt();

            String name;
            String document;
            LocalDate startDay;
            LocalDate finalDay;
            String input;
            DateTimeFormatter formatter;

            switch (option) {
                case 1:
                    sailboat.setTypeOfBoat(sailboat);

                    System.out.print("Your Name: ");
                    name = read.next();

                    System.out.print("Your ID document: ");
                    document = read.next();

                    System.out.print("Rent start day (yyyy-MM-dd): ");
                    input = read.next();
                    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    startDay = LocalDate.parse(input, formatter);
                    sailboat.setRentalDate(startDay);

                    System.out.print("Rent final day (yyyy-MM-dd): ");
                    input = read.next();
                    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    finalDay = LocalDate.parse(input, formatter);
                    sailboat.setReturnDate(finalDay);

                    Rent rentSailboat = new Rent(name,document,startDay,finalDay,1,sailboat);

                    rentList.add(rentSailboat);
                    mooringsRented.add(rentSailboat.getMooringsNumber());

                    System.out.println("The final price is: " + sailboat.calculateRent());
                    break;

                case 2:
                    motorBoat.setTypeOfBoat(motorBoat);

                    System.out.print("Your Name: ");
                    name = read.next();

                    System.out.print("Your ID document: ");
                    document = read.next();

                    System.out.print("Rent start day (yyyy-MM-dd): ");
                    input = read.next();
                    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    startDay = LocalDate.parse(input, formatter);
                    motorBoat.setRentalDate(startDay);

                    System.out.print("Rent final day (yyyy-MM-dd): ");
                    input = read.next();
                    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    finalDay = LocalDate.parse(input, formatter);
                    motorBoat.setReturnDate(finalDay);

                    Rent rentMotorBoat = new Rent(name,document,startDay,finalDay,2,motorBoat);

                    rentList.add(rentMotorBoat);
                    mooringsRented.add(rentMotorBoat.getMooringsNumber());

                    System.out.println("The final price is: " + motorBoat.calculateRent());
                    break;

                case 3:
                    yacht.setTypeOfBoat(yacht);

                    System.out.print("Your Name: ");
                    name = read.next();

                    System.out.print("Your ID document: ");
                    document = read.next();

                    System.out.print("Rent start day (yyyy-MM-dd): ");
                    input = read.next();
                    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    startDay = LocalDate.parse(input, formatter);
                    yacht.setRentalDate(startDay);

                    System.out.print("Rent final day (yyyy-MM-dd): ");
                    input = read.next();
                    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    finalDay = LocalDate.parse(input, formatter);
                    yacht.setReturnDate(finalDay);

                    Rent rentYacht = new Rent(name,document,startDay,finalDay,3,yacht);

                    rentList.add(rentYacht);
                    mooringsRented.add(rentYacht.getMooringsNumber());

                    System.out.println("The final price is: " + yacht.calculateRent());
                    break;

                case 4:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.print("Invalid option, enter a new one: ");
                    option = read.nextInt();
            }
        } while (option != 4);

    }
}
