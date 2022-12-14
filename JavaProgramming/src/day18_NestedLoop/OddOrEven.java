package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a numnber");
        int num1 = scan.nextInt();

        while (true){
            if (num1 % 2 == 0) {
                System.out.println(num1 + " is Even Number");
            } else {
                System.out.println(num1 + " is Odd number");
            }

            System.out.println("Would you like to enter any other number?");
            String a = scan.next().toLowerCase();

            while ( ! ( a.equals("yes") || a.equals("no")) ){
                System.err.println(" Please re-enter, Would you like to enter any other number? ");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")){
                break;
            }

        }







    }
}
/*
2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"
        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing
                If user enters invalid answer, repeat the previous steps
 */