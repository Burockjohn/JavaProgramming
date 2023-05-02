package day16_ForLoopAndStringPractices;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        int num = word.length();
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reverse += word.charAt(i);

        }

        System.out.println(reverse);

    }
}

/*

1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */