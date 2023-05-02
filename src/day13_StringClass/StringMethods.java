package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char third_char = word.charAt(2);
        System.out.println("third_char = " + third_char);

        /*

        char tenth_char = word.charAt(9);
        System.out.println("tenth_char = " + tenth_char);

        */

        System.out.println("-".repeat(60));

        String s1 = "Batch EU11 is the best batch";
                   //123456789..................28
        int total_characters = s1.length();
        System.out.println("total_characters = " + total_characters);

        char last_char = s1.charAt((s1.length()) - 1); // last index number
        System.out.println("last_char = " + last_char);

        String s2 = new String("BURAK CAN");
        System.out.println(s2.length());
        System.out.println(s2.charAt(s2.length() - 1) );

        System.out.println("-".repeat(60));

        String str = "wooden spoon"; // wooden spoon
        String upperCaseStr = str.toUpperCase();
        System.out.println("upperCaseStr = " + upperCaseStr); // WOODEN SPOON
        String lowerCaseStr = upperCaseStr.toLowerCase();
        System.out.println("lowerCaseStr = " + lowerCaseStr); // wooden spoon
        System.out.println("upperCaseStr = " + upperCaseStr); // WOODEN SPOON



    }
}
