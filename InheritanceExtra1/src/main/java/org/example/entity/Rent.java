package org.example.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rent {

    private String customerName;
    private String customerDocument;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private int mooringsNumber;
    private Boat typeOfBoat;

    public Rent() {
    }

    public Rent(String customerName, String customerDocument, LocalDate rentalDate, LocalDate returnDate, int mooringsNumber, Boat typeOfBoat) {
        this.customerName = customerName;
        this.customerDocument = customerDocument;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.mooringsNumber = mooringsNumber;
        this.typeOfBoat = typeOfBoat;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerDocument() {
        return customerDocument;
    }

    public void setCustomerDocument(String customerDocument) {
        this.customerDocument = customerDocument;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getMooringsNumber() {
        return mooringsNumber;
    }

    public void setMooringsNumber(int mooringsNumber) {
        this.mooringsNumber = mooringsNumber;
    }

    public Boat getTypeOfBoat() {
        return typeOfBoat;
    }

    public void setTypeOfBoat(Boat typeOfBoat) {
        this.typeOfBoat = typeOfBoat;
    }

    //methods
    public double calculateRent() {
        long daysRent = ChronoUnit.DAYS.between(rentalDate, returnDate);

        return daysRent * (10 * typeOfBoat.getLength());
    }

    @Override
    public String toString() {
        return "Rent{" +
                "customerName='" + customerName + '\'' +
                ", customerDocument='" + customerDocument + '\'' +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                ", mooringsNumber=" + mooringsNumber +
                ", typeOfBoat=" + typeOfBoat +
                '}';
    }
}
