package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {

/*

Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */

        int number = 88;
        boolean isDivisibleBy2 = number % 2 == 0,
                isDivisibleBy3 = number % 3 == 0,
                isDivisibleBy4 = number % 4 == 0,
                isDivisibleBy5 = number % 5 == 0;

        System.out.println("number = " + number);
        System.out.println("isDivisibleBy2 = " + isDivisibleBy2);
        System.out.println("isDivisibleBy3 = " + isDivisibleBy3);
        System.out.println("isDivisibleBy4 = " + isDivisibleBy4);
        System.out.println("isDivisibleBy5 = " + isDivisibleBy5);

        System.out.println("------------------------------------");

        int year = 2000;
        boolean isLeapYear = year % 4 == 0;

        System.out.println("isLeapYear = " + isLeapYear);

    }
}
