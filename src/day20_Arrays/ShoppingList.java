package day20_Arrays;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalPrice = 0;

        System.out.println("Welcome to Cydeo Market");

        String items[] = new String[5];
        double prices[] = new double[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Please enter item name");
            items[i] = input.next();

            System.out.println("Please enter the price of item");
            prices[i] = input.nextDouble();
        }

        input.close();

        for (int i = 0; i < 5; i++) {
            System.out.println(items[i] + " -- " + prices[i]);
            totalPrice += prices[i];

        }

        System.out.println("totalPrice = " + totalPrice);

    }
}

/*

 Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price

 */