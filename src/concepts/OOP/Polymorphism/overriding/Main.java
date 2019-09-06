package concepts.OOP.Polymorphism.overriding;

public class Main {

    public static void main(String[] args) {

        // If an Animal type reference refers to an Animal Parent object,
        // then Animal's 'animalSound()' and 'eats()' is called
        Animal animal = new Animal();
        animal.animalSound();
        animal.eats();

        System.out.println();

        // If an Animal type reference refers to a Dog's object,
        // then Dog's 'animalSound()' and 'eats()' is called.
        // This is called a run time polymorphism.
        Animal dog = new Dog();
        dog.animalSound();
        dog.eats();

        System.out.println();

        Animal cat = new Cat();
        cat.animalSound();
        cat.eats();

        System.out.println();

        Animal kitty = new Kitty();
        kitty.animalSound();
        kitty.eats();
    }

}
