package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char alphabets[] = new char[26]; // Z~A

        alphabets[0] = 'Z';

        System.out.println(Arrays.toString(alphabets));

        char ch = 'Z';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch--;

        }

        /*
        for(char i = 0, j = 'Z';  i < alphabets.length; i++, j-- ){
            alphabets[i] = j;
        }
        */

        System.out.println(Arrays.toString(alphabets));

    }
}
