package day18_NestedLoops;

public class NestedLoopPractice2 {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                System.out.print("* ");

            }
            System.out.println();

        }

        System.out.println("----------------------------------------------");


        for (int i = 1; i <= 10; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }

    }
}

/*

1. Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *

 */

/*

Print the following shape by using a nested Loop:
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 * * * * * * * * *
 * * * * * * * * * *

 */