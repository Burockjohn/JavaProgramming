package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2_147_483_648; // any  number that user enter will be greater than -2147483648

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            int num = input.nextInt(); //1, 2, 3, 4, 5

            if (num > max) { // if the user entered number is greater than current maximum number
                max = num;
            }

        }

        System.out.println("max = " + max);


    }
}

/*

Write a program that asks the user to enter a number for 5 times.
return the maximum number

 */