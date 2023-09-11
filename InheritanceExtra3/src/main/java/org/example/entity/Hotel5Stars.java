package org.example.entity;

public final class Hotel5Stars extends Hotel4Stars{

    private int numberOfConferenceRooms;
    private int numberOfSuites;
    private int numberOfLimousines;

    public Hotel5Stars(String name, String address, String location, String manager, int numRooms, int numBeds, int numFloors, String gym, String nameRestaurant, int restaurantCapacity, int numberOfConferenceRooms, int numberOfSuites, int numberOfLimousines) {
        super(name, address, location, manager, numRooms, numBeds, numFloors, gym, nameRestaurant, restaurantCapacity);
        this.numberOfConferenceRooms = numberOfConferenceRooms;
        this.numberOfSuites = numberOfSuites;
        this.numberOfLimousines = numberOfLimousines;
    }

    public int getNumberOfConferenceRooms() {
        return numberOfConferenceRooms;
    }

    public void setNumberOfConferenceRooms(int numberOfConferenceRooms) {
        this.numberOfConferenceRooms = numberOfConferenceRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public void setNumberOfSuites(int numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public int getNumberOfLimousines() {
        return numberOfLimousines;
    }

    public void setNumberOfLimousines(int numberOfLimousines) {
        this.numberOfLimousines = numberOfLimousines;
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

        double finalPrice = 50 + (getNumRooms()) + (capRestaurant) + (whichGym) + (15 * numberOfLimousines);

        setPriceRoom(finalPrice);

        return finalPrice;
    }

    @Override
    public String toString() {
        return "Hotel 5 Stars{" +
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
                ", numberOfConferenceRooms=" + numberOfConferenceRooms +
                ", numberOfSuites=" + numberOfSuites +
                ", numberOfLimousines=" + numberOfLimousines +
                '}';
    }

}
