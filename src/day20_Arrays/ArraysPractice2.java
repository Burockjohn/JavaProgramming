package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char letters[] = new char[26];

        //System.out.println(Arrays.toString(letters)); //[A-Z]

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;
        }

        /*
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }
         */

        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------------------------");

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;
        }

        System.out.println(Arrays.toString(letters));


    }
}
