package day19_LoopPractices;

public class AppearedTwice {

    public static void main(String[] args) {

        String str = "aaabbccccddeeeeee",
                result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int counter = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch == each) counter++;
            }

            if (counter == 2) {
                if (result.contains("" + ch)) {
                    continue;
                }
                result += ch;
            }

        }

        System.out.println(result);

    }
}

/*

3. Write a program that can display all the characters that appeared twice in the string.

 */