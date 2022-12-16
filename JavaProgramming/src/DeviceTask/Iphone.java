package DeviceTask;

public class Iphone extends Phone{
    public Iphone( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, price, hasBattery, hasPowerButton);

    }


    @Override
    public void call(long phoneNum) {
        System.out.println( getBrand() +"can facetime " + phoneNum );
    }
}
/*
5. Create the following subclasses of Phone and add any extra methods that are needed:

                1. Iphone
                2. Samsung
                3. BlackBerry
                4. Google
                5. Nokia
 */