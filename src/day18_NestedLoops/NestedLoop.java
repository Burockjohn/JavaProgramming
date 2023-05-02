package day18_NestedLoops;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("--------------------------------------");

        int num = 1;

        while (num < 5) {

            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }
            num++;

        }


    }
}
