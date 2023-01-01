package day44_Abstraction.animalTask;

public class Dog extends Animal{


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats Pizza");
    }

}
