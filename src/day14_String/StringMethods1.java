package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "     batch EU11     ";
        String str2 = str1.trim(); // "batch EU11" --> trim method removes the white spaces which is not used to separate words

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("-".repeat(60));

        String str3 = "Cydeo School";
        System.out.println(str3.indexOf('o' )); // 4
        System.out.println(str3.lastIndexOf('o' )); // 10 --> totally opposite to indexOf method,
        // it searches the look for starting from right to left
        System.out.println(str3.indexOf("ool")); // 9

        String str4 = "Java Programming Language"; // to find the index of third 'a'
        int n1 = str4.indexOf("amm"); // 10
        System.out.println(n1);

        System.out.println("-".repeat(60));

        String s = "Java Nova Cava Wawa orange";
        //          012345

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        // int fourthA = s.indexOf("ava W");
        // int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        // int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.lastIndexOf("a W") ;
        int sixthA = s.lastIndexOf("aw");
        //int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);


    }
}
