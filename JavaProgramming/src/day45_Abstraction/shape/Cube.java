package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{


    public Cube(String name) {
        super(name);
    }

    @Override
    public double area() {
        int i = 0;
        return i;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
