package day08_IfStatement;

public class IdentifyNumber {

    public static void main(String[] args) {

    /*
    vreate a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
     */

        int number = 200;
        boolean isPositiveNumber = number > 0,
                isNegativeNumber = number < 0,
                isZero = number == 0;

        System.out.println("number = " + number);
        System.out.println("isPositiveNumber = " + isPositiveNumber);
        System.out.println("isNegativeNumber = " + isNegativeNumber);
        System.out.println("isZero = " + isZero);

    }

}
