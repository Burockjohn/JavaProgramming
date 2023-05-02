package day18_NestedLoops;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age");
            int age = input.nextInt();

            while (!(age >= 1 && age <= 120)) { // while the age is invalid
                System.err.println("Invalid entry, please re-enter your age");
                age = input.nextInt();
            }

            System.out.println("Would you like to continue");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {  // while the answer is invalid

                System.out.println("Invalid Entry, please re-enter. \n Would you like to continue");
            }

            if (answer.equals("no")) {
                break;
            }
        }

        input.close();


    }
}
