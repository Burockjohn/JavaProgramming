package day24_CustomMethod_Return;


import static utilites.StringUtility.*;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";

        // String result = reverse(str);

        String result = reverse(str);

        System.out.println(result);

        if(str.equalsIgnoreCase(result)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }



    }

    /* public static String reverse(String str) { // it is already exist in StringUtility class under utilities package

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;

    }

     */
}
