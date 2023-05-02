package day17_While_DoWHile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAAABBBBCCCCDDEEF";
        char ch = 'A';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                frequency++;
            }

        }

        System.out.println("frequency = " + frequency);


    }
}

/*

1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3

 */