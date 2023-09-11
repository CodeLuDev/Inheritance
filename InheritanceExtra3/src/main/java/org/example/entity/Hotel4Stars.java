package org.example.entity;

public class Hotel4Stars extends Hotel{

    protected String gym;
    protected String nameRestaurant;
    protected int restaurantCapacity;

    public Hotel4Stars(String name, String address, String location, String manager, int numRooms, int numBeds, int numFloors, String gym, String nameRestaurant, int restaurantCapacity) {
        super(name, address, location, manager, numRooms, numBeds, numFloors);
        this.gym = gym;
        this.nameRestaurant = nameRestaurant;
        this.restaurantCapacity = restaurantCapacity;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public int getRestaurantCapacity() {
        return restaurantCapacity;
    }

    public void setRestaurantCapacity(int restaurantCapacity) {
        this.restaurantCapacity = restaurantCapacity;
    }

    //method
    @Override
    public double calculateRoomPrice() {
        int capRestaurant;
        int whichGym;

        if (restaurantCapacity < 30) {
            capRestaurant = 10;
        } else if (restaurantCapacity >= 30 && restaurantCapacity <= 50) {
            capRestaurant = 30;
        } else {
            capRestaurant = 50;
        }

        if (gym.equalsIgnoreCase("A")) {
            whichGym = 50;
        } else {
            whichGym = 30;
        }

        double finalPrice = 50 + (getNumRooms()) + (capRestaurant) + (whichGym);

        setPriceRoom(finalPrice);

        return finalPrice;
    }

    @Override
    public String toString() {
        return "Hotel 4 Stars{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", manager='" + manager + '\'' +
                ", numRooms=" + numRooms +
                ", numBeds=" + numBeds +
                ", numFloors=" + numFloors +
                ", priceRoom=" + priceRoom +
                ", gym='" + gym + '\'' +
                ", nameRestaurant='" + nameRestaurant + '\'' +
                ", restaurantCapacity=" + restaurantCapacity +
                '}';
    }


}
