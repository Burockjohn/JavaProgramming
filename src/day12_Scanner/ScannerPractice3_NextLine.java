package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: "); // Burak CanENTER

        String name = input.nextLine();

        System.out.println("Enter your Programming Language: "); // Java Programming LanguageENTER

        String prgramming = input.nextLine();

        System.out.println("Enter your age: "); // 36ENTER --> ignore the ENTER by Int, but ENTER left in the scanner's memory
        int age = input.nextInt();

        input.nextLine(); // in order to enter the school name or ,n order to take out ENTER keyword, we have to provide one addition nextLine()

        System.out.println("Enter your school name");
        String scholl = input.nextLine(); //ENTER (SYAL) will not be written because of 'ENTER" which remained in the scanner's memory

        System.out.println("name = " + name);
        System.out.println("prgramming = " + prgramming);
        System.out.println("age = " + age);
        System.out.println("scholl = " + scholl);

        input.close();

    }

}
