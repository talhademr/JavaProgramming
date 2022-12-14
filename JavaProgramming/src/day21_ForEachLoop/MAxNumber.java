package day21_ForEachLoop;

public class MAxNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];// 20
        int min = numbers[0];//0

/*
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max ){ // if there is element in the array that's greater than the current max number
                max = numbers[i]; // assigning greater number to variable max
            }
        }
 */

        for (int number : numbers) {
            if (number > max){
                max = number;
            }
        }

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
