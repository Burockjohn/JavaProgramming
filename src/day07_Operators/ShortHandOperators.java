package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment: =
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number); //200

        String word = "Java Programming";
        System.out.println("word = " + word); // Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word); // Wooden Spoon

        word = "Cydeo";
        System.out.println("word = " + word); // Cydeo

        System.out.println("---------------------------------------");



        // Addition Assignment:
        int x = 100;
        System.out.println("x = " + x); // 100
        System.out.println(x + 200); // 300
        System.out.println("x = " + x); // 100
        x += 200; //x = x + 200;
        System.out.println("x = " + x); // 300

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str); // Wooden Spoon

        System.out.println("--------------------------------------");

        double availableBalance = 1000.50;

        // deposit 300$
        availableBalance += 300;  // availableBalance = 1000.50 + 300

        System.out.println("availableBalance = " + availableBalance); //1300.5


        System.out.println("----------------------------------------");

        // withdrawing 500$

        availableBalance -= 500;  // availableBalance = 1300.5 - 500;

        System.out.println("availableBalance = " + availableBalance);

        // withdrawing 200$, then depositing 400$

        availableBalance -= 200; //available balance = 600.5
        availableBalance += 400; //available balance = 1000.5

        System.out.println("availableBalance = " + availableBalance);


        System.out.println("----------------------------------------");

        double salary = 50_000.50;
        System.out.println("salary = " + salary); //50000.5

        salary *= 2;
        System.out.println("salary = " + salary); //100001.0

        double dodge = 0.00000001;
        dodge *= 1_000_000;
        System.out.println("dodge = " + dodge);

        System.out.println("----------------------------------------");

        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2); // 12500

        System.out.println("----------------------------------------");

        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3); // 1

        int amount = 127; //cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("----------------------------------------");

        int cents2 = 127;

        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("----------------------------------------");

        int y = 300;
        y %= 16;
        System.out.println("y = " + y); //12




    }

}
