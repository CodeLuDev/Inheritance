package org.example;

import org.example.entity.TV;
import org.example.entity.WashingMachine;
import java.util.Scanner;

/*
Español
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.

English
Create a superclass named Appliance with the following attributes: price, color,
energy consumption (letters between A and F) and weight.
The constructors that must be implemented are the following:
• An empty constructor.
• A constructor with all the attributes passed by parameter.
The methods to implement are:
• Getters and setters methods of all the attributes.
• VerifyEnergyConsumption(char letter) method: checks that the letter is correct,
If it is not correct, it will use the letter F by default. This method must be called when creating the
object and will not be visible.
• VerifyColor(String color) method: checks that the color is correct, and if it is not,
use the default color white. The colors available for the appliances are
white, black, red, blue and gray. It does not matter if the name is in uppercase or in
lowercase. This method will be called when the object is created and will not be visible.
• CreateAppliance() method: prompts the user for information and fills the
appliance, it also calls the methods to check the color and consumption. To the
price is given a base value of $1000.
• PriceFinal() method: depending on the energy consumption and its size, the value of the
price. This is the price list:
LETTER PRICE
A$1000
B$800
C$600
D$500
E$300
F$100
WEIGHT PRICE
Between 1 and 19 kg $100
Between 20 and 49 kg $500
Between 50 and 79 kg $800
Greater than 80 kg $1000
Next, you must create a subclass called Washing Machine, with the attribute load,
in addition to inherited attributes.
The constructors that will be implemented will be:
• An empty constructor.
• A constructor with the load and the rest of the inherited attributes. Remember that you must
call the constructor of the parent class.
The methods that will be implemented will be:
• Get and set method of the load attribute.
• createWashing Machine() method: this method calls createAppliance() of the class
parent, we use it to fill the attributes inherited from the parent and then we fill
the attribute of the washing machine.
• PrecioFinal() method: this method will be inherited and the following will be added
functionality. If you have a load greater than 30 kg, the price will increase by $500, if the
load is less than or equal, the price will not increase. This method should call
parent method and add the necessary code. Remember that the conditions we have
seen in the Appliance class should also affect the price.
You must also create a subclass called Television with the following attributes:
resolution (in inches) and DTT tuner (boolean), in addition to the attributes
inherited.
The constructors that will be implemented will be:
• An empty constructor.
• A constructor with the resolution, DTT tuner and the rest of the attributes
inherited. Remember that you must call the constructor of the parent class.
The methods that will be implemented will be:
• Get and set method of the DTT resolution and tuner attributes.
• createTelevisor() method: this method calls createAppliance() of the class
parent, we use it to fill the attributes inherited from the parent and then we fill
TV attributes.
• PrecioFinal() method: this method will be inherited and the following will be added
functionality. If the TV has a resolution greater than 40 inches, it will
will increase the price by 30% and if it has a built-in DTT tuner, it will increase
$500. Remember that the conditions we have seen in the Appliance class
They must also affect the price.
Finally, in the main we must do the following:
Let's create a Washing Machine and a TV and call the necessary methods to display
the final price of the two appliances.
 */
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to our store! Chose an option to know the final price");
        int option;
        do {
            System.out.print("-----MENU-----"
            +"\n1. Washing machine"
            +"\n2. Tv"
            +"\n3. Exit"
            +"\nEnter an option: ");
            option = read.nextInt();

            String color;
            char energyClassMin;
            char energyClass;
            int weight;
            switch (option) {

                case 1:
                    System.out.print("Color: ");
                    color = read.next();

                    System.out.print("Energy class: ");
                    energyClassMin = read.next().charAt(0);
                    energyClass = Character.toUpperCase(energyClassMin);

                    System.out.print("Weight: ");
                    weight = read.nextInt();

                    System.out.print("Max load: ");
                    int maxLoad = read.nextInt();

                    WashingMachine washingMachine = new WashingMachine();
                    washingMachine.createWasher(color,energyClass,weight,maxLoad);

                    System.out.println("The final price of this washer is: " + washingMachine.finalPrice()
                    +"\nGeneral information: " + washingMachine.toString());
                    break;

                case 2:
                    System.out.print("Color: ");
                    color = read.next();

                    System.out.print("Energy class: ");
                    energyClassMin = read.next().charAt(0);
                    energyClass = Character.toUpperCase(energyClassMin);

                    System.out.print("Weight: ");
                    weight = read.nextInt();

                    System.out.print("Resolution: ");
                    int resolution = read.nextInt();

                    System.out.print("Is TDT? Enter 'T' for true and 'F' for false: ");
                    char answer = read.next().charAt(0);
                    boolean TDT = false;
                    if (answer == 'T' || answer == 't') {
                        TDT = true;
                    }

                    TV tv = new TV();
                    tv.createTv(color,energyClass,weight,resolution,TDT);
                    System.out.println("The final price of this Tv is: " + tv.finalPrice()
                            +"\nGeneral information: " + tv.toString());
                    break;

                case 3:
                    System.out.println("Thanks for visiting us!!");
                    break;

                default:
                    System.out.print("Invalid option, enter a valid one: ");
                    option = read.nextInt();
            }

            read.nextLine();
        } while (option != 3);
    }
}
