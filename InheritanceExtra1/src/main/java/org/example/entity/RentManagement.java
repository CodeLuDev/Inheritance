package org.example.entity;

import java.util.List;

public class RentManagement {

    private List<Rent> rentList;
    private List<Integer> moorings;

    public RentManagement(List<Rent> rentList, List<Integer> moorings) {
        this.rentList = rentList;
        this.moorings = moorings;
    }

    public List<Rent> getRentList() {
        return rentList;
    }

    public void setRentList(List<Rent> rentList) {
        this.rentList = rentList;
    }

    public List<Integer> getMoorings() {
        return moorings;
    }

    public void setMoorings(List<Integer> moorings) {
        this.moorings = moorings;
    }
}
