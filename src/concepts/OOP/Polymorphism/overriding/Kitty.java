package concepts.OOP.Polymorphism.overriding;

public class Kitty extends Cat {

    public Kitty() {}

    /**
     * Class Kitty is overriding the 'animalSound' method from it's parent class (Cat).
     */
    @Override
    public void eats() {
        System.out.println("Kitty eats canned kitty food + drinks milk");
    }

    // We are not overriding the animalSound() method here since they both make the same sound.
    // This is for demo purposes only.

}
