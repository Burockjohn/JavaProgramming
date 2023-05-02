package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

         /*
        System.out.println( true == !false ); // true
        System.out.println( !true != false ); // false
        System.out.println( !false == true); // true
        System.out.println(!!false); //false
        System.out.println(!!!true); // false
         */

        int score = 85;

        boolean a = score >= 90 && score <= 100, // false
                b = score >= 80 && score <= 89, // true
                c = score >= 70 && score <= 79, // false
                d = score >= 60 && score <= 69, // false
                e = score >= 0 && score <= 59; // false

        if (a) {

            System.out.println("Excellent");
        }

        if (b) {

            System.out.println("Great");
        }

        if (c) {

            System.out.println("Good");
        }

        if (d) {

            System.out.println("Passed");
        }

        if (e) {

            System.out.println("Failed");
        }





    }

}

/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */