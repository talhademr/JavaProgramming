package day29_ArrayList;

public class groupMeetingTask15_11_2022 {
    /*
     *  Given an array of integers, write a function to return the index of an item
     *   in the array, where the sum of all items on its left is equal to the sum
     *   of the ones on the right.
     *   For example :
           Given [4, 9, 1, 3, 6, 4]
           your function should return 2
           because the item at index 2 is 1, and 4+9 =3+6+4
 */

}

/*
public static void main (String[] args) {

//    *  Given an array of integers, write a function to return the index of an item
//    *   in the array, where the sum of all items on its left is equal to the sum
//            *   of the ones on the right.
//            *   For example :
//    Given [4, 9, 1, 3, 6, 4]
//    your function should return 2
//    because the item at index 2 is 1, and 4+9 =3+6+4

    int[] arr = {4, 9, 1, 3, 6, 4, 1};
    System.out.println(Arrays.toString(arr));
    System.out.println("The index of the item is: " + findIndex(arr));

  }

  public static int findIndex (int[] arr) {

    int sum = 0;
    int sumLeft = 0;
    int sumRight;

    for (int j : arr) {
      sum += j;
    }

    for (int i = 0; i < arr.length - 1; i++) {
      sumLeft += arr[i];
      sumRight = sum - sumLeft - arr[i + 1];
      if (sumLeft == sumRight) {
        return i + 1;
      }
    }
    return -1;

  }


 */