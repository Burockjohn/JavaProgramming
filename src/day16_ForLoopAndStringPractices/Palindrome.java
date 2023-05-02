package day16_ForLoopAndStringPractices;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = input.nextLine(),
                reverse = "";

        for (int i = str1.length() - 1; i >= 0; i--) {

            reverse += str1.charAt(i);
        }

        if (str1.equalsIgnoreCase(reverse)) {
            System.out.println(str1 + " is a palindrome");
        } else {
            System.out.println(str1 + " is not a palindrome");
        }


    }
}


/*

 "Java" ==> "avaJ" ===> false (not palindrome)
 "Anna" ==> "annA" ===>true
 "Level"
 "Racecar
 Dad
 Mom
 ....

 */

