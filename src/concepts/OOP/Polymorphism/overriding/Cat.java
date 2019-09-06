package concepts.OOP.Polymorphism.overriding;

public class Cat extends Animal {

    public Cat() {}

    /**
     * Class Cat is overriding the 'animalSound' method from its parent class (Animal).
     */
    @Override
    public void animalSound() {
        System.out.println("Purr");
    }

    /**
     * Class Cat is overriding the 'animalSound' method from its parent class (Animal).
     */
    @Override
    public void eats() {
        System.out.println("Cat eats canned cat food");
    }
}
