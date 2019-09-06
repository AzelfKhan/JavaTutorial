package concepts.OOP.Abstraction;

/**
 * Like a class, an interface can have methods and variables, but the methods declared in interface
 * are by default abstract (only method signature, no body).
 *
 * Interfaces specify what a class must do and not how. It is the blueprint of the class.
 *
 * If a class implements an interface and does not provide method bodies for all functions specified in the interface,
 * then class must be declared abstract.
 */
public interface Phone {

    void sendCall(); // this method has no body, only the method signature

    void sendTextMessage(); // this method has no body, only the method signature

}