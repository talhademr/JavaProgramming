package DeviceTask;

public class MyDevices {
    public static void main(String[] args) {
        Phone phone=new Phone("Samsung","s21",15000, true,true);

        Computer computer=new Computer("apple", "macbook pro", 50000, true, true);

        Tv tv = new Tv("Vestel","v900",122324, true,true );

        Iphone iphone = new Iphone("iphone 14",50000, true,true);

        personalComputer personalComputer = new personalComputer("LG", "g3", 123456, true,true,"1234567");

        System.out.println(phone);
        System.out.println(computer);
        System.out.println(tv);
        System.out.println(iphone);
        System.out.println(personalComputer);

        phone.text(1912345L);
        phone.call(123456L);
        computer.antiVirus();
        tv.channelDown();





    }





}

/*
6. Create a class named MyDevices:
            Create the objects of each subclasses and

            test all the functions of each objects

            Analyze the relationships between the classes
 */
