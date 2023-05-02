package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //age: 36 years old

        byte age = 36;

        //weight: 205 pounds

        short weight = 205; //205 is out of range of "byte", so we need to use "short" at least

        //salary: 40000 TRY

        int salary = 40_000;
        /*
        40000 is out of short' range, so we need to use "int" instead of "short"
        "int" is preferred data type for integer numbers
         */

        long asset = 3_333_333_333L; //to get rid of the compile error we need to use "L" so the Java can understand the primitive type as "long"

        //tax: 0.26

        float tax = 0.26F; // float can be used but double is preferred. Also, to use float, we need to type "F" at the end of number
        double PI = 3.14;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char gender = 'M';
        char grade = 'A';
        char yesNo = 'Y';

        System.out.println("gender = " + gender);

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "Ankara";
        String country = "Turkey";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("country = " + country);


    }


}
