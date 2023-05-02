package day17_While_DoWHile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt(); // valid age: 1~120

        while (!(age >= 1 && age <= 120)) {

            System.err.println("Invalid entry, please re-enter");
            System.err.println("Enter your age: ");
            age = input.nextInt();

        }

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

            System.err.println("Invalid entry, please re-enter");
            System.err.println("Are you a US citizen? yes/no");
            answer = input.next().toLowerCase();

        }

        if (age >= 18 && answer.equalsIgnoreCase("yes")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }
}
