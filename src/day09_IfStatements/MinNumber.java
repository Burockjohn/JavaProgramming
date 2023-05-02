package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 200,
                n2 = 100;

        boolean minNumber = n1 < n2,
                maxNumber = n2 < n1,
                equal = n1 == n2;

        if (minNumber) {
            System.out.println(n1 + " is Min");
        }

        if (maxNumber) {
            System.out.println(n2 + " is Min");
        }

        if (equal) {
            System.out.println("equal");
        }



    }

}

/*
Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */