package DeviceTask;

public class Computer extends Device{

    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void antiVirus(){
        System.out.println(getBrand() + " can scan system ");
    }

}
/*
3. Create a subclass of Device named Computer:

                Add the extra methods if needed
 */