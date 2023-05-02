package day20_Arrays;

import java.rmi.ServerError;
import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) { // [] reserved for the array

        //create a variable that's capable enough to contain 5 names

        String names[];
        names = new String[5]; // 0~4
        names[0] = "Gunay";
        names[1] = "Neira";
        names[2] = "Suat";
        names[3] = "Hulya";
        names[4] = "Mikael";

        //  System.out.println(names); // hashcode

        System.out.println(Arrays.toString(names)); // "Gunay", "Neira", "Suat", "Hulya", "Mikael"

        System.out.println("-".repeat(60));

        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number < 1 || number > 7) {
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);


    }
}
