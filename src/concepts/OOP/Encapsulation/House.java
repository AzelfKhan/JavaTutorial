package concepts.OOP.Encapsulation;

public class House {

    private String houseOwnerName, streetAddress; // declaring variables as private since we
    private int numOfBedrooms, numOfFloors; // don't want other classes to have access to these variables

    // Constructor - DEFINE!!!!
    public House() {
        this.houseOwnerName = null;
        this.streetAddress = null;
        this.numOfBedrooms = 3;
        this.numOfFloors = 5;
    }

    public House(String houseOwnerName) {
        this.houseOwnerName = houseOwnerName;
    }

    public House(String houseOwnerName,
                 String streetAddress,
                 int numOfBedrooms,
                 int numOfFloors) {
        this.houseOwnerName = houseOwnerName;
        this.streetAddress = streetAddress;
        this.numOfBedrooms = numOfBedrooms;
        this.numOfFloors = numOfFloors;
    }

    // Create getters and setters for retrieving and setting data
    // This is the proper way of interacting with data of a class

    public String getHouseOwnerName() {
        return houseOwnerName;
    }

    public void setHouseOwnerName(String houseOwnerName) {
        this.houseOwnerName = houseOwnerName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

}
