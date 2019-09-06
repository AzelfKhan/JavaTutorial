package concepts.OOP.Polymorphism.overriding;

public class Dog extends Animal {

    public Dog() {}

    /**
     * Class Dog is overriding the 'animalSound' method from its parent class (Animal).
     */
    @Override
    public void animalSound() {
        System.out.println("Woof");
    }

    /**
     * Class Dog is overriding the 'eats' method from its parent class (Animal).
     */
    @Override
    public void eats() {
        System.out.println("Dog eats bones");
    }
}
