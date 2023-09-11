package org.example;

import org.example.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Español
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo A o de tipo B, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
17
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.

English
A tourism promotion company wants to maintain information about the infrastructure
accommodation for tourists, so that customers can plan their vacations
according to your possibilities. Accommodations are identified by name, address,
a locality and a manager in charge of the place. The company works with two types of
accommodation: Hotels and non-hotel accommodation.
Hotels have as attributes: Number of Rooms, Number of Beds, Number of
Floors, Price of Rooms. And these can be four or five stars. The
Characteristics of the different categories are the following:
• Hotel **** Number of Rooms, Number of beds, Number of Floors, Gym,
Name of the Restaurant, Capacity of the Restaurant, Price of the Rooms.
• Hotel ***** Number of Rooms, Number of beds, Number of Floors, Gym,
Restaurant Name, Restaurant Capacity, Number of Meeting Rooms
Conference, Number of Suites, Number of Limousines, Price of the Rooms.
The gyms can be classified by the company as type "A" or type "B", according to
according to the observed performance. Limousines are available to any
client, but subject to availability, so the more limousines the hotel has, the more expensive
be.
The price of a room must be calculated according to the following formula:
RoomPrice = $50 + ($1 x hotel capacity) + (value added per restaurant) + (value
added by gym) + (value added by limousines).
Where:
Value added by the restaurant:
• $10 if the restaurant capacity is less than 30 people.
• $30 if you are between 30 and 50 people.
• $50 if you are over 50.
Value added by the gym:
• $50 if the gym guy is A.
• $30 if the gym guy is B.
Value added by limousines:
• $15 for the number of hotel limousines.
In contrast, Extra Hotel Accommodations provide different services from those of
hotels, being more oriented to outdoor life and low-income tourists. For each
Extra-hotel accommodation indicates whether it is private or not, as well as the number of meters
squares it occupies. There are two types of non-hotel accommodation: Camping and
Residences. For the Campsites, the maximum capacity of tents, the number of bathrooms
available and whether or not you have a restaurant on the premises. For the residences
indicates the number of rooms, whether or not discounts are made to guilds and whether or not it has
sports field. Write a program in which all relations are represented.
described.
Create a query system that allows the user to query by different criteria:
• all accommodation.
• all hotels from most expensive to cheapest.
• all campsites with restaurant
• all residences that have a discount.
 */
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //creating accommodations
        Hotel4Stars hotel4Stars = new Hotel4Stars("Lo scoglio","Via Angelo Tota #54","Capri","Alberto Rossi",150,300,3,"B","Il sogno",40);
        Hotel4Stars hotel4Stars1 = new Hotel4Stars("Il gabbiano","Via Nino P. # 14","Sorrento","Anna Bellavita",50,40,2,"B","La gioiosa Pizzeria",25);

        Hotel5Stars hotel5Stars = new Hotel5Stars("La vista","Via Angelo Tota #10","Capri","Alberto Rossi",300,500,5,"A","Il mare blu",80,10,25,20);
        Hotel5Stars hotel5Stars1 = new Hotel5Stars("Il balcone","Via delle balene #69","Amalfi","Luna Del Noce",500,700,5,"A","Le sirene",100,15,25,25);

        Camping camping = new Camping("La marmotta","Via belvedere #78","Valle di Susa","Antony Bruno",true,100,50,10,false);
        Camping camping1 = new Camping("La montagna rosa","Via angeli #23","Valle di Norcia","Marco Bruno",false,100,50,15,true);

        Residence residence = new Residence("Le mimose","Via della roccia #66","Siena","Lola Sinni",true,50,25,false,false);
        Residence residence1 = new Residence("La madonna","Via degli ulivi #15","Pisa","Gemma Dadin",false,60,40,true,true);

        //list all accommodations
        List<Accommodation> accommodationList = new ArrayList<>();
        accommodationList.add(hotel4Stars);
        accommodationList.add(hotel4Stars1);
        accommodationList.add(hotel5Stars);
        accommodationList.add(hotel5Stars1);
        accommodationList.add(camping);
        accommodationList.add(camping1);
        accommodationList.add(residence);
        accommodationList.add(residence1);

        //list all hotels
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(hotel4Stars);
        hotelList.add(hotel4Stars1);
        hotelList.add(hotel5Stars);
        hotelList.add(hotel5Stars1);

        System.out.println("Welcome to our tourism promotion company! Choose an option to know what we are offering to you!");
        int option;
        do {
            System.out.println("\n1. All the accommodations" +
                    "\n2. All hotels from the most expensive to the cheapest" +
                    "\n3. All campings with restaurant" +
                    "\n4. All residences with discount" +
                    "\n5. Exit");

            System.out.print("Enter a option: ");
            option = read.nextInt();

            switch (option) {
                case 1:
                    for (Accommodation accommodation : accommodationList) {
                        if (accommodation instanceof Hotel4Stars) {
                            ((Hotel4Stars) accommodation).calculateRoomPrice();
                        }
                        if (accommodation instanceof Hotel5Stars) {
                            ((Hotel5Stars) accommodation).calculateRoomPrice();
                        }

                        System.out.println("\n" + accommodation.toString());

                    }
                    break;

                case 2:
                    for (Hotel hotel: hotelList) {
                        if (hotel instanceof Hotel4Stars) {
                            ((Hotel4Stars) hotel).calculateRoomPrice();
                        }
                        if (hotel instanceof Hotel5Stars) {
                            ((Hotel5Stars) hotel).calculateRoomPrice();
                        }
                    }

                    hotelList.sort((hotel1, hotel2) -> Double.compare(hotel2.getPriceRoom(), hotel1.getPriceRoom()));//lambda

                    for (Hotel hotel : hotelList) {
                        System.out.println(hotel);
                    }
                    break;

                case 3:
                    for (Accommodation accommodation : accommodationList) {
                        if (accommodation instanceof Camping) {
                            if (((Camping) accommodation).isHasARestaurant()) {
                                System.out.println(accommodation.toString());
                            }
                        }
                    }
                    break;

                case 4:
                    for (Accommodation accommodation : accommodationList) {
                        if (accommodation instanceof Residence) {
                            if (((Residence) accommodation).isDiscountToUnions()) {
                                System.out.println(accommodation.toString());
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thanks for visiting us! Bye!");
                    break;

                default:
                    System.out.print("Option not valid, enter a new one: ");
                    option = read.nextInt();

            }
        } while (option != 5);

    }
}
