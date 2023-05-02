package day01_JavaIntro;

import utilites.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "aaaaaaaaaaaaaaabbbbbbbbbbbbbbbcccccccccccccccc";

        str = StringUtility.removeDuplicates(str);

        System.out.println("str = " + str);

        str = StringUtility.reverse(str);

        System.out.println(str);

    }
}
