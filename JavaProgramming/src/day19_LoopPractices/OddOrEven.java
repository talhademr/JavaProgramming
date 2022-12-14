package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        while(true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("enter a numnber: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }

            System.out.println("would you like to enter another number?yes/no");
            String ans = scan.next().toLowerCase();


            if ( !( ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no") )){
                System.exit(0);
            }
            if (ans.equalsIgnoreCase("no")){
                break;
            }


        }
    }
}
