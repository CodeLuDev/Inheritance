package testingHotel;

import org.example.entity.Hotel4Stars;
import org.example.entity.Hotel5Stars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {

    @Test
    public void verifyPriceRoomHotel4Stars() {

        Hotel4Stars hotel4Stars = new Hotel4Stars("Lo scoglio","Via Angelo Tota #54","Capri","Alberto Rossi",150,300,3,"B","Il sogno",40);

        double priceExpected = hotel4Stars.calculateRoomPrice();

        System.out.println(hotel4Stars.toString());

        Assertions.assertEquals(260, priceExpected);
    }

    @Test
    public void verifyPriceRoomHotel5Stars() {

        Hotel5Stars hotel5Stars = new Hotel5Stars("La vista","Via Angelo Tota #10","Capri","Alberto Rossi",300,500,5,"A","Il mare blu",80,10,25,20);

        double priceExpected = hotel5Stars.calculateRoomPrice();

        System.out.println(hotel5Stars.toString());

        Assertions.assertEquals(750, priceExpected);
    }
}
