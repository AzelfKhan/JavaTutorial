package concepts.OOP.Inheritance;

/**
 * Super (Parent) class
 */
public class Grandfather {

    public String favoriteDish = "pasta";
    private long grandfatherSSID = 0000;

    /**
     * Grandfather default constructor
     */
    public Grandfather() {}

    public void jump() {
        System.out.println("Grandfather can jump");
    }

    public void height() {
        System.out.println("Grandfather is tall");
    }

    public void bodyHair() {
        System.out.println("Grandfather is hairy");
    }

}