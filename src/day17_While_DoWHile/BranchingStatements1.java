package day17_While_DoWHile;

import java.util.Scanner;

public class BranchingStatements1 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " "); // A B C D E F G ...

            if (i == 'F') {
                break; // exits the loop
            }
        }

        System.out.println();
        System.out.println("-------------------------------------------");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num < 0) {
                break;
            }
        }

    }
}
