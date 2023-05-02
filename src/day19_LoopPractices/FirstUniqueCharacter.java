package day19_LoopPractices;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "abcdcefgghbe";
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int counter = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch == each) {
                    counter++;
                }
            }

            if (counter == 1) {
                result = ch;
                break;
            }

        }

        System.out.println("result = " + result);


    }
}

/*

4. Write a program that can return the index number of the first unique character.


 */