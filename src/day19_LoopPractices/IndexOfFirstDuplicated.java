package day19_LoopPractices;

public class IndexOfFirstDuplicated {

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

            if (counter > 1) {
                result = ch;
                break;
            }

        }

        System.out.println(str.indexOf(result));

    }
}

/*

2. Write a program that cna return the index number of the first duplicated character from a string

 */