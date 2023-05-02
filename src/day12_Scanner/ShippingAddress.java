package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String full_name = input.nextLine();

        System.out.println("Enter your building number");
        String number = input.next();

        input.nextLine();

        System.out.println("Enter your Street name");
        String street_name = input.nextLine();

        System.out.println("Enter your city name");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your zip code");
        String zip_code = input.next();

        input.nextLine();

        System.out.println("Enter your country name");
        String country = input.nextLine();

        System.out.println(full_name);
        System.out.println(number);
        System.out.println(street_name);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zip_code);
        System.out.println(country);

        input.close();

    }


}

/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */