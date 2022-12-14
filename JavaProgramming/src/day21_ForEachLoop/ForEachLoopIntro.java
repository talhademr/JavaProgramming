package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int [] number = {10,20,30,40,50,60,70};
        //                0  1  2  3  4  5  6


        for (int i = 0; i < number.length; i++) {
            int eachElemet = number[i];
            System.out.println(eachElemet);
        }

        System.out.println("----------------------");

        for ( int each : number  ){ // each elements of the array
            System.out.println(each);

            // syntax of For Each loop is; for( : ) {   }

        }


    }
}
