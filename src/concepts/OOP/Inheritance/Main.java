package concepts.OOP.Inheritance;

public class Main {

    public static void main(String[] args) {

        // bobGrandfather only has access to methods and variables defined in Grandfather class
        Grandfather bobGrandfather = new Grandfather();
        System.out.println(bobGrandfather.favoriteDish);
        bobGrandfather.jump();
        bobGrandfather.bodyHair();
        bobGrandfather.height();

        System.out.println();
        // --------------------------------------------------------------------------------------

        // bobFather only has access to methods and variables defined in Father class as well as
        // public methods and variables defined in Grandfather class
        Father bobFather = new Father();
        System.out.println(bobFather.favoriteActivity);
        bobFather.educate();
        bobFather.tellJokes();
        System.out.println(bobFather.favoriteDish); // inherited from Grandfather class
        bobFather.jump(); // inherited from Grandfather class
        bobFather.bodyHair(); // inherited from Grandfather class
        bobFather.height(); // inherited from Grandfather class

        System.out.println();
        // --------------------------------------------------------------------------------------

        // bob has access to methods and variables defined in Son class as well as
        // public methods and variables defined in Father and Grandfather class
        Son bob = new Son();
        System.out.println(bob.favoriteGame);
        bob.learning();
        bob.playing();
        System.out.println(bob.favoriteActivity); // inherited from Father class
        bob.educate(); // inherited from Father class
        bob.tellJokes(); // inherited from Father class
        System.out.println(bob.favoriteDish); // inherited from Grandfather class
        bob.jump(); // inherited from Grandfather class
        bob.bodyHair(); // inherited from Grandfather class
        bob.height(); // inherited from Grandfather class


    }

}
