package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
       /*
        ilk yol teker teker atamak
        letters[0]='A';
        letters[1]= 'B';
        ......

        */ // 1.yol

        /*
        2. yol;
        for (char i = 'A', j=0; i <='Z'&& j<letters.length ; i++, j++) {
            // burda neden j diye bişi atadık çünkü  letters[0]='A' kısmında ilk index yani 0ıncı index A
            //biz Z ye kadar giderken indeximizde artıcak, toplam 26 tane index var
            // normal şartlarda 26 sayısını bildiğimiz için yazmamıza
            letters[j]=i;
            System.out.println();
        }
        */ // 2. yol

        char ch= 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]= ch++;
            ch++;
        }

        System.out.println(Arrays.toString(letters));
    }
}
