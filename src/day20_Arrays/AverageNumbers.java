package day20_Arrays;

import java.util.Scanner;

public class AverageNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. Ask the user how many numbers they want to enter
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();

        // 2. get all the inputs from the user and store them into an array
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // 3. Iterate the array & return the average number
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / n;
        System.out.println("The average of the values is: " + average);

        input.close();

    }
}
