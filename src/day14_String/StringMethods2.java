package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); // "Python is fun, I love learning Python"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        String gmail = email.replace("yahoo","gmail");

        System.out.println("email = " + email);
        System.out.println("gmail = " + gmail);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python ", "").replace("Python",""); // "Java Java C# C# C++ C++"
        System.out.println("sentence2 = " + sentence2);

        System.out.println("-".repeat(60));

        String s = "Dog Dog Dog Dog Dog Dog";
        System.out.println(s.replaceFirst("Dog", "Cat")); // "Cat Dog Dog Dog Dog Dog"


    }
}
