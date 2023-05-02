package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first_name = input.nextLine();

        System.out.println("Enter your last name");
        String last_name = input.nextLine();


        System.out.println(first_name.charAt(0) + "." + last_name.charAt(0));

        input.close();


    }
}
