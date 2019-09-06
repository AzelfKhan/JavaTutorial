package concepts.OOP.Abstraction;

// This is a sub class of SmartPhone and requires all the abstract methods that haven't been defined yet to be defined.
// You cannot add any abstract methods in a concrete class.
public class AndroidPhone extends SmartPhone {

    public int androidWarranty = 3;
    public String model;

    public AndroidPhone(){}

    public AndroidPhone(String model) {
        this.model = model;
        System.out.println("Android phone model number is ... " + this.model);
    }

    @Override
    public void operatingSystem() {
        System.out.println("Android phones use android as their OS");
    }

    @Override
    public void sendTextMessage() {
        System.out.println("Android phones can send text messages");
    }

}