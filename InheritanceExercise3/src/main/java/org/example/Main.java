package org.example;

import org.example.entity.Appliance;
import org.example.entity.TV;
import org.example.entity.WashingMachine;
import java.util.ArrayList;

/*
Español
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.

English
Following the previous exercise, in the main we are going to create an ArrayList of Home Appliances
to store 4 household appliances, whether washing machines or televisions, with already assigned values.
Then loop through this array and call the finalPrice() method on each appliance. HE
should also show the price of each type of object, that is, the price of all
televisions and washing machines. Once that is done, we must also show the sum of the
price of all appliances. For example, if we have a washing machine with a price of
2000 and a 5000 television, the final result will be 7000 (2000+5000) for
household appliances, 2000 for a washing machine and 5000 for a television.
 */
public class Main {
    public static void main(String[] args) {

        TV tv1 = new TV();
        TV tv2 = new TV();
        TV tv3 = new TV();
        WashingMachine washingMachine = new WashingMachine();

        tv1.createTv("Black",'A',15,45,true);
        tv2.createTv("Red",'A',50,120,true);
        tv3.createTv("Grey",'F',30,20,false);
        washingMachine.createWasher("White",'A',100,20);

        ArrayList<Appliance> appliances = new ArrayList<>();
        appliances.add(tv1);
        appliances.add(tv2);
        appliances.add(tv3);
        appliances.add(washingMachine);

        double finalPrice = 0;
        double washerPrice = 0;
        double tvPrice = 0;

        for (Appliance appliance : appliances) {
            System.out.println("Price: " + appliance.finalPrice());
            
            finalPrice += appliance.getPrice();

            if (appliance instanceof WashingMachine) {
                washerPrice += appliance.getPrice();
            } else if (appliance instanceof TV) {
                tvPrice += appliance.getPrice();
            }
        }

        System.out.println("\nFinal price of all appliances: " + finalPrice);
        System.out.println("Total price of washers: " + washerPrice);
        System.out.println("Total price of TVs: " + tvPrice);

    }
}