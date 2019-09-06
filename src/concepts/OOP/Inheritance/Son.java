package concepts.OOP.Inheritance;

/**
 * This Son class inherits from Father class which inherits from Grandfather class.
 * This means that the Son class has access to Father and Grandfather class's public variables & methods.
 */
public class Son extends Father {

    public String favoriteGame = "Uno";
    private long sonSSID = 0002;

    public Son() {
        this.sonSSID = 3333;
    }

    public void playing() {
        System.out.println("Son is playing");
    }

    public void learning() {
        System.out.println("Son is learning");
    }

}
