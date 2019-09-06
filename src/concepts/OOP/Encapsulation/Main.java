package concepts.OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {

        House bobsHouse = new House("Arif", "1235 Main St", 4, 2);

        // We want to access the variables from bobsHouse, so lets use the getter methods
        System.out.println(bobsHouse.getHouseOwnerName());
        System.out.println(bobsHouse.getStreetAddress());
        System.out.println(bobsHouse.getNumOfBedrooms());
        System.out.println(bobsHouse.getNumOfFloors());

        System.out.println();

        House otherHouse = new House(); // otherHouse was created with a default constructor
        System.out.println(otherHouse.getHouseOwnerName());
        System.out.println(otherHouse.getStreetAddress());
        System.out.println(otherHouse.getNumOfBedrooms());
        System.out.println(otherHouse.getNumOfFloors());

        // Since the houseOwnerName and streetAddress return null, let us set the values for these variables
        // using the setter methods
        otherHouse.setHouseOwnerName("John");
        otherHouse.setStreetAddress("1020 30 Astoria");

        // We can also change/update other variables that were already set
        otherHouse.setNumOfBedrooms(15);
        otherHouse.setNumOfFloors(10);

        System.out.println("\nAfter set...\n");
        System.out.println(otherHouse.getHouseOwnerName());
        System.out.println(otherHouse.getStreetAddress());
        System.out.println(otherHouse.getNumOfBedrooms());
        System.out.println(otherHouse.getNumOfFloors());

    }

}