package day11_Switch_Scanner;

public class Calculator {

    public static void main(String[] args) {

        int n1 = 8,
                n2 = 4;

        char operator = '@';

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' ) {

            switch (operator) {

                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);
            }

        } else {
            System.err.println("Invalid operator: " + operator);
        }
    }
}

/*

Given two double variables n1, n2 and a char variable named operator.
use switch statement to calculate the result of n1 & n2 based on the given operator
		Valid operators are: -, +, *, /

 */