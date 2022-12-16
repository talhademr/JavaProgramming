package DeviceTask;

public class personalComputer extends Computer{

    private String IP;

    public personalComputer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, String IP) {
        super(brand, model, price, hasBattery, hasPowerButton);
        setIP(IP);
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        if (IP.isEmpty() || IP.isBlank() || IP==null){
            System.err.println("Invalid input");
            System.exit(1);
        }
        this.IP = IP;
    }


    @Override
    public String toString() {
        return "Device{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton() +
                ", IP=" + getIP() +
                '}';

    }

}
/*
5. Create the following subclasses of Computer and add any extra methods that are needed:
                1. PersonalComputer
                1. Desktop
                2. Laptop
 */