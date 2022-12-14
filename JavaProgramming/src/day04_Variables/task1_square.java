package day04_Variables;

public class task1_square {
/* 1. Create a class named Square, write a program that can calculate the area & perimeter of any given square
						side

						area = side * side;
						perimeter = 4 * side

 */
public static void main(String[] args) {
    double side = 7.5; // even if we write here 10; it shows like 10.0

    double area = side * side;
    double perimeter = 4 * side;

    System.out.println("side = " + side);
    System.out.println("area = " + area);
    System.out.println("perimeter = " + perimeter);



    }


}
