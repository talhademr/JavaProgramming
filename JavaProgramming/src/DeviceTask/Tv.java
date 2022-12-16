package DeviceTask;

public class Tv extends Device{
    public Tv(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(getBrand() + " can up to channel.");
    }

    public void channelDown(){
        System.out.println(getBrand() + " can down to channel.");
    }


}
/*
 4. Create a sub class of Device named TV:

                Extra Methods:
                    channelUp()
                    channelDown()
 */