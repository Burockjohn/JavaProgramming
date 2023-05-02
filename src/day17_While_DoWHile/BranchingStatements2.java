package day17_While_DoWHile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i < 'F'; i++) {

            if (i == 'C') {
                continue;
            }

            System.out.print(i + " "); // A B D E
        }

        System.out.println();
        System.out.println("-----------------------------------");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);

        }

    }
}
