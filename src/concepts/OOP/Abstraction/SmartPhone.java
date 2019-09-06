package concepts.OOP.Abstraction;

/**
 *  Keyword abstract is used to make a class abstract.
 *
 *  An instance of an abstract class cannot be created, however we can have references of abstract class.
 *
 *  We can have an abstract class without any abstract method.
 *  This allows us to create classes that cannot be instantiated, but can only be inherited.
 */
public abstract class SmartPhone implements Phone {

    public SmartPhone(){}

    // We can create abstract and non abstract methods in an abstract class.

    // Non abstract method
    public void touchScreen() {
        System.out.println("This smart phone has touch screen feature");
    }

    // Abstract method
    public abstract void operatingSystem();

    // Defining an abstract method from the Phone interface.
    @Override
    public void sendCall() {
        System.out.println("This smart phone can send calls");
    }

    // You can see that not all abstract methods from Phone interface are defined in this class.
    // That is because this is an abstract class so you don't really need to define the abstract
    // methods unless you want to. However, if this wasn't an abstract class and was a concrete
    // class, then you would need to define all the abstract methods.
    //
    // sendTextMessage() has not been implemented yet...

}