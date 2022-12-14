package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysIntro {

    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names
        String[] myGroup = new String[5];
        myGroup [0]= "Gunay";
        myGroup [1]= "Neiar";
        myGroup[2]= "Suat";
        myGroup[3]= "Hulya";
        myGroup[4]= "Talha";


        // System.out.println(myGroup); //hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("-----------------------------------------------------------");

        String[] days = {"Mondays","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday"};
        //index:            0          1           2           3          4          5           6

        //   days[7] = "JavaDay";

        System.out.println(Arrays.toString(days));

        int number = 12;

        if (number<1  || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }








    }
}
