package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {
        // substring (beginning index, ending index)

        String word = "Cydeo School";
        //             012345

        String brand = word.substring(0,4+1);
        System.out.println("brand = " + brand);

        String str = word.substring(6);
        System.out.println("str = " + str);

        String word2 = "Java Programming Language";
        String str1, // "Java"
                str2, // "Programming"
                str3; // "Language"

        str1 = word2.substring(word2.indexOf("J"), word2.indexOf(" "));
        str2 = word2.substring(word2.indexOf("P"), word2.indexOf(" L") );
        str3 = word2.substring(word2.indexOf("L"));

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        System.out.println("-".repeat(60));

        String word3 = "Python C# Ruby";

        String s1 = word3.substring(0, word3.indexOf(" "));
        String s2 = word3.substring(word3.indexOf(" ") + 1, word3.lastIndexOf(" "));
        String s3 = word3.substring(word3.lastIndexOf(" ") + 1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

    }
}
