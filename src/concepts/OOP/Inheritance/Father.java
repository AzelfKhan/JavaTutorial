package concepts.OOP.Inheritance;

/**
 * This Father class inherits from Grandfather class (Super class).
 * This means that the Father class has access to Grandfather class's public variables & methods.
 */
public class Father extends Grandfather {

    public String favoriteActivity = "Reading";
    private long fatherSSID = 0001;

    public Father() {}

    public void tellJokes() {
        System.out.println("Father sure is funny");
    }

    public void educate() {
        System.out.println("Father can educate others");
    }

}
