package concepts.OOP.Abstraction;

// This is a sub class of SmartPhone and requires all the abstract methods that haven't been defined yet to be defined.
// You cannot add any abstract methods in a concrete class.
public class ApplePhone extends SmartPhone {
    int appleWarranty = 5;
    public String model;

    public ApplePhone(){};

    public ApplePhone(String model) {
        this.model = model;
        System.out.println("Apple phone model number is ... " + this.model);
    }

    @Override
    public void operatingSystem() {
        System.out.println("Apple phones use iOS as their OS");
    }

    @Override
    public void sendTextMessage() {
        System.out.println("Android phones can send text messages");
    }
}
