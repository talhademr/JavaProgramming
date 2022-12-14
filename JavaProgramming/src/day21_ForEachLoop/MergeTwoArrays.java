package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String [] group1 = {"Ali", "Layan", "Aysenur"};
        String [] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String [] student = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            student[i++] = each;

        }
        for (String each : group2) {
            student[i++] = each;
        }
        System.out.println(Arrays.toString(student));

        System.out.println("------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char [] chars = new char[ch1.length + ch2.length];


        int j= 0;
        for (char ch : ch1) {
            chars [j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars [j] = ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));




    }
}
