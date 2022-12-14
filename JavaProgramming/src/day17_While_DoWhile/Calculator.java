package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num = scan.nextInt();

        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        System.out.println("enter a math operator");
        char ch = scan.next().charAt(0);

        while (  !(ch=='+' || ch== '-')  ){
            System.out.println("invalid entry please re-enter");
            ch = scan.next().charAt(0);
        }

        System.out.println(  (ch == '+') ? num+num2 : num-num2  );








    }
}
