package day17_While_DoWHile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = input.nextInt();

        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        System.out.println("Enter a math operator (+,-,)");
        char operator = input.next().charAt(0);  // +, -,

        while (!(operator == '+' || operator == '-')) { // If we use the word 'if' in our writing, we will not receive an error message for consecutive incorrectly used operators.
            System.out.println("Invalid Operator, Please re-enter");
            operator = input.next().charAt(0);
        }

        System.out.println((operator == '+' ? num1 + num2 : num1 - num2));

        //alternative solution



    }
}
