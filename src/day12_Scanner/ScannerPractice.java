package day12_Scanner;

// import java.util.*; // wild import --> imports every class from the java.util package

import java.util.Scanner; // regular imports one class

public class ScannerPractice {

    public static void main(String[] args) {

        /*
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
        ...
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number 1~7:");
        byte num = (byte) scan.nextInt();

        String result;

        if (num >= 1 && num <= 7) {
            switch (num) {
                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result = "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result = "Saturday";
                    break;
                default:
                    result = "Sunday";

                    /*
                    result = (num == 1)? "Monday" :(num == 2)? "Tuesday" :(num == 3)? "Wednesday" :(num == 4)? "Thursday"
                    :(num == 5)? "Friday" :(num == 6)? "Saturday" :(num == 7)? "Sunday" : "Invalid Value);
                     */
            }

        } else {
            result = "Invalid Number";
        }

        System.out.println("result = " + result);

        scan.close();
    }
}
