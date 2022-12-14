package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50};
        //                 0  1  2  3  4

        int [] reversed = new int[numbers.length];
        //to make sure that the array has enough capacity to contain all the elements of first array

        /*
                 j              i
        reversed[0] = numbers[numbers.length-1];
        reversed[1] = numbers[3];
        reversed[2] = numbers[2];
        reversed[3] = numbers[1];
        reversed[4] = numbers[0];
        */

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j]=numbers[i];
        }
        
        
        System.out.println(Arrays.toString(reversed));


    }
}
