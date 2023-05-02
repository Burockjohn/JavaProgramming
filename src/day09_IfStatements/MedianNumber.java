package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 17,
                b = 15,
                c = 16;

        boolean aMedian = (a < b && a > c) || (a > b && a < c),
                bMedian = (b < a && b > c) || (b > a && b < c),
                cMedian = (c < b && c > a) || (c > b && c < a);

        if (aMedian) {
            System.out.println("a could be median number");
        }

        if (bMedian) {
            System.out.println("b could be median number");
        }

        if (cMedian) {
            System.out.println("c could be median number");
        }


    }

}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */