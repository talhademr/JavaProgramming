package day44_Abstraction.animalTask;

public final class Parot extends Animal{


    public Parot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }
}
