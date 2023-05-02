package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
        //firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);


    }
}

/*

3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */