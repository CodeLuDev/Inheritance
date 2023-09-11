package org.example;

import org.example.entity.Building;
import org.example.entity.OfficeBuilding;
import org.example.entity.SportsCenter;

import java.util.ArrayList;
import java.util.Scanner;

/*
Español
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.

English
Create a superclass called Building with the following attributes: width, height, and length. Class
building will have as methods:
• method calculateSurface(): calculates the surface of the building.
• method calculateVolume(): calculates the volume of the building.
These methods will be abstract and will be implemented by the following classes:
• Sports Center class with its name and type of facility that can be Roofed or
Opened, this class will implement the two abstract methods and the attributes of the parent.
• Class OfficeBuilding with its attributes number of offices, number of people
by office and number of floors. This class will implement both abstract methods and
father's attributes.
Of this class we are interested in knowing how many people can work in the whole building, the
user will say how many people enter each office, how many offices and the floor number
(assuming that there is an office on each floor). Create the method cantPersons(), which returns
how many people would enter a floor and how many in the whole building.
16
Finally, in the main we are going to create an ArrayList of type Building. The ArrayList must contain
two sports centers and two office buildings. Then traverse this array and execute the
methods calculateSurface and calculateVolume in each Building. It should show the
area and volume of each building.
In addition to this, for the Sports Center class we are interested in knowing how many sports centers are
roofed and how many open. And for the EdificioDeOficinas class we must call the method
cantPersons() and return the results for each office building.
 */
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ArrayList<Building> buildings = new ArrayList<>();

        SportsCenter sportsCenter1 = new SportsCenter(30,10,50,true);
        SportsCenter sportsCenter2 = new SportsCenter(40,20,60,false);

        System.out.print("How many people are working in each office: ");
        int numPeopleInOffice = read.nextInt();
        System.out.print("How many offices in each building: ");
        int numOfficesInBuilding = read.nextInt();
        System.out.print("How many floors in each building: ");
        int numFloorsInBuilding = read.nextInt();
        OfficeBuilding officeBuilding1 = new OfficeBuilding(10,3,15,numOfficesInBuilding,numPeopleInOffice,numFloorsInBuilding);

        System.out.print("\nHow many people are working in each office: ");
        int numPeopleInOffice1 = read.nextInt();
        System.out.print("How many offices in each building: ");
        int numOfficesInBuilding1 = read.nextInt();
        System.out.print("How many floors in each building: ");
        int numFloorsInBuilding1 = read.nextInt();
        OfficeBuilding officeBuilding2 = new OfficeBuilding(10,3,20,numOfficesInBuilding1,numPeopleInOffice1,numFloorsInBuilding1);

        buildings.add(sportsCenter1);
        buildings.add(sportsCenter2);
        buildings.add(officeBuilding1);
        buildings.add(officeBuilding2);

        int isCovered = 0;
        int isOpen = 0;
        for (Building b : buildings) {
            System.out.println("\nThe surface is: " + b.calculateSurface());
            System.out.println("The volume is: " + b.calculateVolume());

            if (b instanceof SportsCenter) {
                if (((SportsCenter) b).isCovered()) {
                    isCovered ++;
                } else {
                    isOpen ++;
                }
            }

            if (b instanceof OfficeBuilding) {
                int totPeople = ((OfficeBuilding) b).numberOfPeople();
                System.out.println("The number of all people are in the building is: " + totPeople);
                System.out.println("The number of all people in a floor is: " + ((OfficeBuilding) b).getNumPeopleInOffice()); //one office in each floor
            }
        }

        System.out.println("\nThe number of the sport centers covered are: " + isCovered + " and the ones not are: " + isOpen);
    }
}
